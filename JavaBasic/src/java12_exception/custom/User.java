package java12_exception.custom;

public class User {
	
	private int age;
	//나이에 음수가 입력되었을 때 잘못된 입력을 거부하기 위해 사용자가 임의로 예외를 발생시키려 한다.
	//기존의 Scanner를 이용한 처리법보다 좀더 세련된 방법이지만 어렵다.
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) throws UserAgeException { //예외 상황에 대한 책임을 caller에게 떠넘기기
			
		//입력된 나이가 0~150이 아닌 경우
		// -> 정상적이지 않은 상황으로 정의한다
		// -> 예외 상황으로 정의
		if( age < 0 || age > 150) {
			
//			System.out.println("나이는 0~150사이로 입력하세요");
//			return; // 전통적인 처리방법
			
			//예외 발생시키기
			throw new UserAgeException();
		}

		this.age = age;
	}
	
}
