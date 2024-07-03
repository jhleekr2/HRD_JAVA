package java04_control.loop;

public class While_03 {
	public static void main(String[] args) {
		int i = 1;
		int j = 2;

		//QUIZ
		//구구단 2-9단을 출력하기
//		for(j=2;j<10;j++) {
//			for(i=1;i<10;i++) {
//				System.out.println(j + "X" + i + "=" + (j*i));			
//			}
//			System.out.println();
//		}
		
		while (j<=9) {	
			while (i<=9) {
				System.out.println(j + "X" + i + "=" + (j*i));			

				i++; //증감식
			}
			i = 1;
		System.out.println();
		j++;
		}
	}
}

