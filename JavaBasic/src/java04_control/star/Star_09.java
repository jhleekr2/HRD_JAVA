package java04_control.star;

public class Star_09 {
	public static void main(String[] args) {
		
		int i = 0;
		int j = 0;
		
		for(i=0 ; i<5; i++) {
			for(j=0 ; i+j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
			
			
		}
	}
}

//***** 0행 -> 5번
//**** 1행 -> 4번
//*** 2행 -> 3번
//** 3행 -> 2번
//* 4행 -> 1번
//i가 0에서 4까지 커지는 동안, j는 5에서 1까지 줄어든다.

// 반복횟수 = 5-i번 반복
//		for(int i=0; i<5; i++) { //i행, 0~4, 5번
//			for(int j=0; j<=5-i-1; j++) { //j열, 0~(5-i-1), (5-i)번
//				System.out.println("*");
//			}
//		}
//		System.out.println();