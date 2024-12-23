package java02_operator;

public class Binary_05 {
	public static void main(String[] args) {
		
		//이항 연산자 - 논리
		// &&	||	!
		// AND	OR	NOT
		
		// !(NOT) 연산자는 단항 연산자이다. 오른쪽에 피연산자가 온다.
		
		// 피연산자의 데이터타입은 논리형(boolean)이다
		
		// AND연산은 피연산자 모두 true일때만 true
		
		// OR연산은 피연산자 둘 중 하나라도 true일 때 true로 반환한다
		
		// NOT연산은 피연산자의 논리를 부정한다
		// 참은 거짓으로, 거짓은 참으로 바꾼다(부정 연산자) - 한글과는 다름.
		
		// 이 3개를 조합해서 전자장치가 만들어지게 된다.(XOR, NAND, NOR 등)
		// ------------------------------------------------------------------
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("true && false : " + (b1 && b2));//false
		System.out.println("true || false : " + (b1 || b2));//true

		// ------------------------------------------------------------------

		System.out.println("-----------");
		
		int num = 77;
		
		System.out.println( num >= 1);//num변수가 1보다 크거나 같다.true
		System.out.println( num <= 100);//num변수가 100보다 작거나 같다.true
		
		// num변수는 1~100 사이의 값이다.
//		System.out.println( 1 <= num <= 100); // 오류
//		System.out.println( 1 <= 77 <= 100);
//		System.out.println( true <= 100); // 자바에서는 서로 다른 자료형끼리의 연산을 거부해서 오류가 발생한다.
		
		System.out.println( num >= 1 && num <= 100);
		// ------------------------------------------------------------------
		
		System.out.println( !(num >= 1) ); // false
		
		System.out.println( num < 1); //false
		
		// ** !(논리부정) 연산자의 적용
		//		관계연산자를 반대(부정)조건으로 바꾼다.
		//		논리연산자를 && -> ||, || -> && 각각 치환한다.
		
		System.out.println("-----------");
		
		System.out.println( !(num >= 1 && num <= 100) );
//		System.out.println( !(num >= 1) !(&&) !(num <= 100)) ); // 분배법칙 적용
//		System.out.println( num < 1 || num > 100) );
		
		// &와 같은 연산자를 비트 단위 연산자라 부른다.
		
		System.out.println(7 & 9); // 비트 AND
		System.out.println(7 | 9); // 비트 OR
		System.out.println(7 ^ 9); // 비트 XOR
		System.out.println(~7); // 비트 NOT (1의 보수를 구함)
		// 절댓값이 같은 음수 = 2의 보수 = 1의 보수 + 1
		
		// 7과 9를 비트 단위로 연산한다.
		// 자바는 비트 연산을 하기에 적합하지 않아서 국비 과정에서는 생략한다.
		// 비트 연산을 위해서는 C언어를 사용해야 한다.
		// &(AND) |(OR) ~(NOT) ^(XOR)의 4종류가 있다.
		// XOR = eXclusive OR (배타적 OR) = 둘 중 하나만 true일때 true이다. 논리연산자에는 없고, 비트연산자에만 있다.
		// 최상위 비트(MSB)의 경우 음수표시를 하기 때문에 sign bit라고 한다. 최상위 비트가 1이면 음수.
		// 웹쪽에서는 5년차 이후에 필요하거나, 은퇴할 때 까지 전혀 쓰지 않을 수도 있다.
		System.out.println("-----------");
		
		System.out.println( 7 << 2);// 왼쪽 시프트, left shift, 모든 비트를 왼쪽으로 두칸씩 옮기고 뒤에는 0을 추가한다.
		// 비트를 왼쪽으로 한칸씩 옮길때마다 2배씩 늘어난다.
		System.out.println( 7 >> 2);// 오른쪽 시프트, right shift
	
	}
}
