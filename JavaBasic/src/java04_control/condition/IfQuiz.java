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
		
		Scanner sc = new Scanner(System.in); // Scanner는 키보드가 한개이므로 프로그램 전체에서 1개만 만들고
		// 이후 프로그램이 끝날때까지 돌려쓴다.
		
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
		
		// 양수/음수/0 판별 부분 -> 문제에서는 알려주지 않았지만, 개발자가 직접 보완해야 한다.
		// 0의 경우는 양수도 음수도 아니므로 버그의 가능성이 있다.
		
		if ( ( input % 3) == 0) { //3의 배수(나머지가 0)
			System.out.println("3의 배수입니다.");
		}
		
		if ( ( input % 3) != 0 ) { //3의 배수가 아님(나머지가 1 또는 2)
			// inpit % 3 -> int형 (0,1,2만 가능)
			System.out.println("3의 배수가 아닙니다.");
		}
		// 3의 배수 판별 부분
		System.out.print("Input number1 : ");
		int num1 = sc.nextInt();
		System.out.print("Input number2 : ");
		int num2 = sc.nextInt();
		// 2개의 숫자 입력
		
		if (num1 > num2) {
			System.out.println(num1 + " 이/가 더 큰 수");
		}
		if (num1 < num2) {
			System.out.println(num2 + " 이/가 더 큰 수");
		}
		if (num1 == num2) {
			System.out.println("두 수가 같습니다.");
		}
		// 대소관계 비교해서 더 큰 수 출력, 같은 숫자의 경우 무시하거나, 아니면 두 수가 같다는 것을 판정하는
		// 부분을 따로 만들어 놔야 한다. 
		
		// 실제 개발에서는 테스트 코드를 만들어놓고 개발하며 디버깅 한다. 이후 완성하고 배포하는 과정에서
		// 제거된다.
		
		sc.close();
		// 프로그래밍은 창의력보다는 응용이다.
		
	}
}
