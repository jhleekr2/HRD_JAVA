package java02_operator;

public class Binary_01 {
	public static void main(String[] args) {
		
		//이항 연산자 - 산술
		// + - * / %
		//------------------------------------------------
		
		int num1=16, num2=7; //피연산자
		
		int result; //연산의 결과값을 저장할 변수
		
		result = num1 + num2;
//		result = 16 + 7; // num1, num2변수의 값을 불러온다
//		result = 23; // 덧셈 연산을 수행한다
		// -> result변수에 결과값 23을 대입한다
		
		System.out.println("덧셈 결과 : " + result);
		System.out.println("-----------------");

		// %
		// 나머지 연산자
		// modular operator
		// mod 연산자
		// 모드 연산자
		num1 = 15;
		num2 = 6;
		// 나눗셈을 수행하고 그 나머지를 결과값으로 나타낸다.
		result = num1 % num2; //왼쪽 숫자를 오른쪽 숫자로 나눈 후 그 나머지를 결과값으로 나타낸다.
		System.out.println(num1 + " 를 " + num2 + " 으로 나눈 나머지 : " + result);
		System.out.println("-----------------");
		//잘못 작성한 코드 - 연산자 우선순위를 고려하지 않음
		System.out.println("num1 + num2 = " + num1+num2);
		//"   " +  -> String + int -> int가 String에 흡수된다!
		//" num1 + num2 = " + 15 + 6 -> "num1 + num2 = 15" + 6 -> "num1 + num2 = 156" -> 화면에 출력
		//대입도 연산자의 일종(연산자 우선순위 최하위)
		System.out.println("-----------------");
		//올바른 코드 - 연산자 우선순위 고려위해, num1과 num2를 괄호로 묶는다.
		System.out.println("num1 + num2 = " + (num1+num2)); // 21
		System.out.println("num1 - num2 = " + (num1-num2)); // 9
		System.out.println("num1 - num2 = " + (num1*num2)); // 90 -> 곱셈이나 나눗셈, 나머지는 괄호로 묶을 필요 없지만, 가독성을 위해 써준다. 
		System.out.println("num1 - num2 = " + (num1/num2)); // 2, 정수값의 나눈 몫(2.5가 아니다.)
		System.out.println("num1 - num2 = " + (num1%num2)); // 3, 정수값의 나눈 나머지
		
		//** 산술 연산은 반드시 피연산자들의 데이터타입이 같아야 한다.
		//** 산술 연산의 결과값도 피연산자와 같은 데이터타입을 가진다.
		// 15 / 6 -> 2.5 -> int형으로 저장하는 과정에서 소숫점 이하가 버려진다 -> 정수 부분만 남음 -> 2 
		System.out.println("-----------------");
		
		System.out.println( "15 / 6 = " + (15/6) ); //int/int -> int
		System.out.println( "15.0 / 6.0 = " + (15.0/6.0) ); //double/double -> double
		// 자바는 자료형에 대해서 굉장히 깐깐하게 따지는 언어이다. 따라서, 자료형 구분에 대해서는 연습을 많이 해둘 필요가 있다.
		// int / double -> double / double -> double(서로 다른 자료형끼리의 연산)
	}
}