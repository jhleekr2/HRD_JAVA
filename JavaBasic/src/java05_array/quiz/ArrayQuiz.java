package java05_array.quiz;

import java.util.Scanner;

public class ArrayQuiz {
//  5층인 건물의 인원을 입력 받도록 만든후 전체 인원이 나오도록 하게 하여라.
//  그 후 각 층마다 관리비를 측정한다. (관리비는 인원당 12000원 이다.)
//
//  - 필요한 배열
//   1. 각 층의 사는 인원을 담는 배열 arr1[6]
//     // 1~5층 과 총인원 (마지막 배열공간은 입력받은 인원의 총 합으로 사용) 
//     
//   2. 각 층의 관리비 배열 arr2[6]
//     // 1~5층 과 총 관리비 금액 (마지막 배열공간은 관리비의 총 합계금액으로 사용)
//
//  ----------------------- 입력 (입력시 for문을 이용한다.)
//  1층의 사는 인원은 ? 4
//  2층의 사는 인원은 ? 5
//  3층의 사는 인원은 ? 11
//  4층의 사는 인원은 ? 2
//  5층의 사는 인원은 ? 8
//  ----------------------- 출력 (출력시 for 문을 이용한다.)
//  1층의 총 관리비 : 48000원
//  2층의 총 관리비 : 60000원
//  3층의 총 관리비 : 132000원
//  4층의 총 관리비 : 24000원
//  5층의 총 관리비 : 96000원
//
//  건물에 사는 총 인원은 30명입니다.
//  관리비의 총 금액은 360000원 입니다.   

	public static void main(String[] args) {
		
		//--- 상수 ---
		final int FLOOR = 5; // 건물 층 수
		final int COST = 12000; // 인당 관리비
		
		int[] arr1; // n층에 사는 인원 
		int[] arr2; // n층의 관리비 배열
		
		arr1 = new int[FLOOR + 1]; //arr1 = 1-5층까지 배열
		arr2 = new int[FLOOR + 1]; //arr2 = 1-5층까지 배열
		
		Scanner sc = new Scanner(System.in); // 입력
		
//		int totalPerson = 0; // 총 인원
//		int totalManageFee = 0; // 총 관리비\
		
		arr1[FLOOR] = 0; // 총 인원
		arr2[FLOOR] = 0; // 총 관리비
		
		for(int i=0; i<FLOOR; i++) {
			System.out.print((i+1) + "층의 사는 인원은 ? ");
			arr1[i] = sc.nextInt(); // i층의 인원 입력
			arr2[i] = arr1[i] * COST; // i층의 관리비 계산
			arr1[FLOOR] += arr1[i]; // 건물의 총 인원 계산 
			arr2[FLOOR] += arr2[i]; // 건물의 총 관리비 계산
		}
		
		for(int i=0; i<FLOOR; i++) {
			System.out.println((i+1) + "층의 총 관리비 : " + arr2[i] + "원");
		}
		// 결과, 출력부분을 먼저 개발하면 테스트 코드를 개발할 때 수월하다.
		System.out.println("건물에 사는 총 인원은 " + arr1[FLOOR] + "명입니다.");
		System.out.println("관리비의 총 금액은 " + arr2[FLOOR] + "원 입니다.");
		sc.close();
	}
}
