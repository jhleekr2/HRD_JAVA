package java07_inherit.practice.model;

public class Point {
	
	//멤버필드
	protected int x;
	protected int y;
	
	//Constructer
	public Point() {
		this.x=0;
		this.y=0;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//getter, setter
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
	
	public void draw() {
		System.out.println("(" + x + ", " + y + ")");
	}
}
