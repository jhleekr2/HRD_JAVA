package java09_api;

public class StringEx {

	public static void main(String[] args) {
		
		
		String str1 = "Apple"; //String 리터럴 상수
		String str2 = new String("Banana"); //String 객체 생성 (동적 할당)
		
		//-------------------------------------------------------
		
		
		
		System.out.println("\n--- substring() -------");
		//문자열의 일부를 발췌한다
		
		String sub1 = str1.substring(2);
		System.out.println("sub1 : " + sub1);
	}
}
