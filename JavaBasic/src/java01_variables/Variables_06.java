package java01_variables;

public class Variables_06 {
	public static void main(String[] args) {
		
		//상수(Constant Number)
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