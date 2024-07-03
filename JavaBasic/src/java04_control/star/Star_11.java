package java04_control.star;

public class Star_11 {
	public static void main(String[] args) {
		
		int i = 0;
		int j = 0;
		
		for(i=0 ; i<5; i++) {
			// Q9
			for(j=0 ; i+j<4; j++) {
				System.out.print(" ");
			}
			
			// Q8
			for(j=0 ; j<i+1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
			
			
		}
	}

	
}
