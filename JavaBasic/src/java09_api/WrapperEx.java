package java09_api;

public class WrapperEx {
	public static void main(String[] args) {
//		 Wrapper 클래스
//		 - 기본 데이터타입을 참조형으로 포장하는 클래스
//		 - 기본형 데이터를 참조형으로 사용할 수 있게 해준다
//
//			기본형		참조형 (Wrapper클래스)
//
//			boolean		Boolean
//
//			char		Character	(기본형과 이름이 다름)
//
//			byte		Byte
//			short		Short
//			int			Integer		(기본형과 이름이 다름)
//			long		Long
//
//			float		Float
//			double		Double
//
//		 Wrapper 클래스의 존재 이유
//		 - 기본형들을 자바 클래스의 상속 구조(계층 구조)에서 빠져있다
//		 - Object클래스의 자식 타입이 아니다
//		 -> 다른 클래스와여 연관이 없어 재사용성을 높이기 힘들다
//
//		** 기본 자료형을 클래스로 표현할 수 있게 만들어 재사용성을 높인다
		
		//int형 변수 ( 기본형 )
		int num = 10;
		
		//Integer형 변수( 참조형 )
		Integer iVal1 = 12345;
		Integer iVal2 = num;
		
		//** Wrapper 클래스들을 기본형처럼 사용하면 된다
		
		//----------------------------------------------------
		
		//** Wrapper 클래스의 생성자들은 Deprecate 되어 있다
		//대신 valueOf()를 사용하도록 권장하고 있다.
		//이유 - Wrapper 클래스의 생성자 쓰는 것이 성능상 손실이 있음
		
		Integer iVal3 = new Integer( "300" );
		Integer iVal4 = new Integer( 300 );
		
		//----------------------------------------------------
		
		//** int 타입으로 Integer타입값 대입할 수 있음
		// -> int, Integer를 서로 같은 타입이라고 생각하면 된다
		
		int i1 = iVal1;
		int i2 = iVal2;
		
		//----------------------------------------------------
		
		//자료형에 대한 정보
		
		System.out.println("BYTES : " + Integer.BYTES); // 4 (byte)
		System.out.println("SIZE : " + Integer.SIZE); // 32 (bit)
		
		System.out.println("Double BYTES : " + Double.BYTES); // 8 (byte)
		
		System.out.println("Boolean BYTES : " + Boolean.TRUE); // true
		System.out.println("Boolean BYTES : " + Boolean.FALSE); //false
		
		System.out.println("------------");
		
		System.out.println("MIN_VALUE : " + Integer.MIN_VALUE);
		System.out.println("MAX_VALUE : " + Integer.MAX_VALUE);

		System.out.println("MAX_VALUE : " + Long.MAX_VALUE);
		
		System.out.println("------------");
		
		//** parse
		//	-> (문법적으로) 분석한다
		//	-> 파싱
				
		//	-> 일정한 패턴을 이용하여 원하는 형식의 데이터를 추출한다
		
		//-----------------------------------------------------------------------
		
//		Integer.parseInt("문자열") : int
		// -> "문자열"에서 int타입 데이터를 추출하여 반환한다.
		
		//기본형 <- 문자열 ( Wrapper.parseType( String ) )
		int number = Integer.parseInt("987");
		double dNum = Double.parseDouble("323.345");
		boolean bData = Boolean.parseBoolean("true");
		
		//문자열 <- 기본형 ( String.valueOf( data ) )
		String iStr = String.valueOf( 12356 );
		String bStr = String.valueOf( false );

	}
	
}
