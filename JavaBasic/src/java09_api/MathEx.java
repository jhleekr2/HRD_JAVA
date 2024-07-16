package java09_api;

//import java.lang.Math;
public class MathEx {
	public static void main(String[] args) {
		
		//Java 공식 문서를 볼 수 있어야 하며, 더 나아가 공식 문서 번역해서 블로그 포스팅까지
		//할수 있으면 더 좋다.
		
		//QUIZ. Math 클래스를 이용하여 출력하시오
		
		//원주율 출력
		System.out.println(Math.PI);
		
		//-10의 절댓값
		System.out.println(Math.abs(-10));
		
		//3.7의 올림값
		System.out.println(Math.ceil(3.7));
		//3.7의 내림값
		System.out.println(Math.floor(3.7));
		
		//-3.7의 반올림값
		System.out.println(Math.round(-3.7));
		
		//2.1의 3제곱값
		System.out.println(Math.pow(2.1, 3));
		
		//------------------------------------------------------------------------------
		
		int n1 = 11;
		int n2 = 19;
		
		int max = Math.max(n1, n2);
		int min = Math.min(n1, n2);
		
		for(int i = min; i < max; i++) {
			System.out.println(i);
		}
		
		System.out.println("-----------------");
		
		// Math.random();
		// 0.0(포함) ~ 1.0(제외) double형 랜덤 숫자 생성
		
		System.out.println( Math.random() * 5); // 0.0~5.0(제외)
		
		System.out.println((int)(Math.random() * 5) ); // 0~4
		
		System.out.println((int)(Math.random() * 5) + 20 ); // 20~24
		
//		System.out.println((int)(Math.random() * 랜덤숫자개수) + 시작값);
		
		System.out.println((int)(Math.random() * 3) + 1 ); // 1~3랜덤
	}

}
