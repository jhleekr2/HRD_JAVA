package java04_control.selection;

public class Switch_03 {
	public static void main(String[] args) {
		
		//switch 구문에서 사용할 수 있는 비교 대상의 타입
		// 정수, 문자(char), 문자열(String)
	
		double d = 3.14; 
//		switch (d) { // 오류 발생 -Cannot switch on a value of type double.
		// Only convertible int values, strings or enum variables are permitted.
		// enum = enumeration(열거체). 이 수업에서는 다루지 않는다.
//		}
	
		//---------------------------------------------------
	
		boolean b = true;
//		switch (b) { // 오류 발생 - boolean 형은 내부적으로 정수형이지만
		// 자바에서는 문법에서 막고 있다.
//		}
	
		//---------------------------------------------------

		//char형은 정수값(ASCII CODE)으로 처리된다.
	
//		char alpha = 'A';
		char alpha = 'B';
	
		switch( alpha ) {
		case 'A': // case 65:  
			System.out.println("사과");
			break;
		
		case 66: // case 'B':
			System.out.println("바나나");
			break;
		}
	
		//---------------------------------------------------

		//switch에서 String 타입 사용 가능
		// -> JDK 1.7 이상
		// JDK 버전 확인해서 버전에 따른 대처가 필요하다!
		
		String str = "Banana";
		
		switch ( str ) {
		case "Apple": // str == "Apple"
			System.out.println("사과");
			break;
			
		case "Banana": // str == "Banana"
			System.out.println("바나나");
			break;	
		}
		
		//---------------------------------------------------

		System.out.println("----------------------------");
		
//		str = "Apple";
//		
//		if( str == "Apple") {
//			System.out.println("사과");
//		} else if(str == "Banana") {
//			System.out.println("바나나");
//		}
		
		// 위의 코드(Switch문을 if문으로 변환한 것)에는 결함이 있다.
		
		// ** String(문자열) 데이터가 같은 지 비교할 때 ==연산자를 사용하지 않는다.
		
		// ** String 타입에는 동등비교하는 메소드(기능)가 준비되어 있다.
		// 문자열.equals( 비교대상 ) 
		// 문자열을 기준으로 둥근괄호 안을 비교해서 같으면 true, 다르면 false를 반환한다.
		// 올바르게 고친 코드는 아래와 같다.
		
		if( str.equals("Apple") ) {
			System.out.println("사과");
		} else if ( str.equals("Banana") ) {
			System.out.println("바나나");
		}
		
		// 이유는 뭘까? 이유는 7/4~7/5 사이 강의에서 차차 다루게 될 예정.
	}
}
