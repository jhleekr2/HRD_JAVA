package java12_exception.quiz.exception;

public class NumberRangeException extends Exception {
	@Override
	public String getMessage() {

//		return "에러 메시지!";
		return "1부터 100사이의 값이 아닙니다.";
	}
}
