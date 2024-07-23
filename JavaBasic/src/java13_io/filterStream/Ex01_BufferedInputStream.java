package java13_io.filterStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex01_BufferedInputStream {
	public static void main(String[] args) {
		
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
