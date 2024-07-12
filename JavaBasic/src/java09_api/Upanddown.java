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

public class Upanddown {
	public static void main(String[] args) {
		
		Random ran; //의사난수 객체
		ran = new Random(); //의사난수 객체 생성
		
		int com = ran.nextInt(50) + 1; // 컴퓨터가 1~50의 랜덤 생성
		
		Scanner sc = new Scanner(System.in); //입력
		
		int usersave = 0;
		
		System.out.println(com);
		for(int i=0; i<7; i++) {
			System.out.print("1~50사이의 숫자를 입력하세요 : ");
			int user = sc.nextInt(); //사용자의 숫자 입력 받음
			usersave = user; // 임시 변수 지정(안하면 사용자가 이겼더라도 컴퓨터 이겼다는 부분 출력됨)
			if( user > com ) {
				System.out.println("UP");
			} else if( user < com ) {
				System.out.println("DOWN");
			} else {
				System.out.println("User Win");
				break;
			}
		}
		
		if(usersave != com) { //사용자가 마지막으로 입력한 숫자가 같지 않을때만 실행
			System.out.println("Com Win");
		}
		
		sc.close();
	}
}
