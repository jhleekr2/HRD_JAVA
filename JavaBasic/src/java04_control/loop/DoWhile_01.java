package java04_control.loop;

public class DoWhile_01 {
	public static void main(String[] args) {
	
		// do-while loop
		// 이전의 다른 반복문과 달리 코드 형태가 달라서 자주 사용되지는 않는다.
		
//		do {	
//			// 반복 수행하는 코드 영역
//		} while( 조건식 );
		
		//** 처음으로 do 키워드를 만나면 조건 검사없이 {} 중괄호영역을 실행한다.
		
		//** 이후에 조건 검사를 하고 true면 do부터 다시 실행, false면 중단
		
		// -> 최초 1회는 무조건 실행하고 다음부터 조건에 따라 반복을 결정한다.
		
		//--------------------------------------------------------
		
		//무한 루프
//		do {
//			System.out.println("Apple");
//		} while( true );
		
		//--------------------------------------------------------

		//** 조건에 상관없이 1번은 실행한다 -> 현실적으로 프로그래밍에서 사용할 일은 많지 않다.

		do {
			System.out.println("Banana");
		} while( false );

	}
}
