package java09_api;

public class StringBuilderEx {

	public static void main(String[] args) {
		
		StringBuilder sb;
//		StringBuffer sb; //StringBuffer를 사용해도 되지만, 굳이 멀티스레드 환경도 아닌 상태에서
		//StringBuffer를 사용하는 것은 성능상의 손실이 있다.
		
		//에러, String처럼 사용할 수 없다
//		sb = "Apple";
		//기능적으로는 String, StringBuilder, StringBuffer가 많이 비슷하지만, 섞어서 쓸수 없다.
		
		//따라서, 문자열 객체 생성이 필요하다.
		sb = new StringBuilder();
//		sb = new StringBuffer();
		
		info(sb);
		
		System.out.println("\n--- Apple 추가 ------");
		
		sb.append("Apple");
		sb.append(12345);
		sb.append(true);
		
		System.out.println( sb );
		
		info(sb);
	
		//QUIZ.
	    System.out.println("\n---insert-------");
	    // 5번째 인덱스에 "Orange" 넣고 출력 - insert
	    System.out.println(sb.insert(5,"Orange"));
	    info(sb); 
	    
	    System.out.println("\n---deleteCharAt-------");
	    // 3번째 인덱스 삭제하고 출력 - deleteCharAt
	    System.out.println(sb.deleteCharAt(3));
	    info(sb);
	    
	    System.out.println("\n---substring-------");
	    // substring(1, 7) 결과 출력
	    System.out.println(sb.substring(1,7));
	    info(sb);
	    
	    System.out.println("\n---trimToSize-------");
	    // trimToSize() 수행
	    System.out.println(sb);
	    System.out.println("trimToSize() 수행");
	    sb.trimToSize();
	    System.out.println(sb);
	    info(sb);
	    
	    System.out.println("\n---reverse-------");
	    // reverse() 호출 후 결과 출력	
	    System.out.println(sb.reverse());
	    info(sb);
		
	} // main end
	
	public static void info(StringBuilder sb) {
		System.out.println("length : " + sb.length()); // 문자열의 길이
		System.out.println("capacity : " + sb.capacity()); //저장 용량 - 기본값은 16
		
		
	}
}
