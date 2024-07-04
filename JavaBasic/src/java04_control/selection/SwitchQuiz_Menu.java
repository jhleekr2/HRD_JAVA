package java04_control.selection;

import java.util.Scanner;

public class SwitchQuiz_Menu {
//  - 메뉴 만들기
//
//  ===============================
//     M  e  n  u
//  ===============================
//     1. Hello World 출력
//     2. 이름 출력
//     3. 성별 출력
//     4. 종료
//  ===============================
//
//    >> _
//
//   -> 각 메뉴 번호를 입력하면 메뉴에 알맞게 동작하도록 작성
//   -> 동작은 간단한 출력으로 해결

	// 메뉴 번호 상수

	//-------------------------------------------------------
	public static void main(String[] args) {
		final int HELLO_MENU = 1;
		final int NAME_MENU = 2;
		final int GENDER_MENU = 3;
		final int EXIT_MENU = 4;
		
		Scanner sc = new Scanner(System.in);
		RunMenu runMenu = new RunMenu(); //new 타입하고 Ctrl+space 단축키 사용!
		// RunMenu 클래스 활성화
		int menu; // 메뉴 선택 변수
		
		System.out.println("===============================");
		System.out.println("   M  e  n  u");
		System.out.println("===============================");
		System.out.println("   1. Hello World 출력");
		System.out.println("   2. 이름 출력");
		System.out.println("   3. 성별 출력");
		System.out.println("   4. 종료");
		System.out.println("===============================");
		System.out.print(">>");
		menu = sc.nextInt();
		switch( menu ) { 
			case HELLO_MENU: 
				runMenu.printHello();
				//메소드 호출(사용)
				//method call
				
				break;
			case NAME_MENU:
				runMenu.printName();
				break;
			case GENDER_MENU:
				runMenu.printGender();
				break;
			case EXIT_MENU:
				runMenu.printExit();
				break;
			default:
				runMenu.printDefault();
				break;
		}
		sc.close();	
	}				
}

// ** 현재 코드 화면 분할
// 가로 : ctrl + shift + [
// 세로 : ctrl + shift + -
// 분할 취소는 분할할때 누른 키를 한번더 누르면 된다.