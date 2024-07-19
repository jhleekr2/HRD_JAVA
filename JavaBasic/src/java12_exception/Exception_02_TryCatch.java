package java12_exception;

import java.util.Arrays;

public class Exception_02_TryCatch {
	public static void main(String[] args) {
		
//		** 예외 처리(Exception Handling)
//		발생할 수도 있는 예외적인 상황을 대비하는 코드를 작성하는 것
//		
//		예외 처리 구문
//		- 프로그램 실행 중 예외 상황이 발생하면 프로그램이 종료된다
//		- JVM이 예외 상황을 Exception 객체로 생성하여 Throw 해준다
//		- 프로그램 실행 중 던져진 Exception 클래스를 확인할 수 있다
//		→ 콘솔에 출력해서 확인한다
//		- 던져진 Exception 객체를 관리하고, 프로그램이 종료되지 않도록 조절하여
//		정상적인 흐름으로 되돌아가도록 “예외 처리” 해야 한다
//		→ 예외 처리 구문 (try~catch 구문)을 사용한다.
		
//		try~catch 구문 형식
//		try {
		// try블록
		//예외 발생이 예측되는 코드
//		} catch( Exception e ) { //← try 블록에서 발생한 예외 객체를 저장할 변수
		// catch블록
		// try블록에서 예외 발생 시 프로그램 종료되지 않고 실행할 코드를 작성한다
		//예외 정보 객체인 e변수를 사용할 수 있다
		//예외 처리를 다음 코드로 대신하는 경우가 많다
//		e.printStackTrace();
//		} finally {
		//finally 블록
		//try블록에서 예외가 발생하면 catch블록 실행 후 실행한다
		//예외가 없으면 catch블록 건너뛴 이후 실행한다
		//항상 실행해야 하는 코드를 적는 블록
		//finally블록은 생략 가능하다
//		}
		
		int[] arr = new int [5];
		
		int i = 0;
		
//		while( true ) {
//			
//			//예외상황 처리
//			// -> 전통적인 방식의 예외처리
//			if( i >= arr.length) {
//				break;
//			}
//			arr[i] = i+1; // 예외 발생 지점
//			i++;
//		}
		//새로운 방식 - try ~ catch문을 이용한 방식
		
			try {
				while( true ) {
				
				arr[i] = i+1; //예외 발생 지점
				i++;
				
				}
				
		} catch( ArrayIndexOutOfBoundsException e ) {
			
			//컴퓨터의 표준 스트림 - 3개(Sysin, Sysout, Syserr)
			//Sysin, System.in - 표준 입력 스트림
			
			//sysout, System.out - 표준 출력 스트림 (모니터 콘솔)
			
			//syserr, System.err - 표준 출력 스트림 (모니터 콘솔)
			
//			System.out.println("예외 발생!");
//			System.err.println("예외 발생!"); // 붉은색으로 예외상황을 출력
			
			//예외 상황 출력 메소드
			e.printStackTrace(); // 이때는 빨간색으로 오류를 출력하지만, 프로그램 자체는 정상적으로 실행되었다.
			//개발자가 프로그램 예외 확인을 위해서 많이 사용한다.
		}		
		System.out.println("+ + + 정상 흐름 + + +");
		
		System.out.println(Arrays.toString(arr));
	}
		
		
}

