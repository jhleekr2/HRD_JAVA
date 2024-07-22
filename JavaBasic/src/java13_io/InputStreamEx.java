package java13_io;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamEx {
	public static void main(String[] args) {
		
//		InputStream 클래스의 read 메소드
//		public abstract int read() throws IOException
//
//		public int read(byte[] b) throws IOException //이것을 주로 사용한다
//		→ 입력 스트림에서 매개변수 b배열의 길이만큼 데이터를 읽어들인다.
//		→ 한번에 최대로 읽어들일 수 있는 데이터의 크기가 b배열의 길이만큼이다.
//		→ 읽어들인 데이터를 b배열에 저장한다
//		→ 읽어들인 데이터의 길이(개수)를 int형으로 반환한다.
//		→ 더 이상 읽어들일 데이터가 없을 경우 -1을 반환한다
//		** End of Stream == 데이터 스트림의 끝
//		→ 읽어들일 데이터가 더 이상 없는 상황
//		** EOF, End of File == End of Stream
//
//		public int read(byte[] b, int off, int len) throws IOException
		
		//키보드 표준 입력 스트림 객체
		InputStream is = System.in;
		
//		System.out.println("Input : ");
//		
//		try {
//			//int형의 ASCII코드를 반환한다.
//			System.out.println(is.read()); 
//			System.out.println(is.read()); 
//			System.out.println(is.read()); 
//			System.out.println(is.read()); 
//			System.out.println(is.read()); 
//			
//			//이때 버퍼에 남아있는 Enter의 처리 때문에 문제가 생긴다.
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//-------------------------------------------------------------------
		
		//입력 데이터 저장소
		// -> read()메소드의 매개변수
		byte[] buf = new byte[10];
		
		//입력 데이터의 길이
		// -> read()메소드의 반환값 저장
		// -> -1일 경우 EOF
		int len = -1;
		
		//입력한 전체 데이터를 문자열로 저장하는 객체
		StringBuilder sb = new StringBuilder();
		
		//입력한 전체 문자열의 길이
		int total = 0;
		
		
		try {
			System.out.println("<< 입력 대기중 >>");
			//입력 받을 데이터가 스트림에 남아있으면 반복한다
			
			while( ( len = is.read(buf) ) != -1) { // '지금 입력받은 데이터가 마지막이 아니면' 뜻
				// 조건식이 어렵지만 상당히 많이 쓰일 것이다.
				//Ctrl + Z 키(^Z)를 누르면 EOF로 인해 입력을 종료하는데, 이클립스의 콘솔이 가상콘솔이라
				//Ctrl + Z 키가 동작안할 수도 있다. 그러면, 소스창을 클릭후 다시 콘솔창으로 돌아와서
				//Ctrl + Z 키를 누른다.

				//키보드 스트림의 EOF입력
				//Ctrl + Z
				//
//				Arrays.fill(buf, (byte)0); // 굉장히 비효율적인 buf 초기화 방법!
//				System.out.println( Arrays.toString(buf)); // 반복할때마다 buf가 초기화되지 않는 문제점이 있다!
				
//				System.out.println( new String( buf ));
				
//				System.out.println( new String( buf, 0, len));
				//------------------------------------------------------------------
				
				//문자열을 입력받을 때마다 StringBuilder에 추가하기
				sb.append( new String(buf, 0, len) );
				
				//입력받은 길이를 전체 입력 길이 변수에 계산
				total += len;
			
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				//스트림 닫기
				if(is!=null)	is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println();
		System.out.println("<< 전체 입력받은 데이터 >>");
		System.out.println(sb);
		
		System.out.println();
		System.out.println("<< 전체 입력받은 길이 >>");
		System.out.println( total + " B");
	
	}
}
