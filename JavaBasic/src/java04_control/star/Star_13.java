package java04_control.star;

public class Star_13 {
	public static void main(String[] args) {
		
		int i = 0;
		int j = 0;
		
		for(i=0 ; i<4; i++) {
			for(j=0 ; i+j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i=0 ; i<5 ; i++) {
			for(j=0; j<i+1; j++) {
				System.out.print("*");
		}
			
		System.out.println();
		
	}

	}
}
