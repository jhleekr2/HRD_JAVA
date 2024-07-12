package java09_api;

import java.util.Scanner;

public class Gamemain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
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
				
			case 2:
				
			case 3:
			}
		} while (input != 4); // 4번을 입력하면 종료
		
		
		
		
		sc.close(); // 프로그램 종료할때 Scanner 닫기
	}
}
