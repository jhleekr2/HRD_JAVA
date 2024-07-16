package java09_api;

import java.util.StringTokenizer;

public class StringTokenEx {
	public static void main(String[] args) {
		
		//문자열 토큰, String Token
		// -> 특정 규칙을 이용하여 문자열을 잘게 나누어 구분하는 단위
	
		//ex) "1,2,3,4,5"
		
		// -> ","를 이용하여 구분한다 - 구분자(delimiter)
		
		// -> 토큰:"1" "2" "3" "4" "5"
		
		//--------------------------------------
		
		//문자열의 토큰화(Tokenize);
	
		String data1 = "HI HELLO HOLA";
		
		String[] tokens = data1.split(" ");
		
		for( String token : tokens )
		{
			System.out.println(token);
		}
		
		System.out.println("------------");
		
//		String data2 = "I-eam-espider-eman";
		String data2 = "I!@#am!@#Spider!@#man";
//		String data2 = "I am Spider man";
//		tokens = data2.split("!$#");
		
		//문자열에 따라 split()함수가 오동작하는 현상이 보고되어 있다.
		//이부분은 질문 결과, 정규식의 특수문자로 $가 포함되어 있어서 발생한 현상으로 확인되었고
		//자세한 내용은 정규식 할때 배울 예정. 정규식을 배워야 문자열에 따른 split()함수가 오동작하는
		//현상을 피할 수 있다.
//		for( String token : data2.split("-e") )
		for( String token : data2.split("!@#") )
		{
			System.out.println(token);
		}
		
		System.out.println("------------");
		
		StringTokenizer st1 = new StringTokenizer(data1); //기본 구분자 : 공백문자
		System.out.println("토큰의 개수 : " + st1.countTokens());
		
		//** StringTokenizer의 주요 메소드
		
		//public int countTokens()
		// -> 토큰의 개수
		// -> nextToken() 실행할 수 있는 횟수를 반환
		
		//public boolean hasMoreTokens()
		// -> nextToken() 실행할 수 있는지 boolean 반환
		// -> 다음 토큰이 있으면 true, 없으면 false 반환
		
		//public String nextToken()
		//public String nextToken(String delim)
		// -> 다음 토큰을 반환한다
		// -> 매개변수로 구분자를 지정하면 이전 구분자 대신 이용한다
		
		System.out.println("------------");
		
//		StringTokenizer st2 = new StringTokenizer(data2, "-e");
		StringTokenizer st2 = new StringTokenizer(data2, "!@#");
		
		System.out.println("count : " + st2.countTokens());//남아 있는 토큰 수를 알려준다.
		System.out.println(st2.nextToken());
		
		System.out.println("count : " + st2.countTokens());//남아 있는 토큰 수를 알려준다.
//		System.out.println(st2.nextToken());
		
//		System.out.println(st2.nextToken("!")); //구분자를 -로 변경
//		System.out.println(st2.nextToken());
//		System.out.println(st2.nextToken());
		
		//에러, NoSuchElementException, 더이상 토큰이 없다.
//		System.out.println(st2.nextToken());

		System.out.println("------------");
		
		String data3 = "I!am@iron man";
		
		StringTokenizer st3 = new StringTokenizer(data3, "[!@ ]");
		
		//** 정규식으로 표현된 "[!@ ]"의 의미
		// -> "!" 또는 "@" 또는 " "셋 중 아무거나 하나
		
		//토큰이 남아있는 만큼 하나씩 꺼내서 출력하기
		while(st3.hasMoreTokens() ) {
			System.out.println(st3.nextToken());
		}
		
		
	}
}
