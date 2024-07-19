package java12_exception;

public class Exception_03_TryCatch {
	public static void main(String[] args) {
		
		int num1 = 7;
		int num2 = 0;
		
		//예외 발생 이전에 예외 상황을 제어한다
		if( num2 != 0) {
		System.out.println( num1 / num2 );
	
		} else {
			System.out.println("[ERROR] 나눔수가 0입니다");
		}
		
		System.out.println("----------------------");
		
		//예외가 발생하는지 실행해보고 예외 처리한다
		try {
			
			//예외 발생, divide by zero
			System.out.println( num1 / num2 );
			
		} catch (ArithmeticException e) {
//			System.out.println("[ERROR] 나눔수가 0입니다");
			
			//예외 처리된 객체 정보 확인
			e.printStackTrace();
		}
		
		System.out.println("+ + + 프로그램 정상 종료 + + +");
		
	}
}
