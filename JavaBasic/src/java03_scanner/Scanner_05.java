package java03_scanner;

import java.util.Scanner;

public class Scanner_05 {
	public static void main(String[] args) {	
		//입력 객체
		Scanner sc = new Scanner(System.in);
		//----------------------------------------------------
		System.out.println("--- 입력 ---");
		System.out.print("Input Number: ");
		int num = sc.nextInt();
		
		System.out.print("Input String: "); // 원래는 문자열 입력을 받아야 하는데, 입력 안받고 넘어간다.
//		sc.nextLine(); // 버퍼 비우기, 버퍼에 남은 '\n'(개행문자)를 버린다.
		sc.skip("[\\r\\n]+"); //입력 버퍼의 '\r' '\n'을 모두 제거한다 (정규식)
		String str = sc.nextLine();
		System.out.println();
		System.out.println("--- 출력 ---");
		System.out.println("num: " + num);
		System.out.println("str: " + str);
		
		sc.close();
		// 간단한 해결방식은 문자열을 먼저 입력받는 것인데, 이 프로그램의 문제가 왜 발생했을까?
		
		// 키보드와 프로그램을 연결하는 데이터 통로인 스트림과 관련된 문제이다. 실제, 입출력은
		// 컴퓨터, 운영체제, 키보드, 스피크 등 장치마다 차이가 있기 때문에, 개념적인 데이터 통로인 
		// 스트림 이라는 것을 만들어 두었다.
		// 키보드 - 스트림이 연결되어 있는 표준 입력장치(Standard Input Device, stdin)로 기본적으로
		// 제공되고 있다.
		// Syatem.in을 사용하면, 연결되어 있는 키보드를 활성화하여 사용할 수 있다.
		
		// 마찬가지로, 표준 출력장치(콘솔 형태의 모니터, Standard Output Device, stdout)가 기본적으로
		// 제공되고 있다.
		
		// 따라서, C언어에서는 Stdin+Stdout을 합쳐서 STanDard Input Output, stdio 를 써야 한다.
		// #include <stdio.h> -> 없으면 기본 입출력조차 불가능하다.
		
		// 그런데, 스트림에는 한번에 한글자씩만 지나갈 수 있다는 특징이 있다. 따라서, 입출력 스트림의
		// 중간에 버퍼 메모리(Buffer Memory)를 두어 완충하고 있다.
		// 그런데, Scanner의 경우에는 버퍼 메모리의 동작과 관련된 충돌이 발생한다.
		// 엔터를 치면, 버퍼에 키보드로 입력한 것이 쓰여지고, 이후 nextInt가 버퍼에 있는 것을 가져간다.
		// 프로그램이 nextInt로 버퍼에 있는 것을 가져가면 버퍼에 있던 내용은 지운다.
		// 모든 입출력 장치에는 버퍼가 있다. 
		
		// 문제는, nextInt함수가 입력된 숫자를 버퍼에서 먼저 가져가지만 같이 입력된 개행은 가져가지 않기
		// 때문에, nextInt함수가 실행된 후에도 버퍼는 완전히 비어있지 않고 개행이 남아있게 된다. 이후 실
		// 되는 nextLine 함수는 먼저 입력을 받는 대신 입력을 받기 전에 버퍼부터 비우려고 하며, 이때 버퍼
		// 에 남아있던 개행문자 '\n'을 가져간 후 버리는 바람에 문제가 발생한다.
		
		//** .nextLine() 은 '\n'를 버퍼에서 찾고 그 이전에 읽은 내용을 문자열(String)로 반환한다.
		//** '\n'은 버린다.
		
		//** .nextLine()을 제외한 모든 입력 메소드들은 공백문자를 기준으로 버퍼에서 기능에 맞는 타입
		// 데이터를 찾아 반환한다.
		//** '\n'을 버퍼에 남겨둔다. 나머지 공백은 지운다.
		//** 결론적으로, 문제가 발생한 원인은 .nextLine()을 제외한 모든 입력 메소드가 '\n'을 버퍼에
		// 남겨둔 것 때문이다.(버퍼에 남아있는 개행문자가 문제)
		// 해결책 -> nextInt와 nextLine의 중간에 nextLine을 한번 더 써서 버퍼의 개행문자를 비워주는
		// 방법을 사용하면 된다.
		
		
		}
}
