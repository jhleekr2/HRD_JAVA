package java04_control.condition;

import java.util.Scanner;

public class IfElse_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 숫자 한 개 입력받기
		System.out.print("Input Number : ");
		int num = sc.nextInt();
		
		if( num % 2 == 0 ) { // 입력한 숫자가 짝수인지 확인
			System.out.println( num + "은/는 짝수입니다."); // 짝수
		} else { //num%2 != 0, !(num%2 == 0)
		// 두가지 조건이 있는데, 사람에 따라 else를 쓰는 것이 친숙한 경우도 있고 아닌 경우도 있다.
		// 본인은 else 쓰는쪽을 상당히 선호함.
			System.out.println( num + "은/는 짝수가 아닙니다."); // 짝수가 아닐때
		}
		sc.close();
	}
}
