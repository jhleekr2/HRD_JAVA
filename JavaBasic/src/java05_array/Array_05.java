package java05_array;

public class Array_05 {
	public static void main(String[] args) {
		
		// 문자열(String)
		// 내부 데이터에 대한 처리를 char[] 을 이용한다.
		
		// 단, char[] 과 String은 같은 데이터타입은 아니다.
		//-------------------------------------------------
		
		// 둘은 서로 다르지만, 일부 공통점은 존재한다.
		
		String str = "Apple"; // 문자열
		
		char[] chArr = { 'A', 'p', 'p', 'l', 'e'}; // 문자(char)배열
		//-------------------------------------------------

		System.out.println( "문자열의 길이 : " + str.length() );
		
		System.out.println( "문자 배열의 길이 : " + chArr.length );

		//-------------------------------------------------
		
		System.out.println( "문자열의 세번째 글자 : " + str.charAt(2) );
		
		System.out.println( "문자 배열의 네번째 글자 : " + chArr[3] );
	
	}
	
}
