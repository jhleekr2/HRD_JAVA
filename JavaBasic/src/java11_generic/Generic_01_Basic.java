package java11_generic;

import java.util.ArrayList;
import java.util.List;

public class Generic_01_Basic {
	public static void main(String[] args) {
	
//		데이터타입 일반화
//		** 일반화 : 개별적인 개체, 사례들의 공통되는 속성들을 일반적인 개념으로 변환시키는 것
//		데이터타입 - 기본형(8개), 참조형
//		데이터타입의 공통점 - 모두 자료형으로 쓰인다.
//		변수선언의 규칙
//		자료형 변수형;
//		- 데이터타입을 일반화하여 프로그래밍하는 것을 일반화 프로그래밍(Generic Programming)이라고 한다.
//		** C언어에서는 일반화 프로그래밍이라 부르지만, 자바에서는 이것을 제네릭이라 부른다.
//		모든 자료형 ===일반화==⇒ 데이터타입 T (<T>)
//		- 정의 코드에서 사용되는 데이터타입들을 일반화시켜 프로그래밍한다
//		- 코드를 정의하면서 데이터타입의 유형을 확실하게 정하지 않는다
//		- 자바에서는 일반화된 데이터타입을 제네릭(Generic)이라고 부른다.
//		** 자바는 자료형에 대해 너무나도 강력한(Strict)해서 자료형이 조금만 틀려도 에러를 내는데, 
//		자료형 검사를 느슨하게(loose) 만들어서 자바가 조금 다른 자료형도 받아들이기 위해 제네릭(일반화)을 사용한다.
//		** 사실 자바에서 자체적으로도 raw type → object를 통해 제네릭을 사용할 수 있는 유일한 방법이
//		있지만 부작용으로 귀찮은 형 변환이 따라온다는 문제점이 있다.
//
//		제네릭(Generic)
//		- 클래스 또는 메소드에서 사용되는 다양한 데이터타입을 일반화시켜 정의하는 방법이다
//		- 코드 재사용을 높일 수 있다
//		- 불필요한 형변환을 줄일 수 있다
//		ex) 일반화(제네릭)이 필요한 상황
//		public void out(int data) {
//			System.out.println(”데이터 : “ + data);
//		}
//
//		public void out(double data) {
//			System.out.println(”데이터 : “ + data);
//		}
//
//		public void out(Point data) {
//			System.out.println(”데이터 : “ + data);
//		}
//
//		…
//
//		→ 같은 이름, 같은 동작을 하는 코드에서 “데이터 타입” 부분만 달라지며 중복 코드가 작성되고 있다.
//
//		public <TYPE> void out(TYPE data) {
//			System.out.println(”데이터 : “ + data);
//		}
//
//		→ 개별적으로 적용해야 하는 데이터타입을 일반화된 데이터타입 TYPE으로 적용하여 정의 코드를 한 번만 작성한 것
		
		// List<E>, ArrayList<E>
		// -> 제네릭 문법이 적용된 API
		// -> E - 타입 파라미터(Type Parameter)
		
//		→ 실제로는, 위의 코드는 제네릭보다는 Object 쓰는것이 더 효율적이다
		
//		public object void out(Object data) {
//			System.out.println(”데이터 : “ + data);
//		}
		
		//--------------------------------------------------------------------------------
		
		//타입 파라미터 E를 결정하지 않아서 Object로 사용된다
		// -> raw type
		List list = new ArrayList();
		
		list.add(12345);
		list.add("Apple");
		System.out.println("-----------------------------");
		
		//타입파라미터 E -> String으로 지정하면서 생성
//		List<String> list2 = new ArrayList<String>(); //제네릭타입까지 써주고 생성자니까 둥근괄호로 마무리
		//List<String>은 인터페이스->new못한다
		//인터페이스를 new 할수있는경우 -> 익명클래스, 자식클래스 -> 여기서는 자식클래스 사용한다.
		
		//생성자(우측)에서는 <> 으로 타입 자정을 하지 않아도 된다.
		//대신 선언쪽(좌측)이 비어 있으면 안된다.
		// -> JDK 7부터 적용된 문법(1.6이하 버전에서는 오류가 발생)
		List<String> list2 = new ArrayList<>();
		
		list2.add("Banana");
		//--------------------------------------------------------------------------------
		
		//에러, 타입파라미터로 기본형 데이터타입 사용 불가
//		List<int> list3 = new ArrayList<>();
		
		// -> 기본형 대신 Wrapper 클래스를 사용한다.
		List<Integer> list3 = new ArrayList<>();
		
		list3.add(12345);
		int data = list3.get(0);

		//에러, Integer 타입만 사용할 수 있다
		// -> 타입 안정성이 있다
//		list3.add("String");
//		list3.add(1234.234234);
		
		//** 타입 안정성(Type Safety)
		// 개발자가 의도한 데이터타입으로만 사용되는 것

		// 데이터 instancdof 자료형
		// -> 데이터의 인스턴스 자료형을 확인하는 연산자
		System.out.println( list3.get(0) instanceof Integer); // 새로운 연산자 instanceof
		//instanceof 왼쪽의 자료형이 instanceof 오른쪽의 자료형이 맞냐? -> 자료형 검사를 통해 타입 안정성 확인!
		
//		현업에서는 다음과 같이 예외처리 후 개발하는 경우가 많다. 이 과정에서 instanceof 사용
//		if(data == null) return;
//		if(!data instanceof 원하는타입) return;
//		if(data < min ) return;
		
//		개발하고 싶은 거
		//--------------------------------------------------------------------------------
		
		//list는 raw type -> 형변환이 필요하다
		String str1 = (String) list.get(1); //"Apple"
		
		//list2는 <String> type -> 형변환이 필요없다
		String str2 = list2.get(0); //"Banana"
		
		
	}
}
