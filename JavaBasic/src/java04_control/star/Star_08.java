package java04_control.star;

public class Star_08 {
	public static void main(String[] args) {
		
		int i = 0;
		int j = 0;
		
		for(i=0 ; i<5 ; i++) { //i행, 0~4, 5번
				for(j=0; j<i+1; j++) { //j열, 0~0, 0~1, 0~2, 0~3, 0~4-> 0~i까지 i+1번 반복!
					System.out.print("*");
			}
				
			System.out.println();
			
		}
			
	}
}

// 참고로 8번문제가 가장 어려웠고 벽에 부딪혔음.
// 8번부터는 반복의 횟수를 바꾸는 문제!
// i행 - 바깥 for
// j열 - 안쪽 for

// * 0행 -> 1번
// ** 1행 -> 2번
// *** 2행 -> 3번
// **** 3행 -> 4번
// ***** 4행 -> 5번
// j의 횟수가 i만큼이어야 한다.