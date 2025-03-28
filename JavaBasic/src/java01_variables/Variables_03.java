package java01_variables;

public class Variables_03 {
	public static void main(String[] args) {
	//	main입력하고 Ctrl + Space 누르면, 이클립스에서 맞는 문법을 추천해준다. 이때 나오는 항목을 골라서 Enter누르면 맞는 문법이 적용된다.
	//  실제 현실에서 main을 mian으로 오타를 내서 오류가 발생하는 경우가 많다.
		int number;
	// -> 변수를 처음으로 생성하면 어떤 값이 저장되어 있을지 모른다.
	// -> 변수를 처음 선언하면 "쓰레기값"이 저장되어 있다.
	
	// 변수 대입
		number = 4235;
	// -> 변수의 값을 처음으로 대입하면 "초기화"했다고 말한다.
		
	// 이클립스에서는 sysout 입력하고 Ctrl + Space 누르면 System.out.println();을 자동으로 입력해준다.
	// 자바 단점 - 코드가 너무 장황함
		System.out.println( number );
		System.out.println("-----------------------------");
	// 변수를 초기화하지 않고 사용하면 'The local variable number may not have been initialized' 오류가 발생한다.
	// 이유:이전의 프로그램이 사용하던 흔적이 할당된 메모리 공간에 존재하기 때문에, 쓰레기 값이 나올 뿐만 아니라 보안상 위협이 있다.
	// 자바는 "쓰레기값"이 저장된 변수를 사용하면 문법 에러로 처리한다.
		
	//	int number; 이미 있는 변수를 중복해서 만들면 오류가 발생한다.
	//  선언과 동시에 초기화, Initialize
		int number2 = 98769;
	// -> 쓰레기값이 들어가지 않고 곧바로 변수가 초기화된다.
		
		System.out.println( number2 );
		System.out.println("-----------------------------");
	// 실수형 변수(pi)만들기
		double pi = 3.14;
		
		System.out.println( pi );
		
		char alpha;
		alpha = 'J'; // 반드시 작은 따옴표로 둘러싸인 단일 문자만 가능하다.
		System.out.println( alpha );
		
		boolean isRight; // boolean형 변수는 이름을 뒤에 있는 단어를 확인하는것과 같은 형태로 만들고, 뒤 단어의 첫글자를 대문자로 처리하여, 단어 구분을 강조한다.
		
		isRight = true;
		isRight = false;
		
		System.out.println( isRight );
	}
}
