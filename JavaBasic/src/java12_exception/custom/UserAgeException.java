package java12_exception.custom;

//public class UserAgeException extends RuntimeException {
public class UserAgeException extends Exception {
	//사용자 정의 예외 클래스는 반드시 Exception이나(checked), RuntimeException(unchecked) 의 자식이어야 한다. 
	//일반적으로 Exception의 자식으로 개발하는 경우가 많다. 
	
	@Override
	public String getMessage() {

//		return "에러 메시지!";
		return "나이는 0~150사이로 입력하세요";
	}
}
