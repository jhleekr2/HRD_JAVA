package java04_control.loop;

public class For_06 {
	public static void main(String[] args) {
		
		//QUIZ
		//구구단 2단을 출력하기
		
		int i;
		int j = 2;
		
		for(i=1;i<10;i++) {
			System.out.println(j + "X" + i + "=" + (j*i));
		}
		
		//QUIZ
		//구구단 2-9단을 출력하기
//		for(j=2;j<10;j++) {
//			for(i=1;i<10;i++) {
//				System.out.println(j + "X" + i + "=" + (j*i));			
//			}
//			System.out.println();
//		}
	}
}