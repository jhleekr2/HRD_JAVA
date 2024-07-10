package java07_inherit.practice.controller;

import java07_inherit.practice.model.Point;
import java07_inherit.practice.model.Rectangle;
import java07_inherit.practice.model.Circle;
public class Main {
	public static void main(String[] args) {
//		Point pt = new Point(); //pt
//		
//		pt.draw();
//		
//		pt.setX(3);
//		pt.setY(5);
//		
//		pt.draw();
//		Point pt2 = new Point(2,3);//pt2
//		
//		pt2.draw();
//		
		Circle c1 =new Circle(); //c1 정의 및 초기화
		c1.setX(3);
		c1.setY(5);
		c1.setRadius(5);
		c1.draw();
		
		Circle c2 = new Circle(5,4,6);
		c2.draw();
		
		Circle c3 = new Circle(3,7,5);
		c3.draw();
		
		Rectangle r1 = new Rectangle(); // r1 정의 및 초기화
		r1.setX(6);
		r1.setY(7);
		r1.setWidth(5);
		r1.setHeight(4);
		r1.draw();
		
		Rectangle r2 = new Rectangle(5,4,8,6);
		r2.draw();
		
		Rectangle r3 = new Rectangle(-3,5,5,6);
		r3.draw();
	}
}