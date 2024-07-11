package java07_inherit.practice.model;

public class Point {
	
	//멤버필드
	protected int x; //UML에서 콜론뒤에 있는 것을 자바에선 먼저 적는다.(# x : int)
	protected int y;
	
	//Constructer
	public Point() {//default 생성자
//		this.x=0;
//		this.y=0;
		setX(0); // 다른 멤버 메소드를 이용한 구현(setter 사용)
		setY(0);
	}

	public Point(int x, int y) {///모든 필드 초기화하는 매개변수 있는 생성자
//		this.x = x;
//		this.y = y;
		setX(x); // 다른 멤버 메소드를 이용한 구현
		setY(y);
	}

	//getter, setter - 원래는 필요할 때만 만들지만, 요즘은 getter, setter는 개발할 때 꼭 만든다.
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	//메소드 구현
	
	//x, y 좌표값 출력 ex) (3, 4)
	public void draw() {
		System.out.println("(" + x + ", " + y + ")");
	}
}
