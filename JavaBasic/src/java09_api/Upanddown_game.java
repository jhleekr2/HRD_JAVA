package java09_api;

import java.util.Random;
import java.util.Scanner;

//+ UP&DOWN 게임
	// - 컴퓨터가 1~50의 랜덤을 생성한다 (= COM)
	// 
	// - 사용자의 입력을 받는다 (= USER)
	//
	// - USER가 COM보다 낮은지 높은지 판단하여 UP&DOWN을 출력한다
	//  (기준은 COM)
	//  (EX. COM == 40 && USER == 30 -> UP )
	//  
	// - USER가 COM과 같으면 USER 승리
	// 
	// - 7번 안에 맞추지 못하면 COM 승리

public class Upanddown_game {
//	public static void main(String[] args) { // 기존 main()
	public void upanddown() {	// 다른 main()에서 게임 부분을 호출
		Random ran; //의사난수 객체
		ran = new Random(); //의사난수 객체 생성
		
		int com = ran.nextInt(50) + 1; // 컴퓨터가 1~50의 랜덤 생성
		int user = 0; //사용자의 숫자
		Scanner sc = new Scanner(System.in); //입력
		
//		int usersave = 0;
		int i;
//		System.out.println(com); //테스트 코드(컴퓨터가 생성한 난수 출력)
		for(i=0; i<7; i++) { // 7번의 기회
			while(true) {
				System.out.print("1~50사이의 숫자를 입력하세요 : ");
				user = sc.nextInt(); //사용자의 숫자 입력 받음
				
				if ( user >= 1 && user <= 50) {
					break;
				} else {
					System.out.println("1~50사이의 숫자만 입력하세요!");
				}
			}
//				usersave = user; // 임시 변수 지정(안하면 사용자가 이겼더라도 컴퓨터 이겼다는 부분 출력됨)
			if( com > user ) { // 항상 왼쪽이 기준!
				System.out.println("UP");
			} else if( com < user ) {
				System.out.println("DOWN");
			} else {
				System.out.println("User Win");
				Gamemain.userwin++; // 사용자 승리횟수 증가
//				break; // 반복문 종료
				return; // 메인 메소드 종료
			}
		}
		
//		if(i == 7) { //사용자가 졌다면 반복문 카운트가 7일 것임
			System.out.println("Com Win");
			Gamemain.comwin++; // 컴퓨터 승리횟수 증가
//		}
		
		sc.close();
	}
}
