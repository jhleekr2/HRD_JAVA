package java04_control.condition;

public class IfElse_01 {

	public static void main(String[] args) {
		
//		if( 조건식 ) {
			// 조건식이 true일 때 실행할 코드를 작성하는 영역
//		} else {
			// 조건식이 false일 때 실행할 코드를 작성하는 영역
//		}
		// else는 반드시 if와 연결되어 있어야만 한다. 그렇지 않으면 오류가 발생한다.
		// else문의 위치는 if문의 마지막 부분에 위치
		
		// ------------------------------------------------
		
		int num = 11;
		
		if (num == 11) {
			System.out.println("num은 11입니다.");
		}
		else {
			System.out.println("num은 11이 아닙니다.");
		}
	}
}
