package java09_api;

import java.util.Random;

	//API(Application Programming Interface)
	//- 응용 프로그램 개발 인터페이스
	//응용 프로그램 ↔ 시스템 프로그램(운영체제)
	//- 응용 프로그램을 개발하기 위해 만들어진 코드들을 뜻한다
	//- 주로 운영체제(OS)에 맞게 개발용 코드가 준비되어 있다
	//참고)윈도우즈 API정복 책을 보면 윈도우 API를 공부할 수 있다. → soen.kr사이트 참고
	//- 응용프로그램이 운영체제(OS)또는 기타 시스템과 상호작용(통신)할 때 사용되는 메시지 형식을 API라고 한다.
	//→ 주로 함수(function)의 형태로 제공된다.
	//** 자바 언어에서는 클래스와 인터페이스 형태로 API가 제공된다
	//** 자바 프로그램을 개발하기 위해 JRE에 포함되어 있다.
	//(JDK 설치할 때 같이 설치된다)
	//** JVM에서 프로그램을 실행할 때 연결된다
	//** 구글에서 Java 8 API document 입력하고 검색할 수 있다.
	//
	//Ramdom 클래스
	//- 의사난수(pseudo-random number)를 연속적으로 생성하는 클래스
	//** 의사(pseudo)
	//꾸며진, 지어낸, 비슷하게 흉내낸
	//** 난수(random (number))
	//무작위 경우의 수
	//- 컴퓨터는 무작위(random)을 판단하지 못한다
	//- 실제 현실의 랜덤처럼 흉내낸 의사 난수를 활용한다
	//
	//컴퓨터에서 의사 난수를 생성하는 원리
	//- seed(기초값)를 복잡한 연산을 통해 결과값을 만든다
	//→ 결과값을 예측하기 힘들게 만든 것
	//- seed가 고정되거나 미리 연산식을 알고 있다면 다음 난수를 예측하기 쉬워진다
	//→ seed를 수시로 변경하도록 프로그래밍한다
	//- 현재 시간은 seed로 사용한다
	//- 첫 랜덤 추출에 seed를 현재 시간으로 적용한다
	//- 다음 seed는 이전 의사난수 계산값을 이용한다
	//
	//** 에포크 타임(Epoch Time)
	//유닉스 타임
	//1970년 1월 1일 00시 00분 00초를 기준으로 현재까지 흘러간 시간을 정수로 표현한다
	//단위는 초(s), 밀리초(ms)

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
