package java04_control.condition;

public class If_02 {
	public static void main(String[] args) {
		int num = 10;
		
		if(num == 15) {
			System.out.println("HI");
		}
		System.out.println("HELLO");
		
	
	//----------------------------------------------------------
	// {}줄괄호 블록(block)은 여러 개의 코드를 하나로 묶어주는 역할을 한다.
	// 중괄호 자체는 코드 실행 흐름에 영향을 주지 않는다.

		{
			System.out.println("Apple");
			System.out.println("Banana");
			System.out.println("Cherry");
		}
	}
}