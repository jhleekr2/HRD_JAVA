package java01_variables;

public class Variables_07 {
	public static void main(String[] args) {
		//자바의 자료형 종류
		//1.8가지 기본형 데이터타입 - Primitive
		//2.참조형 데이터타입 - Reference, 레퍼런스
		//----------------------------------------------------
		//대표적인 참조형 데이터타입 - String 타입(참조형이지만, 기본형에 가깝게 동작한다.)
		//문자열을 표현하기 위해 JRE 라이브러리에 정의되어 있다.
		//문자열 - ""
		//문자(char)들의 나열
		
		//큰따옴표를 이용하여 String 타입 리터럴 상수를 표현할 수 있다.
		//첫글자가 대문자 - 클래스 이름 또는 라이브러리(뭔가 임의로 만들어낸것 들은 전부 첫글자 대문자 처리)
		//오라클의 공식 라이브러리 설명서를 읽어볼것!
		//오라클 공식 라이브러리 첫줄에 핵심이 적혀있다.
		
		int num; // int 타입 변수 num
		num = 12345; // 대입
		System.out.println(num);
		
		String data; // String 타입 변수 data
		data = "Apple"; // 대입
		System.out.println(data);
		//기본형과 참조형 사용법은 크게 다르지 않으나, 사용할 수 있는 데이터의 유형이 다르다. 참조형의 데이터 유형은
		//굉장히 자유롭고 다양한 데이터 유형들이 올 수 있다. 이 때 참조형마다 올 수 있는 데이터 유형이 다르기 때문에
		//공식 설명서를 많이 읽어볼 필요가 있다!
		
	}
}