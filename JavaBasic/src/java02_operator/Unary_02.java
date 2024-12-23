package java02_operator;

public class Unary_02 {
	public static void main(String[] args) {
		
		//단항 연산자 - 증감
		
		// ++ 증가 연산자
		// -- 감소 연산자
		
		// 피연산자로 적용한 변수에 저장된 값을 1 증가(감소)
		// 변수의 값이 변경된다.
		
		int num;
		
		num = 15;
		
		num++; // num변수에 저장된 값을 1 증가시킨다.
		System.out.println( num ); // 16
		
		++num; // num변수에 저장된 값을 1 증가시킨다.
		System.out.println( num ); // 17
		
		System.out.println("--------------------------");
		
		num = 15;
		
		num--; // num변수에 저장된 값을 1 감소시킨다.
		System.out.println( num ); // 14
		
		--num; // num변수에 저장된 값을 1 감소시킨다.
		System.out.println( num ); // 13
		
		// 단항 연산자가 단독으로 쓰였을 때는 num++와 ++num의 차이가 없지만, 다른 연산자가 같이 쓰이게 되면 차이가 발생한다.
		
		System.out.println("--------------------------");
		
		num = 15;
		
		System.out.println( num );//감소연산자 적용, 후치, 후위
		System.out.println( num-- ); // 동작은 1 감소시키지만 무엇을 반환하느냐? 반환값은 15지만 변수는 14로 변화
		System.out.println( num ); // 값을 불러오고 감소
		
		System.out.println("--------------------------");
		
		num = 15;
		
		System.out.println( num );//감소연산자 적용, 전치, 전위
		System.out.println( --num ); // 동작은 1 감소시키지만 무엇을 반환하느냐? 반환값과 변수가 모두 14로 변화
		System.out.println( num ); // 감소시키고 값을 불러옴
		
		//** 전위 증감연산자는 변수의 값을 불러오기 전에 증감한다
		//** 후위 증감연산자는 변수의 값을 불러온 후에 증감한다
		
		System.out.println("--------------------------");

		num = 13;
		
		int result = num++-10-++num;
//		num값과 result값은?
//				   = num++ - 10 - ++num
//				   = (13)-10-(++num) -> num값이 14
//				   = (13)-10-(15) -> num값이 15
//				   = -12
//				   
//				   result = -12, num = 15
		System.out.println("result : " + result);
		System.out.println("num : " + num);
		
	}
}
