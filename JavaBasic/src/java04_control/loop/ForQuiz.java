package java04_control.loop;

import java.util.Scanner;

public class ForQuiz {

//QUIZ. 어떤 수(입력 값)의 약수를 구하는 프로그램을 작성하여라

// 약수 -> 어떤 수를 정수로 나눌 수 있는 수
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Number : ");
		int input = sc.nextInt();
		
		int i = 0;
		System.out.println("입력한 수 " + input + "의 약수");
		for(i = 1 ; i<=input ; i++ ) {
			if( input % i == 0) {
				System.out.print(i + " ");
			}
			
		}
		sc.close();
	}
}