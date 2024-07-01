package java02_operator;

public class Ternary {
	public static void main(String[] args) {
			
		//삼항 연산자 - 조건
		// ? : 을 같이 사용해서 연산식을 만들어낸다.
		
		// 조건식 ? 조건식이 true일 때 반환할 값 : 조건식이 false일 때 반환할 값
		
		// ** 조건식
		// 연산의 결과를 true/false로 판단할 수 있는 식
		// boolean 타입
		// ------------------------------------------------------
		
//		System.out.println( 조건식 ?참일때 :거짓일때 );
		System.out.println( true ? "사과" : "바나나" );
		System.out.println( false ? 100 : 200 ); // 조건이 너무 명확해서, 어차피 실행되지 않을 코드부분이 있다보니 경고가 발생!
		// ------------------------------------------------------
		
		int num1 = 20, num2 = 30;
		
		System.out.println( num1<num2 ? "num1이 작다":"num1이 작지 않다");
		System.out.println( num1<num2 ? "num1이 작다":"num1이 크거나 같다");
	
		// ** 반환하는 값의 자료형이 같지 않아도 된다
//		System.out.println( num1<num2 ? 12345: "num1이 크거나 같다");
		// ------------------------------------------------------
		
		System.out.println("-------------------");
		String result = num1>num2 ? "num1이 크다" : "num1이 크지 않다"; 
		System.out.println("-------------------");
		
		// num1, num2 두숫자 중에서 큰값을 저장하기
		// (단, 같은 경우 큰 값은 해당 값으로 생각한다)
		
		int res = num1>num2 ? num1 : num2;
		System.out.println("큰 값 : " + res);
		
		// 너무 어렵고 가독성이 안좋기 때문에, 조건문으로 바꿔서 쓰는것이 좋다.
		// 하지만, 조건식은 굉장히 많이 사용되기 때문에 파악할 수 있어야만 한다.
	}
}
