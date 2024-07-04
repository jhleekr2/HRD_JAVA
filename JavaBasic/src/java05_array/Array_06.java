package java05_array;

public class Array_06 {
	public static void main(String[] args) {
		
		//문자열 1개
		String str = "Cherry";
		
		//------------------------------------------------------
		
		//문자열 3개(배열)
		String[] strArr = new String[3];
		
		strArr[0] = "Alice";
		strArr[1] = "Bob";
		strArr[2] = "Clare";
		
		System.out.println( "문자열의 개수 : " + strArr.length );
		
		//전체 문자열 출력 - for문 이용
		
		for(int i=0; i<strArr.length; i++) {
			System.out.println( strArr[i] ); // strArr -> 배열, strArr[i] -> 문자열
			System.out.println( strArr[i].length() );
			
			System.out.println("---------------");
		}
		
		//strArr             -> String[] 타입
		//strArr.length      -> 배열의 길이 (3개의 문자열)
		
		//strArr[i]          -> i번째 문자열, String 타입
		//strArr[i].length() -> i번재 문자열의 길이, int타입
	}
}
