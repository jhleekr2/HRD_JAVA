package java07_inherit.practice.controller;

import java07_inherit.practice.model.Circle;
import java07_inherit.practice.model.Point;
import java07_inherit.practice.model.Rectangle;
// Ctrl+Shift+O 단출키로 Import를 넣고 지우고 할 수 있다.
public class Main2 {
	public static void main(String[] args) {
		
//		 + 추가 내용
//			* 구현내용
//			1. Point 형 객체 배열 선언, 생성 : 5개
//			2. 각 index별로 Circle, Rectangle 객체 생성, 초기화함(임의대로)
//			3. for 문 사용 : draw() 메소드 실행함
		
		Point[] points = new Point[5];
		
		points[0] = new Rectangle();
		points[1] = new Rectangle(3,5,4,5);
		points[2] = new Circle(3,5,2);
		points[3] = new Circle();
		points[4] = new Rectangle(2,4654,35,2);
		
		for (int i = 0; i < points.length; i++) {
			points[i].draw();
			System.out.println("------------");
			
		}
	}
}
