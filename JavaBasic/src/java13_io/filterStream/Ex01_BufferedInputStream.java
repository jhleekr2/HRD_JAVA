package java13_io.filterStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex01_BufferedInputStream {
	public static void main(String[] args) {
		
//		보조스트림(FilterStream)
//		- FilterInputStream : 입력스트림의 보조 클래스
//		- FilterOutputStream : 출력스트림의 보조 클래스
//		** 입력스트림, 출력스트림 - 1차 스트림
//		** 입출력스트림의 보조 클래스 - 2차 스트림
//
//		BufferedStream
//		- 클래스 내부에 존재하는 버퍼 메모리를 이용하여 입출력 속도를 개선한다
//		- 입출력 스트림의 입출력(read(), write() 호출) 횟수를 줄여 성능을 향상시킨다
//		- 성능 향상이 확실한 편이어서 스트림을 다룰 때 거의 기본으로 적용한다
//
//		DataStream
//		- 자바 기본 자료형으로 형식을 유지하면서 입출력하도록 기능을 제공한다
//		- 자료형에 맞는 입출력 메소드가 존재한다
//		** ObjectStream의 편의성에 밀려 잘 쓰이지 않는다.
//
//		ObjectStream
//		**기존 DataStream의 자식으로 DataStream의 모든 기능을 포함하며, 객체 형태로 입출력한다.
//		- 객체 단위로 입출력할 수 있도록 기능을 제공한다
//		- DataStream의 기능을 모두 사용할 수 있다
//		- 입출력에 사용되는 객체는 직렬화가능 하게 만들어야 한다
//		→ interface Serializable을 상속한다
//		- ArrayList같은 컬렉션 객체들도 객체 형태를 유지하면서 입출력할 수 있다
//		→ 요소들도 포함해서 스트림 통신 가능하다
//		
		
		//입력 대상 파일
		File file = new File("./src/java13_io/fileStream/", "Source.txt");
		System.out.println("exists : " + file.exists());
		
		//파일 입력 스트림 객체
//		FileInputStream fis = null; //1차, 파일 입력 기능
		BufferedInputStream bis = null; //2차, 속도 향상 기능
		
		//파일 입력관련 변수
		byte[] buf = new byte[1024];
		int len = -1;
		
		//.read() - 파일을 1바이트씩 읽어들임(속도 느림 + 개발코드가 복잡해짐)
		//.read(byte[n]) - 파일을 n바이트씩 읽어들임(속도 빠름 + 개발코드의 편의)
		// -> .read() 함수를 많이 호출할수록 속도가 느려진다.
		
		try {
			//파일 입력 스트림 생성
//			fis = new FileInputStream(file); //1차, File -> FileInputStream
//			bis = new BufferedInputStream(fis); //2차, FileInputStream -> BufferedInputStream
			//fis를 먼저 만들고 bis를 만들었다(bis는 fis에 의존적) -> close할때 fis 먼저 close하면 안된다.
			
			//2차스트림으로 한번에 생성하기
			// File -> FileInputStream -> BufferedInputStream
			bis = new BufferedInputStream( new FileInputStream(file) );
			
			// 파일 입력
			while( (len = bis.read(buf)) != -1 ) {
				System.out.print( new String(buf, 0, len) );
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace(); 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				//스트림 닫기
				// -> 의존적인 관계의 객체는 생성된 순서의 역순으로 처리
				if(bis!=null)	bis.close();
				// 1차스트림에 연결된 2차스트림은 .close()하면
				//1차스트림까지 자동으로 .close()된다.
//				if(fis!=null)	fis.close();
				//실제 API 내부적으로 2차 스트림인 보조스트림을 close해주면 1차 스트림도 같이 닫히는 걸로 되어 있다.
				//따라서, fis.close()를 추가로 할 필요가 없다(물론 추가로 close해줘도 상관없음).
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
