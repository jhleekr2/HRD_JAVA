package java04_control.condition;

import java.util.Scanner;

public class IfQuiz {
//  + 숫자 하나를 입력받아 양수인지 음수인지 판별하시오
//  >> Input Number : -3
//  >> 음수입니다
//
//+ 입력한 데이터가 3의 배수인지 판별하시오
// (% 연산자 사용)
//  >> Input Number : 7
//  >> 3의 배수가 아닙니다
//
//+ 두 수를 입력 받아 큰 수를 출력하시오
//  >> Input Number1 : 44
//  >> Input Number2 : 88
//  >> 88 이 더 큰 수

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number : ");
		int input = sc.nextInt(); // 입력 인터페이스 만들기
		if( input > 0 ) {
			System.out.println("양수입니다.");
		}
		
		if( input < 0 ) {
			System.out.println("음수입니다.");
		}
		
		if( input == 0) {
			System.out.println("양수도 음수도 아닙니다.");
		}
		
		// 양수/음수/0 판별 부분
		if ( ( input % 3) == 0) {
			System.out.println("3의 배수입니다.");
		}
		
		if ( ( input % 3) != 0 ) {
			System.out.println("3의 배수가 아닙니다.");
		}
		// 3의 배수 판별 부분
		System.out.print("Input number1 : ");
		int num1 = sc.nextInt();
		System.out.print("Input number2 : ");
		int num2 = sc.nextInt();
		// 2개의 숫자 입력
		
		if (num1 > num2) {
			System.out.println(num1 + " 이 더 큰 수");
		}
		if (num1 <= num2) {
			System.out.println(num2 + " 이 더 큰 수");
		}
		// 대소관계 비교해서 더 큰 수 출력
	}
}