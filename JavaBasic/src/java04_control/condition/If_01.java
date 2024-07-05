package java04_control.condition;

public class If_01 {
	public static void main(String[] args) {
		
//		- 제어문(Control Statement)
//		- 프로그램의 기본 진행 흐름을 변경(제어)하는 구문을 뜻한다.
//		- main() 메소드에서 시작하여 코드를 순서대로 진행하는 흐름을
//		변경할 수 있다.
//		- 사용자와 프로그램이 상호작용하는 것에 따라 프로그램 진행이 \
//		달라지도록 코드를 작성할 수 있다.
//
//		- 제어문의 종류
//		-조건문, condition
//		if, else if, else
//
//		-반복문, loop
//		for, while, do-while
//
//		-선택문, selection
//		switch
//
//		-기타 제어문
//		break, continue
//
//		- 자바는 java4_control과 java4_control.condition, java4_control.loop를
//		완전 별개의 패키지로 간주한다.
//		
		//조건문 - if문
		
//		if ( 조건식 ) {
			// 코드 작성
			
			// 조건식이 참(true)일 때만 실행하는 코드를 작성하는 영역
//		}
		//-------------------------------------------------------------
		
		if (true) {
			System.out.println("이거 실행될까여?");
		}
		
		if (false ) {
			System.out.println("여기는? 여기는 어때여");
		}
		
		System.out.println("if문 바깥쪽!");
		System.out.println("이쪽은 실행될까여?????");
	}
}
