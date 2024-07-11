package java07_inherit;
	//바인딩(Binding)
	//-메소드의 정의코드(구현코드)와 메소드의 호출코드(사용코드)가 연결되는 과정
	//
	//-정적 바인딩(static)
	//프로그램 동작 전에 바인딩되는 것
	//객체 변수를 선언할 때 사용한 데이터타입의 메소드 정의 코드로 바인딩한다.,
	//→ Data Type 따지는 것
	//정적 바인딩을 표준으로 하는 언어들이 있는데(대표적으로 C언어), 이런 언어들은 동적 바인딩을 하도록 변환하는 문법을 제공하는데 그 난이도가 높다.
	//
	//-동적 바인딩(dynamic)
	//프로그램 동작 도중에 메소드가 호출될 때 바인됭되는 것
	//동적으로 생성된 인스턴스의 데이터타입의 메소드 정의 코드로 바인딩한다.
	//** 자바는 메소드의 호출을 동적 바인딩하고 있다.
class Parent2 {
	public int num;
	
	public void display() {
		System.out.println("부모 메소드");
	}
}
class Child2 extends Parent2 {
	public String name; //자식클래스의 고유 멤버
	public void print() {
		System.out.println("자식 고유 메소드");
	}
	public int num;
	//상속받은 멤버 필드와 같은 이름의 멤버 필드
	
	@Override
	public void display() {
		System.out.println("오버라이딩 메소드");
	}
}
//----------------------------------------------------------

public class InheritEx_02 {

	public static void main(String[] args) {
		Child2 c =  new Child2();
		
		c.num = 123; //Child2의 고유멤버 num에 대입
	
//		(Parent2)c. -> (Parent2)와 .연산자가 부딪치는데, 그러면 .이 우선순위가 더 높다.
		( (Parent2)c ).num = 456; //Parent2에서 상속받은 num에 대입
		
		System.out.println("Child2 num : " + c.num);
		
		System.out.println("----------------------");
		
		//메소드는 Child2 타입으로만 실행된다.
		
		c.display();
		( (Parent2)c ).display();
		
		System.out.println("----------------------");
		
		//** 자바에서는 클래스 타입이 형변환이 금지되어 있다
		
		//** 단, 자식클래스를 부모클래스타입으로만 형변환할 수 있다
		// -> 자동형변환도 된다
		
		// Parent2 <- Child2 형변환
		
		Parent2 pc = new Child2(); // new Child2()가 실체
		
		pc.num = 555; // Parent2에서 상속받는 num
		
		//** 인스턴스의 타입(Child2)으로 형변환하기 때문에 오류가 아니다
		((Child2)pc).num = 666; //Child2의 고유 멤버 num
		
		//에러, Parent2타입의 변수 pc를 이용하여 메소드를 호출한다
		// -> Parent2 클래스에는 print() 메소드가 없다
		// -> 컴파일 타임을 넘기지 못한다
		// -> 문법 에러
//		pc.print();
		
		System.out.println("----------------------");

		// pc변수의 자료형 - Parent2
		
		// 동적 바인딩
		// -> 메소드를 호출하는 시점에 인스턴스의 타입을 이용해서 메소드 호출
		// 상속에 관하여 이 개념은 중요!
		pc.display();

		System.out.println("----------------------");
		
		Parent2 p2 = new Parent2(); // 정적 시점에선 괜찮음
		
		//에러, 부모 타입을 자식 타입으로 사용할 수 없다
		// -> ClassCastException 예외가 발생한다.
//		( (Child2)p2 ).num = 777; //실행중 에러 - 부모 클래스를 자식으로 형변환할수 없다.
		
		//에러, 부모 타입을 자식 타입으로 사용할 수 없다
		// -> ClassCastException 예외가 발생한다.
//		Child cs = (Child2) new Parent2();
	}
}
