package java13_io.filterStream;

import java.io.Serializable;

public class Point implements Serializable {
	private int x;
	private int y;
	
	//생성자 : ctrl + space
	public Point() {}
	
	//매개변수 생성자 : alt + shift + s, o
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	//toString() : alt + shift + s, s
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	//getter and setter : alt + shift + s, r, alt + a, alt + r
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
	
	
}

