package java06_class.costructor;

	//생성자(Constructor) - 약간 특별한 성질을 가진 메소드로 생각!
	//-멤버필드(정보, 속성), 멤버메소드(기능, 행위)와 함께 클래스를 구성하는 요소이다
	//-객체를 생성(new)할 때 반드시 호출되는 특수한 형태의 메소드이다.(엄밀히는 메소드와는 약간 다름!)
	//-클래스에는 한개 이상의 생성자가 반드시 존재해야 한다.
	//-클래스 정의 코드에 생성자를 직접 작성하지 않으면 자동으로 JVM이 추가한다.
	//(자동 추가된 생성자는 아무 작업도 하지 않는다.)
	//-생성자를 개발자가 직접 하나라도 작성하면 JVM이 자동으로 생성자를 추가하지 않는다.
	//→ 생성자 1개를 추가했다가, JVM이 자동으로 추가하던 생성자까지 더 추가해야 하는 경우가 발생할 수 있다.
	//
	//생성자의 형식
	//[접근제한자] 클래스명( 매개변수 ) {
	//// 객체를 생성하면서 수행할 작업(코드)
	//}
	//-반환타입, 반환코드(return코드)를 작성하면 안된다
	//-생성자의 이름은 클래스의 이름과 같다
	//-오버로딩이 가능하다
	//-new연산자와 함께 사용한다(호출한다)
	//
	//생성자의 역할
	//-객체의 초기화에 사용한다
	//-멤버필드들의 기본값(초기값)을 설정(대입)할 수 있다
	//** 객체가 생성될 때 기본으로 저장하고 있어야 할 값 설정
	//-객체의 동작에 필요한 것을 미리 준비하도록 작성하기도 한다
	//ex) Scanner 객체

class Constructor { // 이러한 형식의 클래스 정의는 현업에서는 추천하지 않는다!
	//java06_class.constructor.Constructor
	//멤버 필드
	private int num1 = 111;
	private int num2 = 222;
	
	//--- 생성자 ---
	public Constructor() {
		System.out.println("디폴트 생성자");
		System.out.println("매개변수가 없는 생성자");
		
		//멤버필드의 값을 초기화한다
		num1 = 8000;
		num2 = 9000;
	}

	//일반 메소드 정의
	// -> 생성자를 작성할 때 조심하자!
	// -> 생성자의 이름과 같은 일반 메소드를 작성하는 경우가 있다
	// -> 리턴 타입 확인할 것!
//	public void Constructor() {
//	}
	//매개변수 있는 생성자 - 오버로딩 되었음
	public Constructor(int num1, int num2) {
		//모든 멤버필드 초기화
//		this.num1 = num1;
//		this.num2 = num2;
		
		setNum1(num1);
		setNum2(num2);
	}
	
	//--- Getter, Setter ---

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
}
public class ConstructorEx {
	public static void main(String[] args) {
		
		//객체 변수
		Constructor cons01;
		
		//객체 생성
		cons01 = new Constructor(); // 생성자 호출
		
		//에러, private 필드에 접근할 수 없다.
//		cons01.num = 1234;
		
		System.out.println();
		System.out.println("--- 생성자 호출 후 ---");
		System.out.println( "num1 : " + cons01.getNum1());
		System.out.println( "num2 : " + cons01.getNum2());
		
		System.out.println("---------------");
		
		Constructor cons02 = new Constructor(6666,7777);
		
		System.out.println( "num1 : " + cons02.getNum1());
		System.out.println( "num2 : " + cons02.getNum2());
		
		
	}
}
