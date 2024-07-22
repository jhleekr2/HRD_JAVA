package java13_io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class EchoEx {
	public static void main(String[] args) {
		
		//키보드 입력스트림 -> 프로그램 -> 모니터 출력 스트림
		//-----------------------------------------------------------
		
		InputStream is = System.in; // 표준 입력 스트림
		OutputStream os = System.out; // 표준 출력 스트림
		
		byte[] buf = new byte[1024]; //입출력 데이터의 임시 저장소 
		// 이런식의 byte 버퍼 배열은 메모리 공간낭비가 심해지지 않는 선에서 클수록 좋다
		// 이때 연구결과 속도도 빠르면서 공간낭비도 줄일 수 있는 적절한 버퍼 크기는 1024가 적절하다고 한다(32비트 시스템 기준).
		// 64비트에서는 일반적으로 4096을 적절한 버퍼 크기로 보고 있다.
		int len = -1; //입력 데이터의 길이
		
		try {
			
			//입력 데이터가 EOF가 될 때까지 반복적으로 입력한다.
			while( ( len = is.read(buf)) != -1 ) {
			
				//입력 받은 데이터를 출력한다
				os.write(buf, 0, len);
				
				//출력 버퍼 비우기(입력할때 마다 flush해도 좋고, 입력 끝난후(while문 바깥에서) flush해도 좋다)
				os.flush();
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {//try-catch문의 finally구문을 가장 제대로 활용하는 부분이 Stream과 Stream으로 이루어진 네트워크부분이다.
			
			try {
				//입력 스트림 닫기
				if(is!=null)	is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				//출력 스트림 닫기
				if(os!=null)	os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
	//try-catch문 문제점 - 단 4줄의 코드 수행 위해 try-catch문을 정석적으로 넣은 결과
	//거의 2페이지에 가까울 정도의 긴 코드가 나왔다.
	//자바의 단점 - 너무 장황한 코드!
	//자바의 System.out.println()메서드의 경우는 수행 속도를 상당히 떨어뜨린다.
	//자바의 너무나도 장황한 try-catch문의 단점을 보완하기 위해 훗날 try - with - resources 구문이 추가되었다.