package java04_control.star;

public class Star_10 {
	public static void main(String[] args) {
		
		int i = 0;
		int j = 0;
		
		for(i=0 ; i<5 ; i++) { //i행, 0~4, 5번
			// Q8
				for(j=0; j<i; j++) { //j열, 0 ~i-1, i번
					System.out.print(" ");
			}
			// Q9	
				for(j=0; i+j<5; j++) { //j열, 0~(5-i-1), (5-i)번
				System.out.print("*");
			}
			System.out.println();
		}
			
	}
}

// i행
// 0행 ***** 물음표 0, 별 5
// 1행 ?**** 물음표 1, 별 4
// 2행 ??*** 물음표 2, 별 3
// 3행 ???** 물음표 3, 별 2
// 4행 ????* 물음표 4, 별 1
// 8번과 9번 코드를 결합!