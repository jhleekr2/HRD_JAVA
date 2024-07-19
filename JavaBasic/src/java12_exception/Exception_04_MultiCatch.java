package java12_exception;

public class Exception_04_MultiCatch {
	public static void main(String[] args) {
		
		//** catch블록 구문은 여러 개 작성할 수 있다
		// -> 다양한 예외 객체를 개별적으로 처리할 때 사용한다
		// -> 제일 마지막으로 Exception e를 처리하는 catch를 둔다
		
		try {
			//예외 발생이 예측되는 코드를 작성한다
			
		} catch(NullPointerException e) {
			//NullPointerException 예외 발생 시 처리한다
			e.printStackTrace();
		} catch (ArithmeticException e) {
			//ArithmeticException 예외 발생 시 처리한다
			e.printStackTrace();
		} catch (Exception e) {
			//NullPointerException 과 ArithmeticException 예외를 제외한
			//나머지 예외 발생 시 처리한다
			e.printStackTrace();
		}
		//다중 예외 처리시에는 부모 객체 쪽일수록 아래쪽에 적어줘야 한다.
		//블록마다 적혀있는 e는 지역 변수처럼 작동한다.
		
		//-----------------------------------------------------
		
		//Multi Catch구문
		// -> 하나의 catch구문에 여러 예외 클래스를 적용하는 문법(JDK 1.7부터 적용)
		
		try {
		
		} catch (NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException e) {//Multi Catch 구문
			//멀티 캐치 구문
			
			e.printStackTrace();
		} catch (Exception e) {
			//멀티 캐치 구문에 부모 타입 Exception을 같이 적용하지 않는다.(에러 발생)
			
			e.printStackTrace();
		}
	
	}
}
