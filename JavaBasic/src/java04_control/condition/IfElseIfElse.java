package java04_control.condition;

import java.util.Scanner;

public class IfElseIfElse {
	public static void main(String[] args) {
		
		// if ~ else if ~ else
		
//		if( 조건식1 ) {
			//조건식1이 참일때 수행하는 영역
//		} else if( 조건식2) {
			//조건식1이 거짓이고 조건식2가 참일때 수행하는 영역
//		} else if( 조건식3 {
			//조건식1과 2가 모두 거짓이고 조건식 3이 참일때 수행하는 영역
//		} else {
			//조건식1,2,3이 모두 거짓일때 수행하는 영역
//		}
		
		//** else if 구문은 작성할 수 있는 개수에 제한이 없다.
		
		//** else if, else 구문이 필수는 아니다.
		
		//** else 구문은 if문 전체의 마지막으로 1개만 올 수 있다.
		
		//** if문 없이 else if, else를 단독으로 사용할 수 없다.
		
		//--------------------------------------------------
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input Number : ");
		int num = sc.nextInt();
		
		if( num == 10 ) {
			System.out.println("10입니다.");
		} else if(num == 20) {
			System.out.println("20입니다.");
		} else if(num == 30) {
			System.out.println("30입니다.");
		} else {
			System.out.println("10, 20, 30 모두 아닙니다.");
		}
	}
}