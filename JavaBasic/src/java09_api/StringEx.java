package java09_api;

import java.util.Locale;

public class StringEx {
//		String 클래스
//		- 패키지: java.lang
//		- 문자열을 표현하는 클래스
//		- 문자열 객체, 문자열 리터럴 상수 모두 String 클래스 타입으로 적용된다
//		
//		문자열 객체 사용 방법
//		- 방법1. 리터럴 상수
//		ex)	String str1 = "Apple";
//		- 방법2. String 객체 생성
//		ex)	String str2 = new String("Banana");
	
	public static void main(String[] args) {
		
		String str1 = "Apple"; //String 리터럴 상수
		String str2 = new String("Banana"); //String 객체 생성 (동적 할당)
		
		//-------------------------------------------------------
		
		System.out.println("--- length() -------");
		
		System.out.println("str1의 길이 : " + str1.length()); //5
		System.out.println("str2의 길이 : " + str2.length()); //6
		
		System.out.println("\"Cherry\"의 길이 : " + "Cherry".length());
		
		//-------------------------------------------------------
		//QUIZ.
		
		System.out.println("\n--- toLowerCase() -------");
		//str1 문자열의 모든 알파벳을 소문자로 변경한 결과를 반환한다.
		String lower = str1.toLowerCase();
		System.out.println("lower : " + lower);
		
		System.out.println("\n--- toUpperCase() -------");
		//str2 문자열의 모든 알파벳을 대문자로 변경한 결과를 반환한다.
		String upper = str2.toUpperCase();
		System.out.println("upper : " + upper);
		
		System.out.println("\n--- charAt(int) -------");
		//str1의 3번째 인덱스 값을 추출한다
		char alpha = str1.charAt(3);
		System.out.println("3번째 인덱스 값 : " + alpha);

		System.out.println("\n--- replace(char, char) -------");
		//str2 문자열의 'n'을 'X'로 변환한다
		String replace = str2.replace( 'n', 'X' );
		System.out.println( replace );
		
		String replace2 = str2.replace( "n", "X" );
		System.out.println( replace2 );

		System.out.println("\n--- contains() -------");
		//특정 문자열을 포함하고 있는지 확인한다
		boolean b = str1.contains("pp");
		System.out.println( b );

		System.out.println("\n--- substring() -------");
		//문자열의 일부를 발췌한다
		
		String sub1 = str1.substring(2);
		System.out.println("sub1 : " + sub1);
		
		String sub2 = str1.substring(1,3); //endIndex인 3 인덱스는 제외한다.
		System.out.println("sub2 : " + sub2);
	}
}
