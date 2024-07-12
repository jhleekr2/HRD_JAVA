package java09_api;

import java.util.Random;
import java.util.Scanner;

public class baskin31_game {
//	+ 배스킨라빈스31 게임
//	  - 컴퓨터와 사용자가 번갈아가면서 연속적으로 숫자를 말한다
//	  - 컴퓨터와 사용자는 한번의 기회에 연속된 숫자를 1개부터 3개까지
//	   말할 수 있다
//	  - 컴퓨터는 자기 순서에 랜덤한 갯수의 연속된 숫자를 말한다
//	  - 사용자는 1~3 입력을 통해 연속된 숫자를 말한다
//	  - 31을 말하는 사람이 진다
//
//
//	  * 추가 사항
//		 31에 가까워지면 컴퓨터는 랜덤이 아닌 자신이 이길수
//		있는 숫자까지만 말한다
//
//		ex. 사용자가 29까지 말했다면
//		  컴퓨터는 무조건 30까지만 말한다
	
//	public static void main(String[] args) {
		
		Random ran; //의사난수 객체
		ran = new Random(); //의사난수 객체 생성
		int com = 0; //컴퓨터 출발시점
//		int []user = new int[3]; //사람 출발시점 (최대 3개의 숫자 입력받아야 하므로 3의 크기를 가진 배열로 정의)
		int user = 0; //사람 출발시점
		int usernum = 0; //사람이 입력할 숫자개수 미리 입력받음
		Scanner sc = new Scanner(System.in);
		int i;
		for (i=0; i<31;i++) {//컴퓨터가 1-3개의 숫자를 말하는 루틴
			
//			컴퓨터 초기값: 0
			
//			컴퓨터가 숫자를 말하면서 1~3정도 내부 숫자 증가
//			내부 for문을 1~3번정도 돌고(ran 사용), 이때 내부 숫자를 증가시키면서 출력도 병행
//			증가한 내부 숫자만큼 바깥 for문의 도는 횟수 감소(내부 for문 빠져나올때 i값 업데이트)
			if(i > 27) {//컴퓨터가 자신이 이길수있는 숫자까지만 말하는게 가능할때
				for(int j=0; j<31-i ;j++) { //31-(현재숫자) < 4 일때는 컴퓨터가 자기가 이길수있는 숫자만큼 말함
					System.out.println("com >>" + (++com));
				}
			} else {//컴퓨터가 자신이 이길수 있는 숫자까지 말하는게 불가능할때
			
				for(int j=0; j<ran.nextInt(3) + 1;j++) {
					System.out.println(++com); //내부 숫자 증가 후 출력
					i = com; //증가된 내부 숫자만큼 바깥 for문의 도는 횟수 감소후 내부 for문에서 빠져나옴
				}
			}
			do {
			System.out.print("연속된 숫자를 입력하시오(1-3)");
			usernum = sc.nextInt();
			} while( (usernum <= 0) || (usernum >= 4) ); // 입력할 숫자의 개수가 1-3일때만 통과
			for(int j=0; j<usernum; j++) { 
				user = com + 1;//컴퓨터 숫자보다 1 더한 숫자로 사용자 숫자!
				System.out.println("user >>" + user);
				if(user == 31) {// 사용자가 31을 말하는 순간 사용자가 지면서 종료!
					System.out.println("Computer Win!");
					com = user; //컴퓨터가 사람의 입력 숫자를 인식함.
					i = com; // 사람에 의해 증가된 내부 숫자만큼 바깥 for문의 도는 횟수 감소!
					break;
				}
				com = user; //컴퓨터가 사람의 입력 숫자를 인식함.
				i = com; // 사람에 의해 증가된 내부 숫자만큼 바깥 for문의 도는 횟수 감소!
			}
		}
		if(++com == 31) { //i의 값이 30이면 i의 값이 1 증가하면서 for문에서 빠져나가고 아직 com의 값은 30
			// 하지만, 이후 com의 값을 1 증가하면서 컴퓨터가 31을 말하게 되고 31을 말하는 즉시 사용자의 승리!
			// 이 부분은 사용자가 졌을때는 실행되지 않음(++com != 31이기 때문)
			System.out.println("com >>" + com);
			System.out.println("User Win!");
		}
		sc.close();		
//	}
			
}
// 강사의 풀이 골격과는 완전히 다른 풀이가 만들어졌다!

// 강사의 정석적인 풀이 골격은 while문을 사용하여 31일때 빠져나가는 식이다.

// 원래 문제는 Up & down 게임과 baskin31 게임을 따로 개발하고
// 컴퓨터와 나의 스코어도 따져가면서
// 메인 메소드에서는 메뉴를 통해 데이터를 주고받고 하면서
// 하는 문제로 되어 있다.