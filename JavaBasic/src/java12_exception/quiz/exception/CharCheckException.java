package java12_exception.quiz.exception;
//사용자 정의 예외 클래스
public class CharCheckException extends Exception { // 사용자 정의 예외
	@Override
	public String getMessage() {

//		return "에러 메시지!";
		return "체크할 문자열 안에 공백 포함할 수 없습니다.";
	}
}
