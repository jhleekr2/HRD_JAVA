package java07_inherit.practice.controller;

//import java07_inherit.practice.model.Point;
import java07_inherit.practice.model.Rectangle;
import java07_inherit.practice.model.Circle;

public class Main {
	public static void main(String[] args) {
		
//		* 구현내용
//		Circle 배열 초기화 : 3개
		
		//테스트
//		Circle c = new Circle(); // 왼쪽은 변수, 오른쪽은 인스턴스이며 오른쪽에 정보와 값 저장
//		
//		
		// 문제에는 언급이 없었지만 Point를 테스트 해야 한다
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
		// 배열 선언
//		double[] arr; -> 참조형 배열변수 선언
		
		// 배열 생성
//		arr = new double[3];
		
//		배열 선언 & 생성
//		-> double[] arr = new double[3];
		
//		Point 객체를 저장할 수 있는 배열 선언 & 생성
//		Point[] arr = new Point[3];
//		마찬가지로
//		Circle[] arr = new Circle[3];
//		Rectangle[] arr = new Rectangle[3];
//		로 만들 수 있다. 따라서,
//		Point[] arr = new Point[3];
		// -> 객체 변수만 3개 선언
		
		//인스턴스 생성
//		arr[0] = new Point(3, 5);
//		arr[1] = new Point(6, 3);
//		arr[2] = new Point(4, 2);
		
		// 다른 부분은 다 성공적으로 만들었으나, 배열 선언 & 생성 과정 및 인스턴스 생성 과정에서 문제가 있었다.
//		for(int i = 0; i< arr.length; i++) {
//			arr[i].draw(); // draw에 대한 동작 테스트
//		}
		
		// ---------------------------------------------------------------
		
//		Rectangle 배열 초기화 : 3개
//		각각 draw() 출력 처리
		
		//클래스 생성 후에는 Point, Circle, Rectangle도 자료형이 된다.
		//Circle 테스트
//		Circle c1 =new Circle(); //c1 정의 및 초기화
//		c1.setX(3);
//		c1.setY(5);
//		c1.setRadius(5);
//		c1.draw();
//		
//		Circle c2 = new Circle(5,4,6);
//		c2.draw();
//		
//		Circle c3 = new Circle(3,7,5);
//		c3.draw();
//		
		//Circle 배열 초기화(3개)
		Circle[] circles = new Circle[3];
		circles[0] = new Circle();
		circles[1] = new Circle(1,2,3);
		circles[2] = new Circle(3564,234,664);
		
		//이때 for 입력하고 Ctrl+space 누르면 배열 관련하여 자동으로 완성할 수 있는 옵션이 나온다.
		for(int i=0; i< circles.length; i++) {
			circles[i].draw();
			System.out.println("------------");
		}
		
//		마찬가지로 Rectangle 테스트
//		Rectangle r1 = new Rectangle(); // r1 정의 및 초기화
//		r1.setX(6);
//		r1.setY(7);
//		r1.setWidth(5);
//		r1.setHeight(4);
//		r1.draw();
//		
//		Rectangle r2 = new Rectangle(5,4,8,6);
//		r2.draw();
//		
//		Rectangle r3 = new Rectangle(-3,5,5,6);
//		r3.draw();
		
		//Rectangle 배열 초기화(3개)
		Rectangle[] rects = new Rectangle[3];
		rects[0] = new Rectangle();
		rects[1] = new Rectangle(1,2,3,4);
		//rect 배열을 2개만 초기화하면 NullPointerException 에러 발생한다.
		rects[2] = new Rectangle(34,466,45,3552);
		
		for(int i=0; i< rects.length; i++) {
			rects[i].draw();
			System.out.println("------------");
		}
		
		// 개인적으로 풀이에 시간도 많이 걸렸지만, 얻어가는 점도 많았던 문제!
		

//		for (int i=0;i<5;i++) {
//			Point pt = new Point(); //Point형 객체 배열 선언
//		}
			
		
	}
}