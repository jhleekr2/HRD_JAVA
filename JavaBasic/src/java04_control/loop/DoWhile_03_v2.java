package java04_control.loop;

import java.util.Scanner;

public class DoWhile_03_v2 {
	public static void main(String[] args) {
		//Quiz
		
		//숫자를 여러 번 입력받아 모든 값들의 총합을 구하고
		//최종 합계를 출력하는 프로그램
		
		// -> 숫자 0을 입력하면 종료
		
		// -> do-while 구문 활용하기
		
		Scanner sc = new Scanner(System.in); // 입력 객체 생성
		int input = 0; // 사용자의 입력값 변수(int)
		int sum = 0; //총 합계 변수(int)
		
		do { 
			System.out.print("Input Number (Enter 0 to exit) : ");
			input = sc.nextInt(); // 사용자의 숫자 입력받기
			sum += input; // 총 합계에 입력받은 숫자 더하기
		} while( input != 0 ); // while( 입력한 숫자가 0이 아니면 );
		
		System.out.println("입력한 숫자들의 합은 " + sum + "입니다."); // 총 합계 출력하기
		
		sc.close();
		
		// 먼저 수도코드 형태로 쓴 다음 일반 코드형태로 변환해가는 연습하면 좋다
	}
}
