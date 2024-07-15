package java09_api;

import java.util.Objects;

public class Point {

	private int x;
	private int y;
	
	//--------------------------------------------------------------
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	//--------------------------------------------------------------
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

//	@Override
//	public String toString() {
//		return super.toString(); // 기본동작 실행됨
//		return "변경했다!";
//		return "(" + x + ", " + y + ")";
//	}
	//toString 재정의는 워낙 많이 쓰이다보니, 이클립스에서 Alt + Shift + S키를 이용한 메뉴에서
	//toString 재정의 자동완성 기능을 제공하고 있다.
	//toString 자동 생성 단축키 : alt+ shift + s, s

//	@Override
//	public boolean equals(Object obj) {
		//기본코드 : 동일성(==) 비교
//		return super.equals(obj);
		
		//--------------------------
		//ex)
		//p2.equals(p3); 를 호출했을 경우
		// -> 기준은 p2객체		
		// -> this == p2 ( 메소드를 호출한 기준 객체 )
		
		// -> 전달인자는 p3(전달인자 = 둥근 괄호 안에 있는 것)
		// -> obj == p3 ( 전달인자를 저장한 매개변수 객체)
		//--------------------------
		
//		if( this.x == ((Point)obj).x && this.y == ((Point)obj).y ) {
//			return true; //동등하다
//		}
//		
//		return false; //동등하지 않다.
//	}
	//hashCode와 equals의 재정의 역시 자동완성 기능 제공하고 있다.
	//hashCode(), equals() 자동 생성 단축키 : alt + shift + s, h
	
	// 자동완성 코드 - 직접 작성한 것보다 코드의 품질이 더 좋다.
	// 각종 예외처리까지 포함되어 있다.
	
	@Override
	public int hashCode() {
//		return Objects.hash(x, y); //해시 알고리즘 적용, 인스턴스 변수 이용 (동등성)
		return super.hashCode(); //기본 동작, 참조값, 메모리 주소
	} // 개발자의 필요에 따라 기본동작과 인스턴스 변수 이용을 바꿀 필요가 있다.
	// 자바에서는 중복체크할때 해시코드를 사용한다. 이때 동일성이냐 동등성이냐는 개발자가 선택

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		return x == other.x && y == other.y;
	}

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

//자바 클래스의 기본구조
