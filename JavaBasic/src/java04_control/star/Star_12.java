package java04_control.star;

public class Star_12 {
	public static void main(String[] args) {
		
		int i = 0;
		int j = 0;
		
		for(i=0 ; i<4 ; i++) {
				for(j=0; j<i+1; j++) {
					System.out.print("*");
			}
				
			System.out.println();
			
		}
		
		for(i=0 ; i<5; i++) {
			for(j=0 ; i+j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}	
			
	}
}

// if문을 결합한 풀이법
//
//	final int LINE=9; // 열 수를 상수로 지정하면 코드가 깔끔해진다.
//	for(int i=0; i<LINE; i++) {//i행, 0~8, 9번
//		
//		if( i < LINE/2 ) { //i, 0~3
//			for(int j=0; j<=i; j++) {//j열, 0~i, (i+1)번 
//				System.out.println("*");
//			}
//			
//		} else { //i, 4~8
//			for(int j = 0; j<LINE-i-1; j++) { //j열, 0~(9-i-1), (9-i)번
//				System.out.println("*");
//			}
//		}
//		System.out.println();
//	}