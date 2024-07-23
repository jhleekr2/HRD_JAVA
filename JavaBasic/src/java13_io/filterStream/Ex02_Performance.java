package java13_io.filterStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02_Performance {
	public static void main(String[] args) {
		
		//수행 시간 성능 평가
		// -> 코드(로직)의 수행 시간을 측정한다
		
		// 1. 알고리즘 시작 전 현재시간 체크 -> start 변수 저장
		
		// 2. 알고리즘
		
		// 3. 알고리즘 종료 후 현재시간 체크 -> end 변수 저장
		
		// 4. 두 시간의 차이를 구한다
		// -> 알고리즘 수행 시간
		// -> end - start
		
		//-------------------------------------------------------------------
		
		//** System.currentTimeMillis(0;
		// 현재시간(Epoch Time)을 밀리초 단위로 반환한다.
		
		long start = System.currentTimeMillis();
		
		//로직 수행
		
		long end = System.currentTimeMillis();
		
		System.out.println("수행 시간 : " + (end-start));
		
		//아무것도 안했을 경우는 실행 결과가 0이 나오는게 정상
		//-------------------------------------------------------------------

		//입력 대상 파일
		File file = new File("./src/java13_io/fileStream/", "Source.txt");
		System.out.println("exists : " + file.exists());
		
		//파일 입력 스트림 객체
		FileInputStream fis = null; //1차, 파일 입력 기능
		BufferedInputStream bis = null; //2차, 속도 향상 기능
	
		//파일 입력관련 변수
		byte[] buf = new byte[1024];
		int len = -1;
	
		try {
			//파일 입력 스트림 생성
			fis = new FileInputStream(file);
			//여기서는 fis와 bis가 같은 파일의 입력스트림으로 되어 있지만, 서로 다른 스트림으로 연결되어 있다.
			start = System.currentTimeMillis();
			//buffered가 없는 read
			while( (len = fis.read(buf)) != -1 );
			end = System.currentTimeMillis();
			
			System.out.println("fis : " + (end-start));
			
			//2차스트림으로 한번에 생성하기
			// File -> FileInputStream -> BufferedInputStream
			bis = new BufferedInputStream( new FileInputStream(file) );
			
			start = System.currentTimeMillis();
			///buffered가 있는 read
			while( (len = bis.read(buf)) != -1 );
			end = System.currentTimeMillis();
			
			System.out.println("bis : " + (end-start));

		} catch (FileNotFoundException e) {
			e.printStackTrace(); 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(fis!=null)	fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				//스트림 닫기
				// -> 의존적인 관계의 객체는 생성된 순서의 역순으로 처리
				if(bis!=null)	bis.close();
				// 1차스트림에 연결된 2차스트림은 .close()하면
				//1차스트림까지 자동으로 .close()된다.
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		// 학원 실습 환경에서(i7-8700, DDR4 16GB 환경)에서 실행한 결과
		// fis : 102-105 (버퍼 크기 = 1024 기준)
		// bis : 25-26
		// 정도가 나온다.
		// 좀더 테스트 해본 결과, 버퍼 크기 4096-8192 사이에서 속도가 가장 빠르게 나온다.
		// 해당 코드에선 4096에서 fis수치가 35전후가 나오며 8192정도가 되면 fis수치가 bis수치와 비슷해진다. 
		// 문제는, 최적화된 버퍼 크기는 실행 환경마다, 프로그램 코드마다 다르기 때문에 버퍼크기 정하는것은
		// 수차례 코드 테스트를 해보면서 정할 필요가 있다. 아니면, 그냥 버퍼크기 정하지않고 컴퓨터가 최적화된
		// 버퍼 크기를 미리 정해주는 BufferedInputStream API를 활용하자.
	}
}
