package java10_collection;

import java.util.Stack;

public class Collection_08_Stack {
	public static void main(String[] args) {
		
//		스택(Stack)
//		- LIFO(Last Input First Output, 후입선출)
//		- FILO(First Input Last Output, 선입후출)
//		- 가장 마지막(최근)에 입력된 데이터를 가장 먼저 사용한다.
//		- 자바에서는 컬렉션의 Stack 클래스 타입으로 자료구조를 제공하고 있다.
//		- 메소드 호출 스택(Method Call Stack)에서 사용되는 알고리즘이다.
//		- 입력(Push), 출력(Pop)
//		- 따라서, 후입선출 프로그래밍을 하려면 스택 클래스를 사용하면 된다.→하지만, 일반적으로 개발에는 그다지 유용하지 않다.
//
//		class Stack의 주요 메소드(알고리즘)
//		- push() : 데이터 입력, 스택에 데이터를 추가한다
//		- pop() : 데이터 출력, 스택에서 데이터를 반환하고 제거한다.
//		→ 데이터를 제거까지 해서 개발에 불편함이 있다. 따라서, 자바에서는 데이터 제거기능을 제거한 메소드 peek가 추가되어 있다.
//		- peek() : 데이터 확인, pop()될 예정인 데이터를 확인한다(제거X)
		
		//스택 자료구조 - 내부구조는 List 상속받았기 때문에 List기반으로 구성되어 있다.
		//실제로 내부는 ArrayList형태로 정의되어 있다.
		
		Stack stack = new Stack();
		
		stack.push("Apple");
		stack.push("Banana");
		stack.push("Cherry");
		
		System.out.println( stack );
		
		System.out.println("---------");
		
		System.out.println( stack.pop());
		System.out.println( stack.pop());

		System.out.println( stack );
		
		System.out.println("---------");
		
		System.out.println( stack.peek() );
		
		System.out.println( stack );
		//사실 스택 자료구조도 자체적으로 개발해서 구현할 수는 있다.
	}
}
