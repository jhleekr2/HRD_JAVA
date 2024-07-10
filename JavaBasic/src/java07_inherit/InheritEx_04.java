package java07_inherit;

class Parent4 {
	protected int num;
	
	public Parent4() {
		
		//this 생성자 호출 코드
		// -> 같은 클래스의 다른 생성자를 호출한다
		this(0); //적지 않아도 기본적으로 수행되는 동작
		
		System.out.println("부모 디폴트 생성자");
	}
	
	public Parent4(int num) {
//		this();
		
		System.out.println("부모 매개변수 있는 생성자");
		
		this.num = num;
	}
}

class Child4 extends Parent4 {
	
	//** super() 생성자 호출
	// -> 부모 클래스의 생성자를 호출하는 코드
	// -> 호출코드를 생략해도 자식 클래스의 생성자는
	// 첫 번째 코드로 부모 생성자를 호출하도록 되어 있다
	public Child4() {
		
		System.out.println("자식 디폴트 생성자");
	}
	
	public Child4(int num) {
		//부모 디폴트 생성자를 호출한다 - 기본 동작
//		super();
		
		//부모 매개변수 생성자를 호출한다 - 선택 동작(직접 작성해야 함)
		super( num );
		
		System.out.println("자식 매개변수 있는 생성자");
		
		//상속받은 num 필드 초기화
//		super.num = num; // 실제 실행하면 코드의 재사용성이 오히려 악화되어 있다.
		
		//에러 안남, Child4에 num 필드가 없어서 super영역에서 찾는다
//		this.num = num; // 이 코드도 별로 좋지 않다.
	}
	
}

public class InheritEx_04 {
	public static void main(String[] args) {
		
		Parent4 p1 = new Parent4(); // 매개변수 안넣으면 부모 디폴트 생성자 호출
		System.out.println("------------------------");

		Parent4 p2 = new Parent4( 111 ); // 부모 매개변수 있는 생성자 호출
		System.out.println("------------------------");

		//자식 디폴트 생성자 호출
		Child4 c1 = new Child4();
		System.out.println("------------------------");
		//자식 매개변수 있는 생성자 호출
		Child4 c2 = new Child4( 777 );
	}
}
