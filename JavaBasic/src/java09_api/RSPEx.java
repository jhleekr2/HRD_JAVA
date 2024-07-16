package java09_api;

import java.util.Scanner;

public class RSPEx {
	public static void main(String[] args) {
		
		//가위바위보 게임 만들기
		
		//1 : 가위, 2 : 바위, 3 : 보
		
		// I. Math.random()을 이용하여 com에 값 저장
	    
		// II. user에 입력받기
	    
		// III. com, user 비교 (가위바위보 승부)
	    
		//   ex)   if( com==1 && user==2 )  //user(바위) 승
	     
		// IV. 결과 출력 (승자)
	   
	    // V. I~IV 반복
				
		Scanner sc = new Scanner(System.in); // 사용자의 입력을 받기 위한 목적으로 Scanner 정의
		
		int user = 0; // 사용자 입력변수
		
		while(user != 4) {// 사용자가 4를 입력하지 않으면 계속 반복
		
		System.out.println("가위, 바위, 보 중 하나를 입력하세요.");
		System.out.println("1 - 가위, 2 - 바위, 3 - 보, 4 - 게임 종료");
		
		user = sc.nextInt(); //사용자의 입력을 받음(4이면 종료)
		
		if( user == 1 || user ==2 || user == 3 ) {
			RSPDetermine.play(user);
		} //사용자가 1~3입력했을때만 컴퓨터와의 가위바위보 게임 호출
		else if(user == 4) {
			continue; //사용자가 4입력하면 맨 아래값 호출 안하고 게임 종료
		}
		else {
			System.out.println("1~3사이의 값을 입력하세요.");
		} //잘못된 입력값
			
			//  	가위(1)	바위(2)	보(3)
			//가위(1) 무	바위	가위
			//바위(2)바위	무		보
			//보(3)	가위	보		무			
		}
		

	}
}
