package java06_class.variable;

public class ClassVariable_02 {

	//멤버필드 -> 인스턴스 변수
	private int num;
	
	//멤버필드 -> 클래스 변수, static 변수, 정적변수
//	privatec static String city = "Seoul";
	public static String city = "Seoul";
	
	//** static == 정적 == 실행 전
	//** dynamic == 동적 == 실행 후
	
	//------------------------------------------------------
	
	//인스턴스 변수(멤버필드의 일종)
	private int data1 = 100;
	
	//멤버 메소드
	//정적 멤버 메소드
	// -> 정적인 시점(static)에 미리 호출될 수 있도록 준비해놓는다.
	// -> 객체생성 없이 정적인 방법으로 호출할 수 있게 된다.
	// 정적방법 - 클래스명.정적필드(또는 정적메소드) 를 통한 접근방법
	public static void test1() { 
		// 일반 멤버 메소드는 호출이 되려면 호출되려면 객체를 new를 통해 인스턴스를 만든 후에야 
		// 객체를 통해서만 가능(객체.메소드() ) - 인스턴스 메소드라고도 부름
		// static을 붙이면, 인스턴스 없이도 미리 실행이 가능하도록 준비를 마치게 된다(정적 메소드)
		
		//에러 - 메소드에 static 붙이면 미리 준비가 되어 있어야만 한다.(상수, 정적)
		// -> 정적 메소드에서는 인스턴스 변수를 사용할 수 없다.
		// -> 인스턴스 변수가 만들어지기 전에 실행 준비가 완료되어야 하기 때문이다
//		data1 = 200; // data1의 값이 100에서 200으로 바뀜
//		System.out.println( data1 );		
	}
	//------------------------------------------------------
	
	//** 정적 메소드에서는 정적 멤버필드만 사용할 수 있다
	// (this 키워드도 사용할 수 없다)
	
	//멤버 필드 - private가 기본
	//정적(클래스) 변수
	private static int data2; // new없이 사용가능한 메소드
	
	//정적 필드 Setter
//	public void setData2(int data2) { // new가 있어야만 사용가능한 메소드 -> 더이상 정적필드의 효과가 상실
//		this.data2 = data2;
//	}
	
	public static void setData2(int data2) {
//		this.data2 = data2; // this 사용 불가
		ClassVariable_02.data2 = data2; // this 대신 사용
	}
//	
	//정적 필드 Getter
	public static int getData2() {
		return data2;
	}
	//------------------------------------------------------
	
	//** 일반 메소드에서 정적 변수를 사용하는 것은 문제가 없다
	//반대의 경우는 문제 발생!
	
	//정적 변수
	private static int data3 = 5678; // 할당 -> 정적 시점에 먼저 준비
	
	//일반 멤버 메소드
	public void test2() {// 실행 준비 -> 동적 시점에 준비
		System.out.println( data3 );
	}

	//------------------------------------------------------
	
	//상수 필드
	// -> 상수 필드를 선언할 때 public static final을 고정으로 사용하는 편이다.
	// 원래 의미는 final만 사용해도 되지만, 사용하다보니 public static final까지
	// 붙이게 되었다.
	public final int MAX = 1000; //상수
}
	
	
	