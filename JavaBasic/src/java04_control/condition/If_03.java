package java04_control.condition;

import java.util.Scanner;

public class If_03 {
	public static void main(String[] args) {
		
		// 키보드 입력 객체
		// Scanner 코드는 외우는 것을 강력히 권장한다!
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Number : ");
		int input = sc.nextInt();
//		System.out.println(input);
		
		if( input == 10 ) {
			System.out.println("입력한 값은 10이다.");
		}
//		if ( !( input == 10 ) ) {
		if( input != 10) {
			System.out.println("입력한 값은 10이 아니다.");
		}
		System.out.println("-----------------");
		
		if( input >= 1 && input <= 100) {
			System.out.println("입력한 값은 1~100 사이의 정수");
		}
		
		//QUIZ. 반대(부정)의 조건으로 if문 작성하기
		if( input < 1 || input > 100) {
			System.out.println("입력한 값은 1~100 사이의 정수가 아닙니다.");
		}
		sc.close();
		
	}
}
