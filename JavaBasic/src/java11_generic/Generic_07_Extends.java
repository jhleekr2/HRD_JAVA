package java11_generic;

//	와일드 카드(Wild Card)
//	- 정해지지 않은 데이터 타입(unknown type)
//	- 매개변수, 필드, 지역 변수, 반환 타입에서 적용할 수 있다.
//	<?> : 어떤 타입이든지 적용할 수 있도록 준비된 와일드 카드
//	<? extends 상위타입>
//	지정한 상위타입의 하위 클래스로만 허용되는 와일드 카드 
//	<? super 하위타입>
//	저정한 하위타입의 상위 클래스로만 허용되는 외와일드 카드

public class Generic_07_Extends { //상속이랑 코드보면 많이 헷갈릴 것임.
	
	//정적 메소드
	public static <T extends Number> void print(T data) {
		System.out.println( data );
	}
	// T extends Number -> 상속구조 이용하여 Generic의 허용범위 좁힘
	// '숫자만 가능' 이라는 뜻(Number의 자식인 Integer, Double.... 만 허용)
	// 이러한 형태의 문법은 API에 자주 등장한다.
	
	public static void main(String[] args) {
		
		print(12345);
		Generic_07_Extends.print(432.523);
		
		//에러, T타입이 Number와 하위 클래스들로 제한되었다
		// -> <T extends Number>
//		print("Apple");
//		print(true);
	
	
	
	}
	
}
