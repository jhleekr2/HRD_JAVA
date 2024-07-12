package java09_api;

import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		
		// java.util.Random 클래스
		//-----------------------------------------------------------
		
		Random ran; //의사 난수 객체
		ran = new Random(); //의사 난수 객체 생성
		// 생성자 찾기 위해 API 찾아봐야 한다.
		
		System.out.println( ran.nextInt() );

		//-----------------------------------------------------------

		System.out.println( ran.nextBoolean() ); // true/false
		System.out.println( ran.nextDouble() ); // 0.0(포함) ~ 1.0(미포함)

		//-----------------------------------------------------------
		
		System.out.println( ran.nextInt(5) ); // 0 ~ 4

		System.out.println( ran.nextInt(100) ); // 0 ~ 99
		
		System.out.println( ran.nextInt(100) + 1 ); // 1 ~ 100
		
		System.out.println( ran.nextInt(3) + 7 ); // (0 ~ 2) + 7 -> 7 ~ 9
		//ran클래스를 참조해서 nextInt를 사용
		//-----------------------------------------------------------
		
		//10회 반복
		for(int i=0; i<10; i++) {
			
			switch( ran.nextInt(3) ) {
			case 0:
				System.out.println("가위");
				break;
			
			case 1:
				System.out.println("바위");
				break;
				
			case 2:
				System.out.println("보");
				break;
			}
		}
		// 기본적인 뽑기 구현
		// 불법 도박 사이트들은 코드를 조작하므로 믿어선 안된다.
	}
}
