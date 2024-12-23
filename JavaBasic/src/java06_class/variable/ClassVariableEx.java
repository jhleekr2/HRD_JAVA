package java06_class.variable;

public class ClassVariableEx {
	
//	- 클래스 코드에서 사용되는 변수의 유형
//	1.인스턴스 변수(Instance Variable)
//	일반적인 멤버 필드에 의해 만들어진 변수
//	객체를 생성할 때마다 각각의 인스턴스에 만들어지는 변수를 뜻한다
//
//	2.클래스 변수(Class Variable)
//	static 키워드를 적용한 멤버필드에 의해 만들어진 변수
//	클래스 당 한 개의 변수 공간을 생성한다
//	(인스턴스마다 만들어지지 않는다)
//	프로그램이 실행되면 코드 수행 전에 미리 정적 영역에 만들어진다
//	같은 클래스타입의 모든 객체들이 하나의 공간을 공유한다
//
//	3.지역 변수(Local Variable)
//	메소드 내부에서 선언된 변수
//	매개변수도 지역변수로 취급한다
//	제어문에서 선언된 변수는 제어문의 지역변수이다
//	접근제한자를 적용할 수 없다
//	메소드가 호출될 때마다 공간이 생성된다
//	생성된 지역 변수 공간은 메소드마다 따로 관리한다
//	메소드가 종료되면 같이 삭제된다
//	초기화하지 않으면 쓰레기 값을 가진다(스택 메모리 영역)
//	
	// 인스턴스 멤버 필드
	public static void main(String[] args) { //정의 코드
		// 억지로 객체지향 형식을 지키기 위해서 static이 main정의할때 들어가게 되었다.
		// -> ClassVariableEx.main();
		//--- 인스턴스 변수 ---
		
		ClassVariable_01 cv01;// 변수 선언, 공간은 new하고서야 만들어짐
		// cv01 = 참조형
		cv01 = new ClassVariable_01(); // 객체 생성
		ClassVariable_01 cv02 = new ClassVariable_01();
		ClassVariable_01 cv03 = null; // 선언 코드
		
		//객체변수 3개 - 생성된 인스턴스는 2개
		//인스턴스마다 분리된 변수 -> 인스턴스 변수
		//인스턴스 변수를 만들기 위해 필요한 멤버필드
		
		//** null키워드, 널, 눌
		// -> 참조형 데이터의 기본값으로 사용되는 키워드
		// -> 참조하는 대상이 없음을 나타낸다.
		
		// 정의 코드와 선언 코드는 Static일때 이미 준비 끝내버림
		
		//---------------------------------------------------------------------
		
		cv01.setNum( 12345 );
		
		System.out.println("cv01.num : " + cv01.getNum());
		System.out.println("cv02.num : " + cv02.getNum());

		//에러, NullPointException
//		System.out.println(cv03.getNum() );
		System.out.println("---------------");
		
		
		//--- 클래스 변수 ---
		ClassVariable_02 cv04 = new ClassVariable_02();
		ClassVariable_02 cv05 = new ClassVariable_02();
		
		System.out.println( cv04.city );
		System.out.println( cv05.city );

		System.out.println("-----");

		cv04.city = "Busan"; //이클립스가 알아서 static 변수는 기울임글꼴로 써준다.

		System.out.println( cv04.city );
		System.out.println( cv05.city );
		
		System.out.println("-----");
		
		// 정적변수는 클래스 단위로 관리하기 때문에
		//정적인 방법(static way)으로 사용해야 한다
		// -> 클래스명.정적필드
		
		ClassVariable_02.city = "Incheon";
		
		System.out.println( ClassVariable_02.city );

		System.out.println("-------------");
	
		//--- 지역 변수
		
		ClassVariable_03 cv06 = new ClassVariable_03();
		
		cv06.method(0, 0);
	}
	
		
	private void print() {
			
	}
		
}// new해서 만들어지는 모든 것들은 heap공간!
		
// 기술적인 책들은 먼저 1회 속독을 한 후에
// 이후에 2-3회 반복해서 정독하는 것이 훨씬 효과가 좋다.

// 개인적으로 객체지향 부분이 굉장히 어렵다고 느끼는 편이다.