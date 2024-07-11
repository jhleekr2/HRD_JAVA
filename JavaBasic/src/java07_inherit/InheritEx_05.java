package java07_inherit;

class Parent5 {
	public void display() {
		System.out.println("부모 클래스");
	}
}
// 1대1 상속일때는 부모/자식클래스라는 용어를 쓰지만, 1대다 상속일때는 상위/하위클래스라는 용어를
// 쓰는 경우가 많다.
// 특히 상속이 여러 단계일 때는, 최상위/최하위 클래스란 용어도 사용된다.

// public과 class 사이에 여러 식별자를 넣을 수 있다.
// abstract, final, static 등등
// 단 static 식별자는 class에는 쓸수 없다.

//** final class
// 자식 클래스를 만들 수 없다
// 상속을 줄 수 없는 클래스가 된다
// JDK 문서에서 흔히 확인할 수 있다

//final class Child5 extends Parent5 {
class Child5 extends Parent5 {
	
	//** final 메소드는 더 이상 오버라이딩되지 않는다
	//** final 메소드는 재정의없이 자식 클래스에 상속된다
	
	@Override
	public final void display() {
		System.out.println("자식 클래스 오버라이딩");
	}
}

class GrandChild extends Child5 {
//	@Override
//	public void display() {
//		System.out.println("2번 재정의한 메소드");
//	}
	
}

//개발하다보면 상위 클래스로 갈수록 공통점이 모이고 기능들이 적은 경우와 최상위 클래스에만 핵심 기능들을
//몰아넣는 두 가지 경우를 볼 수 있다.

	//final 키워드
	//- 더이상 확장 또는 변경할 수 없도록 설정하는 키워드
	//적용 대상
	//- 변수
	//변수를 상수화한다
	//딱 한번만 초기화(대입)할 수 있도록 설정한다
	//
	//- 메소드
	//더이상 오버라이딩할 수 없도록 설정한다
	//
	//- 클래스
	//더이상 자식클래스를 생성할 수 없도록 설정한다.
	//
	//abstract 키워드
	//- 추상화 키워드
	//- 클래스, 메소드에 적용할 수 있다
	//- 각각 추상 클래스, 추상 메소드라고 부른다

public class InheritEx_05 {

}
