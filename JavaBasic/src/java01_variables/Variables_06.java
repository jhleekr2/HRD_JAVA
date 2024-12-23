package java01_variables;

public class Variables_06 {
	public static void main(String[] args) {
		
		//상수(Constant Number)
//		- 변하지 않는 값
//		- 데이터의 값 자체를 뜻하는 용어이다.
//		- 자료형을 가지고 있다
//
//		- 자바의 기본 데이터타입 상수 표현방식
//		23526             - int형 상수
//		453.343          - double형 상수
//		‘P’                   - char형 상수
//		false               - boolean형 상수
//		54362L          - long형 상수
//		654.234f        - float형 상수
//		(byte) 123      - byte형 상수
//		(short) 43445 -short형 상수
//
//		- 상수의 종류
//		1. 리터럴(literal) 상수
//		      상수로 표현된 데이터 자체를 표현하는 용어
//
//		2. 이름있는 상수
//		      변수를 상수화하여 사용하는 것
//		      변수를 선언하고 데이터를 딱 한번만 초기화할 수 있도록 강제한 것이다
//		      변수 값을 변경하기 위해 추가적인 대입을 할 수 없다

		System.out.println( 1234 ); // 이때 출력한 숫자 1234는 int형으로 처리됐으며, 임시로 썼다가 버린다.
		
		//-----------------------------------------------------------------
		//변수
		// -> 저장된 데이터 변경 가능
		int num;
		num = 123;
		num = 234;
		num = 345;
		//-----------------------------------------------------------------
		
		//변수의 상수화(final)
		//이름있는 상수
		//-> 이름있는 상수의 이름은 변수와 구분하기 위해 모두 대문자로!
		final int max = 100;
// 상수화된 변수의 경우는 선언과 동시에 초기화만 허용된 언어들이 많다. 
//		max = 200; //오류 'The final local variable max may already have been assigned' 발생한다.
//		자바에서 지역 = 가장 가까운 중괄호
		//에러, 상수화된 변수는 값 대입을 한번만 할 수 있다.
		//일반 변수와 상수화된 변수를 구분하기 어려울 수 있기 떄문에, 상수형 변수는 선언할때 대문자만 사용하는 경우가 많다.
		//소문자로 형성된 변수명을 대문자로 바꾸는 단축키
		//Refactor - Rename 단축키: alt+shift+r
		
		//근무일수
		final int WORKINGDAY = 25;
		
		System.out.println("이번 달은 "+ WORKINGDAY +"일 근무했습니다.");
		// 따옴표 뒤에 +해서 출력을 이어서 할 수 있다.
		
		System.out.println("이번 달 급여: "+ 15*WORKINGDAY +"만원입니다.");
		// 중간에 바뀌어서는 절대 안되는 변수를 사용하기 위해 상수화시킨 변수를 사용한다.		
	}
	
}
