package java12_exception;

	//	Checked Exception
	//	- Exception 클래스의 자식 클래스
	//	- RuntimeException 클래스의 하위 클래스가 아닌 클래스
	//	- try~catch 구문을 이용한 예외 처리가 반드시 필요하다
	//	- 예외 처리 구문을 적용하지 않으면 문법 에러가 발생한다
	//	
	//	Unchecked Exception
	//	- RuntimeException 클래스의 하위 클래스들
	//	- 반드시 예외 처리 구문을 작성하지 않아도 된다
	//	- 예외 처리를 하지 않아도 컴파일 에러는 없다
	//	

class ThrowsTest {
	
	public void method1() throws RuntimeException {
		//Unchecked 예외 발생
		throw new RuntimeException();
	
	}
	
	public void method2() throws Exception {
	
		//Checked 예외 발생
		throw new Exception(); //발생한 예외에 대한 책임을 지지 않고 미룬다(throws 사용).
		// 예외책임을 안지고 미룸으로서 몇몇 상황에서의 문법 에러를 발생하지 않도록 한다
	}
}

public class Exception_06_throws {
	public static void main(String[] args) {
	
		//throws 키워드
		// 예외 처리 떠넘기기
		// 예외 처리 미루기
		
		// 예외가 발생한 메소드에서 직접 예외처리(try~catch)를 하지 않고 자신을 호출한
		//메소드(Caller, 콜러)에게 예외 처리를 떠넘기는 키워드
		
		// 예외가 발생한 상황에 대한 책임을 Caller에게 묻는 것이다
		// -> 코드를 개발하는 사람이 try~catch를 적용해야만 한다
		
		//-----------------------------------------------------------------------------
		
		ThrowsTest tt = new ThrowsTest();
		 
		try {
			tt.method1(); //Unchecked
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		//Unchecked Exception에 대한 예외 처리
		// -> 문법 오류는 없지만 직접 예외 처리를 해야 한다
		
		//Checked 예외 처리
		try {
			tt.method2(); //Checked
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		// 예외처리 문법오류가 발생했을 때 컴파일러 해결방법 제안에서 Add throws declaration은 
		//하면 안된다. 하면 메인 메소드에 throws가 걸려버린다. 이는 아주 위험한 코딩 습관!
	}
}
