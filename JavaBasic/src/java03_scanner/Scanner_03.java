package java03_scanner;

import java.util.Scanner;

public class Scanner_03 {
	public static void main(String[] args) {
		
		// 문자열 입력 처리 기능(메소드)
		// .nextLine()
		// .next()
		// -------------------------------------------
		
		Scanner sc = new Scanner(System.in); // 선언과 동시에 초기화하고, 활성화도 한다.
		
		// 키보드 입력 클래스변수(참조형변수)
		// 키보드 입력 객체(변수)
		
		// 문자열 변수
		String str1;
		String str2;
		
		System.out.print("Input String : ");
		// 문자열 입력받기
//		str1 = sc.nextLine();
//		str2 = sc.nextLine();
		str1 = sc.next();
		str2 = sc.next();
		// nextline은 띄어쓰기 상관없이 한줄 입력, next는 띄어쓰기 이전까지 입력
		
		System.out.println();
		System.out.println("--- 출력 ---");
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		
		sc.close();
		
		// -------------------------------------------
		
		// nextLine() - '\n'
		// 개행문자(엔터값)을 기준으로 입력한 한 줄을 한나의 데이터로 판단한다.
		
		// next() - '\n', ' ', '\t'
		// 공백문자(white space, ws)들을 기준으로 하나의 데이터로 판단한다.
		
		// nextInt(), nextDouble, nextBoolean, next() 등의 입력 메소드들은 공백문자들을 입력 기준으로 판단한다.
		
		// nextLine() 메소드만 개행문자('\n')를 기준으로 판단한다.
		
	}
}