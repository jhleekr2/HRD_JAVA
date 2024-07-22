package java13_io;

import java.io.IOException;
import java.io.OutputStream;

public class TryWithResourcesEx {
	public static void main(String[] args) {
		
		// try - with - resources 구문 (JDK 1.7 에서 추가)
		// 예외 처리 구문
		// try-catch의 변형
		
		// ** 입출력 스트림의 finally를 이용한 .close() 호출을 예외 처리 구문이
		// 대신 처리해준다
		
		// try( 스트림 객체 생성 ) {
		//
		// } catch( 예외 객체 변수 ) {
		//
		// }
		
		// ** try구문이 종료될 때 .close() 메소드를 자동으로 호출해준다.
		// (finally를 안써도 됨)
		// -> AutoCloseable 인터페이스를 상속받아야 가능하다
		
		//------------------------------------------------------------------
		
		//출력할 데이터
		byte[] buf = "AppleBananaCherry".getBytes();
		
		try ( OutputStream os = System.out ) {
			
			os.write(buf, 0, buf.length );
			os.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
