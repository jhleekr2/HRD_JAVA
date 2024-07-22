package java12_exception;

public class Exception_05_throw {
	public static void main(String[] args) {
		
		//throw 키워드
		// -> 예외 상황(예외 객체)를 발생시키는 키워드
		
		// -> 개발자가 직접 예외를 발생(throw)시키기 위해 사용한다
		//--------------------------------------------------------------
		
		String str = null;
		
		//예외 발생 지점, NullPointerException
//		System.out.println( str.length() );
		
		System.out.println("문자열 길이 출력 이후");
		
		//--------------------------------------------------------------
		
		if(str!=null) {
			System.out.println(str.length());
		} else {
			//예외가 발생하는 상황
			
			System.out.println("[예외] 문자열이 null입니다");
			
			//예외 객체를 직접 생성하여 발생시키는 코드
			// -> 예외 상황 던지기
			
//			throw 예외객체
			
//			throw new NullPointerException();
			
		}
		
		System.out.println("-------------------------");
		
		//ArithmeticException - / by zero (divide by zero)
//		System.out.println( 999/0 );
		
		//예외 정보 객체 생성
		ArithmeticException ae = new ArithmeticException();
		
		//예외 던지기 (예외 발생시키기)
//		throw ae;
		
		//** 예외 객체를 생성(new)하는 것은 예외를 발생(throw)시키는 것이 아니다
		
		//** 생성(new) 시점의 정보를 예외 객체에 저장한다
		//** 발생(throw) 시점에 생성 시점의 정보 객체를 던진다(발생시킨다)

		//--------------------------------------------------------------
		
		//throw코드와 new 코드를 한꺼번에 적는 것이 좋다
		
//		throw new ArithmeticException();
		throw new ArithmeticException("문제 상황에 대한 설명");
	}
}
