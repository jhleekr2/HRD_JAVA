package java08_abstract.interfaceEx;

public interface TestInterface {

	//인터페이스(Interface)
	// 상수 멤버 필드
	// -> 상수 모음 인터페이스
	
	// 추상 멤버 메소드
	// -> 추상 메소드만 모아서 클래스의 메소드 개발 가이드 역할
	//** 추상 메소드 - 오버라이딩 강제역할이 있다.->개발 편의 도모!
	//----------------------------------------------------------------------
	
	// 상수 멤버 필드
	// -> public static final 키워드가 붙은 필드만 선언 가능하다.(곧바로 접근가능한 공개적인 상수)

	//선언과 동시에 초기화 필수
	public static final int NUM1 = 123;
	
	//----------------------------------------------------------------------
	
	//public static final 키워드들을 생략해도 모든 키워드가 자동으로 붙어서 선언된다
	
	//** 키워드를 생략해서 적으면 오히려 헷갈린다
	// -> public static final 키워드 모두 적어서 선언하도록!
	
	int NUM2 = 234;
	public int NUM3 = 345;
	static int NUM4 = 456;
	final int NUM5 = 567;
	
	//----------------------------------------------------------------------
	
	//에러 - 일반 메소드를 멤버로 가질 수 없다
//	public void method() {
//	}
	
	//추상 메소드 - 추천
	public abstract void display();
	
	//추상 메소드 - 비추천
	// -> 인터페이스 안에서는 abstract 키워드를 생략해도 추상 메소드로 판단한다.
	public void out();
	
	
}
