package java07_inherit;

//- 상속(Inheritance)
//-기존의 클래스를 재사용하여 새로운 클래스를 작성하는 문법
//Class A를 Class A_1으로 상속하면, 기존 Class A에 정의되어 있는 field, method 코드들이 자동으로 추가된다(코드 재사용). 이후 Class A_1에서 field, method 코드를 변형하여 개발할 수 있다.
//-클래스를 정의하는 코드의 재사용성을 높인다
//** 코드 재사용성
//기존에 개발된 코드를 이용하여 새로운 코드를 개발하는 것을 뜻한다.
//필요한 부분을 추가, 수정하여 작성한다.
//앞으로 자바에서 나올 어려운 문법들의 대다수는 코드의 재사용성을 높이기 위한 것들이 많다.
//애초에 클래스, 메소드 개념 자체가 코드 재사용성을 위한 목적.
//
//-클래스들의 중복되는 코드들을 한 곳에 몰아서 관리할 수 있게 된다.
//-상속을 주는 클래스의 코드를 변경하면 상속을 받는 클래스들도 전부 반영된다.
//-상속을 주는 클래스:부모 클래스(Parent class), 수퍼(Super) 클래스, 상위, Based(기준의)
//-상속을 받는 클래스:자식 클래스(Child class), 서브(Sub) 클래스, 하위, Derived(유도된, 파생된)
//부모 클래스
class Parent {
	String name; //상속을 강조하면 protected, 안그러면 default 정도가 적당 -> 실제 개발에선 protected!
	int age;
	
	public void display() {
		System.out.println("Parent 클래스 메소드");
	}
}

//자식 클래스
class Child extends Parent {//Child 클래스가 Parent 클래스의 상속을 받는다.
	//Parent 클래스를 받아서 확장한 클래스 Child
	int score; // child만의 고유한 멤버
	
	public void print() {
		System.out.println("Child 클래스 메소드");
	}
	
	@Override
	public void display() {
		System.out.println("오버라이딩 메소드");
		super.display(); // parent클래스의 재정의되기 전의 원래 메소드를 실행한다.
	}
	//child 클래스의 display메소드의 수 - 1개(오버라이딩 되면서 덮어씌움)
	
	public void display(int num) {
		System.out.println("오버라이딩한 메소드를 오버로딩한 메소드");
	}
	// CS면접에 오버라이딩과 오버로딩의 차이점을 구분하는 문제가 나온 적도 있다.
	
	//** 오버라이딩(Overriding)
	// 메소드 재정의
	// 상속받은 메소드의 기능을 재정의하는 것
	// -> 부모 클래스에서 상속받은 메소드의 리턴 타입, 이름, 매개변수 형식이
	// 같아야 한다.
	// 이클립스에서는 초록색 화살표로 오버라이딩 메소드를 표기한다.
	// @ov + Ctrl + Space 단축키로 오버라이드 주석을 추가할 수 있다. 주석 추가하면 컴파일러가
	// 좀더 꼼꼼하게 오버라이딩 메소드의 문법을 검사해 준다.
	
	//** 어노테이션(Annotation, 에너테이션)
	//@ 으로 시작하는 자바 문법
	//자바 코드에 부가적인 기능 또는 의미를 부여할 때 사용한다.
	//특정 동작을 적용하거나 코드에 문법을 강제할 때 사용한다.
	// @Override, @SuppressWarning, @Deprecated, @Target, @Controller, @WebServlet 등.....
	
	//** @Override 어노테이션
	//오버라이딩 규칙이 잘 지켜졌는지 유효성 검사를 진행한다
	//문법에 맞지 않으면 문법 에러가 발생한다 -> 워낙 오버라이딩 관련 프로그램 오류가 많다보니 추가함!
	//상속받은 메소드에 적용할 수 있다.
}

public class InheritEx_01 {
	public static void main(String[] args) {
		
		Parent p = new Parent();
		
		p.name = "Alice";
		p.age = 123;
		
		p.display();
		
		System.out.println("--------------------");
		
		Child c = new Child();
		
		c.name = "Bob"; // 상속받은 필드
		c.age = 345; // 상속받은 필드
		// 코드가 없지만, 부모로부터 물려받았기에 그냥 쓰면 된다.
		
		c.score = 100; // 상속받지 않은 필드
		
		//---------------------------------------------------------
		
		c.display(); // 상속받은 메소드 -> 상속받은 메소드를 재정의(Overriding)한 메소드
		// 자식 클래스에는 display()가 없지만 부모 클래스의 display() 가 출력된다.
		// 만일, 자식 클래스에 동일한 메소드가 존재한다면, 존재하는 동일한 메소드가 우선 실행된다.
		// (오버라이딩, overriding)
		c.print(); // 상속받지 않은 메소드
	}
}
