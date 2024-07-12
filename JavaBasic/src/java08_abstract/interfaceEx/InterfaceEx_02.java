package java08_abstract.interfaceEx;

import java08_abstract.interfaceEx.multiple.Child;
import java08_abstract.interfaceEx.multiple.Inter_01;
import java08_abstract.interfaceEx.multiple.Inter_02;
import java08_abstract.interfaceEx.multiple.Parent;

//인터페이스를 끝으로 자바의 기본 문법은 끝난다.

//**다중 상속
// 여러 개의 클래스를 상속받는 것
//컴퓨터는 다중상속을 받아 2개의 클래스 중 어느 한쪽의 클래스의 오버라이딩 선택을
//강요받는 상황이 오면 ambiguous(모호한) 상황이라는 오류를 뿜어댄다.

//** 자바는 다중 상속을 금지하고 있다
// -> extends로 한 개의 클래스만 상속받을 수 있다.

// 자바는 최대한 뭔가 애매해서 오류가 날 수 있는 상황들을 방지하는 식으로 문법구성이 되어있다.
//-> 때문에 안정적이라는 평가를 받고 있다.

//** 인터페이스(메소드의 구현이 없고 정의만 있는 클래스)를 다중 상속하는 것은 허용된다

class P1 {
	public void display() {
		System.out.println("P1");
	}
}

class P2 {
	public void display() {
		System.out.println("P2");
	}
}

class Children extends P1 { // 자바는 반드시 부모 클래스 하나만 상속받아야 한다.
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
	}
	
		//** 다중 상속을 허용한다면 P1, P2 부모 클래스 중에서
		// 누구의 메소드를 상속받아 구현해야하는지 결정할 수 없다.
}

public class InterfaceEx_02 {
	public static void main(String[] args) {
		
		Child c = new Child();
		c.out();
		
		System.out.println("--------------");
		
		Parent p = new Parent();
		p.out();
		
		System.out.println("--------------");
		
		Parent pc = new Child();
		pc.out(); //동적 바인딩 -> 인스턴스(자식클래스)의 메소드가 호출된다.
		
		System.out.println("--------------");
		
		Inter_01 i01;
		i01 = new Child();
		
		i01.out(); //동적 바인딩
		
		Inter_02 i02 = new Child();
		i02.out(); //동적 바인딩
		
		//** extends클래스, implements인터페이스 모두 부모 데이터타입으로 사용된다.
		
		System.out.println("--------------");
		
		int[] arr = { 1,2,3,4,5 };
		
		for(int i=0; i<arr.length; i++) { // 배열의 인덱스 범위를 이용한 반복문
			System.out.println( arr[i] );
		}
		System.out.println("--------------");
		
		//for each 구문
		// -> 모든 요소를 하나씩 꺼내며 순차적으로 반복코드 실행
		
//		for( 변수 : arr)  {// arr이 가지고 있는 요소를 시작점부터 끝점까지 순차적으로 하나씩 꺼내서
			//: 왼쪽의 변수에 넣은 다음 반복을 돌린다.
			//이때 arr의 변수 타입은 int[](int배열) 타입.
			//이때 int배열에 담겨져 있는 요소 하나하나의 데이터타입은 int타입
//		}
		
		for( int num : arr ) {
			System.out.println( num ); //이미 요소를 꺼내서 왼쪽 변수에 넣은 다음 반복을 돌린다.
			//따라서, 이때 arr[] 대신 그냥 num을 적어야 한다.		
		}
		
		System.out.println("--------------");
		
		Child[] childs = new Child[10];
		
		for(int i=0; i<childs.length; i++)
			childs[i] = new Child();
		//위의 구문을 for each구문으로 바꾸면
		for( Child child : childs) {
			child = new Child();
		}
		
		for (Child child : childs)
			child.out();
		
		//자동완성법 f누른후 Ctrl+Space
	}
}
