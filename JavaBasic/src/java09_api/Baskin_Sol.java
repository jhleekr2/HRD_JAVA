package java09_api;

import java.util.Random;
import java.util.Scanner;
// 강사님의 풀이
public class Baskin_Sol {
	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int num = 1;// 게임 진행 숫자
//		int max = 31;// 게임 종료 숫자(정상)
		int max = 11;// 게임 종료 숫자(테스트)
		
		int com; //컴퓨터의 숫자(랜덤)
		int user; //사용자의 숫자(키보드 입력)
		
		//승자 체크 변수
		// -> 1:user승
		// -> 2:com승
		int winner = 1;
		//게임 진행
		GAME:
		while( num <= max ) {
			
			//--- 컴퓨터의 숫자 말하기 ---
			// max-num = 1,2,3일때는 랜덤 기반 대신 추가조건으로 대체
			int diff = max - num;
			
			if(diff>=1 && diff<=3) {
				// 남은 개수 보정
				com = num;
				System.out.println("[TEST] com 보정 : " + com);
			} else {
			// 랜덤 기반
			com = ran.nextInt(3) + 1;
			System.out.println("[TEST] com 랜덤 : " + com);
			
			for(int i=0; i<com; i++) {
				System.out.println("com >> " + num++);
			}
				
				// 사용자의 승리
				if(num>max) {
					winner = 1; //사용자 승리 체크
					break GAME; // 레이블 break문으로 2개이상의 for문 빠져나감
				}
			}
			//--- 사용자의 숫자 말하기 ---
			// 사용자 입력 기반
			while(true) {
				System.out.println("몇 개 연속?");
				user = sc.nextInt();
				for(int i=0; i<user; i++) {
					System.out.println("user >> " + num++);
					
					// 컴퓨터의 승리
					if(num>max) {
						winner = 2; //컴퓨터 승리 체크
						break GAME;
					}
				}
				if( user>=1 && user<=3 ) {
					break;
				} else {
					System.out.println("[SYSTEM] 1~3만 입력하세요!");
				}
			}
		} // while end, 게임 진행 반복문(max까지)

		//승자 출력
		if( winner == 1 ) {
			System.out.println(" >> 사용자의 승리");
		} else if(winner == 2) {
			System.out.println(" >> 컴퓨터의 승리");
		}
	}
}
