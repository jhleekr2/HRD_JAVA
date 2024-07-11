package java07_inherit.practice.model;
//import java.lang.Math;

public class Circle extends Point{ // Circle 클래스는 Point 클래스 상속
	//때때로 public class Circle은 생략되기도 한다
	private int radius; // 멤버변수 선언(원의 반지름)
	
	//constructor 구현
	public Circle() {//디폴트 생성자
		super();
	}
	
	//단축키 생성자 - Field를 이용한 생성자 만들기와 Superclass를 이용한 생성자 만들기가 둘다 있다.
	
	//Field를 이용한 생성자 만들기 하면
//	public Circle(int radius) {
//		super();
//		this radius = radius;
//	}
	//이렇게만 생성된다, 문제점 - x,y에 대한 정보 부재!
	//따라서, 다음과 같은 형태의 코드로 고쳐야 한다.
	
	public Circle(int x,int y, int radius) {//매개변수 있는 생성자
		super(x,y); // x,y 좌표는 부모 클래스의 생성자로 넘김
//		setX(x);
//		setY(y);
		setRadius(radius);
//		this.radius = radius;
	}
	//사실 자동완성할때 field 선택하는 옵션이 대화상자에서 나오는데, 거기서 선택을 잘 하면 되긴 한다.

	//getter, setter 구현
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override // 오버라이딩 할때는 어노테이션을 적어두는 것이 좋다.
	public void draw( ) { // 메소드 오버라이딩
		System.out.print("원의 중심 좌표 : ");
		super.draw(); // 부모 메소드 결과 이용해서 원의 중심좌표 호출
		System.out.print("원의 반지름 : ");
		System.out.println(this.radius);
		// 이때 PI상수 이용은 import java.lang.Math 한 다음, Math.PI 로 이용한다.(단, java.lang에 한하여
		// import 안해도 된다는 규칙이 적용되어 import 없이 그냥 Math.PI만 적어줘도 오류가 안나긴 한다)
		// 또는 import 없이 java.lang.Math.PI라고 써줘도 된다.
		// 대문자 Math -> 클래스를 의미!
		double area  = Math.PI * radius * radius; // 원의 넓이 계산
		// 제곱 -> Math.pow 사용해도 된다.
		double circum = 2 * Math.PI * radius; // 원의 둘레 계산
		System.out.println("원의 넓이 : " + String.format("%.1f", area ) );
		System.out.println("원의 둘레 : " + String.format("%.1f", circum ) );
		
	}
}
