package java06_class.UML;

public class Car {
	
//	클래스 다이어그램(Class Diagram) - 모든 언어에서 쓰는 표준적인 표기법
//	- 클래스의 내부 구조, 유형, 클래스 간 관계 등을 그림으로 표현한 것
//	- 접근제한자를 표현하는 기호
//
//	+: public
//
//	#: protected
//
//	~: default
//
//	-: private
//
//	- 변수의 데이터타입, 메소드의 반환타입, 메소드의 매개변수 타입을 클래스 다이어그램의 표기법에 맞게 작성한다
//	- 데이터타입을 문법요소 뒤에 : 을 붙이고 작성한다.
//	ex) 멤버필드 표기
//	private int num; → -num : int
//	
//	public String name; → +name : String
//
//	ex) 멤버메소드 표기
//	public void display(int n1, int n2) {}
//
//	→ + display( n1:int, n2:int) : void
//	→ + display( int, int) : void (매개변수 이름을 맘대로 정할 수 있도록 한 방법)
//
//	UML 웹 도구 사이트
//	[draw.io](http://draw.io) 접속
//	
	// - model : String
	// - color : String
	private String model; // 자동차 모델
	private String color; // 자동차 색깔
	
	//constructor
	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	//method
	public void display() {
		System.out.println(model + ", " + color);
	}
	
	//setter
	public void setModel(String model) {
		this.model = model;
	}
	public void setColor(String color) {
		this.color = color;
	}
//	//기본 초기화(오버라이드) - 여기선 만들면 안된다. 기본적으로
//	public void setModel() {
//		model = "Undefined";
//	}
//	
//	public void setColot() {
//		color = "Undefined";
//	}
	//getter
	public String getModel() {
		return model;
	}
	public String getColor() {
		return color;
	}
	
	
}
