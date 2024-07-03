package java04_control.selection;

public class Switch_02 {
	public static void main(String[] args) {
		
		int num = 30;
		
		if( num == 10 ) {
			System.out.println("10입니다");

		} else if( num == 20 ) {
			System.out.println("20입니다");

		} else if( num == 30 ) {
			System.out.println("30입니다");

		} else {
			System.out.println("10, 20, 30 모두 아닙니다");

		}
		//----------------------------------------------------
		
		// switch는 범위 비교를 할 수 없다.
		// -> if문을 사용해야 한다.
		
		int score = 88;
		
		if( score >= 90 ) {
			System.out.println("A");
		} else if( score >= 80 ) { // 여기서 80이상 90미만이라는 뜻이 포함되어 있다.
			System.out.println("B");
		} else if( score >= 70 ) {
			System.out.println("C");
		} else if( score >= 60 ) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}
