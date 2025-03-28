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
		
		System.out.println("-----------------");
		//----------------------------------------------------------

		// 제어문은 다음에 오는 코드 한 개 또는 {} 중괄호 블록 하나에만 영향을 준다.
		
		if (false)
			System.out.println("11111"); // 실행되지 않는다
		System.out.println("22222"); // 실행된다
			
		// 제어문에 적용할 코드가 한 줄이어도 {} 중괄호를 쓰는 습관을 들이자
		System.out.println("-----------------");
		
		if(false)
			; // 세미콜론 : 앞쪽 코드가 끝났다면서 마무리함 - 아무것도 없는채로 끝낸다.
			// 자동차의 공회전을 생각하면 된다. 어셈블리어 기준 NOP(No OPeration).
		{
			System.out.println("HI");
			System.out.println("HELLO");
			System.out.println("HOLA");
		} // if(false) 앞에 세미콜론 없으면 출력되지 않는다.
		
		
	}
}
