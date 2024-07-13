package java09_api;

import java.util.Scanner;

public class Gamemain {
	public static int comwin; // 컴퓨터의 승리 횟수
	public static int userwin; // 사용자의 승리 횟수
//	private int comwin; // 컴퓨터의 승리 횟수
//	private int userwin; // 사용자의 승리 횟수
	
	public static void main(String[] args) {
//		int comwin = 0; // 컴퓨터의 승리 횟수
//		int userwin = 0; // 사용자의 승리 횟수
		Scanner sc = new Scanner(System.in);
		baskin31_game bsk31 = new baskin31_game(); // 다른 클래스 함수 실행하기 위해 인스턴스명 정의
		Upanddown_game upndown = new Upanddown_game();
		int input = 0;
		do {
			System.out.println("----- 메뉴 -----");
			System.out.println("1. Baskin31 게임");
			System.out.println("2. UpAndDown 게임");
			System.out.println("3. 점수 확인");
			System.out.println("4. 종료");
			input = sc.nextInt();
			switch ( input ) { // 1-3번 선택시 메뉴에 정의된 다른 클래스 실행
			case 1:
				bsk31.baskin31(); // 다른 클래스의 함수 실행하려면
				//먼저, 클래스명 인스턴스명(내가 사용하고자 하는 이름 아무거나) = new 클래스명()과 같이 인스턴스명을 정의하고
				//인스턴스명.클래스내부함수();와 같이 호출
				break;
			case 2:
				upndown.upanddown(); //다른 클래스의 함수 호출
				break;
			case 3: //  점수 확인 루틴 실행
				checkscore();
			}
		} while (input != 4); // 4번을 입력하면 종료
		
		
		
		
		sc.close(); // 프로그램 종료할때 Scanner 닫기
	}
	
	public static void checkscore() {
//		int comwin = Gamemain.getComwin();
//		int userwin = Gamemain.getUserwin();
		System.out.println("----- 점수 확인 -----");
		System.out.println("컴퓨터의 승리 횟수 : " + comwin);
		System.out.println("유저의 승리 횟수 : " + userwin);
	}
}
// 나의 프로그램에서는 컴퓨터와 유저의 승리 횟수를 static 변수로 지정해서 호출하여 업데이트함
// 도전 과제: getter, setter 함수 등을 이용하여 함수 호출할 때 마다 값을 주고받는 것을 해보자!