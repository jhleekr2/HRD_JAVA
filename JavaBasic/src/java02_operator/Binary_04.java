package java02_operator;

public class Binary_04 {
	public static void main(String[] args) {
		
		//이항 연산자 - 관계, 비교
		
		// <	less than(lt)
		// >	greater than(gt)
		
		// <=	less than equal(le)
		// >=	greater than equal(ge)
		
		// ==	equal(eq)
		// !=	not equal(ne)
		
		// 왼쪽 피연산자를 기준으로 오른쪽 피연산자를 비교한다.
		// 비교 결과를 참/거짓으로 반환한다.
		
		// -> boolean 타입으로 티런한다
		// ( true / false )
		// -----------------------------------------------------
		
		int num1 = 11;
		int num2 = 22;
		
//		System.out.println("num1 == num2 : " + num1 == num2);
//		System.out.println("num1 == num2 : 11" == num2);
//		String == int -> 에러 
		System.out.println("num1 == num2 : " + (num1 == num2));
		// == -> 질문이라고 생각하자(같냐?) 그렇다(T), 아니다(F)
		System.out.println("num1 != num2 : " + (num1 != num2));
		
		System.out.println("num1 < num2 : " + (num1 < num2));//True
		System.out.println("num1 > num2 : " + (num1 > num2));//False
		
		System.out.println("num1 <= num2 : " + (num1 <= num2));//True
		System.out.println("num1 >= num2 : " + (num1 >= num2));//False
		
		// -----------------------------------------------------
		boolean result = num1 == num2;
		System.out.println( "결과 : " + result );
	}
}
