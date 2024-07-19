package java11_generic;

//	제네릭 클래스
//	[접근제한자] [클래스식별자] class 클래스명<TYPE1, TYPE2, …> { }
//	- 제네릭이 적용된 클래스
//	- 제네릭클래스를 이용하여 객체 변수 선언, 객체 생성 시에 타입 파라미터를 결정해주는 것이 좋다
//	- 타입 파라미터를 결정하지 않으면 Object(raw type)으로 처리된다

//class Class02 {
//	private int data;
//
//	public int display(int data) {
//		this.data = data;
//		return data;
//	}
//
//	public int getData() {
//		return data;
//	}
//
//	public void setData(int data) {
//		this.data = data;
//	}
//		
//}
//
//class Class02 {
//	private double data;
//
//	public double display(double data) 
//		this.data = data;
//		return data;
//	}
//
//	public double getData() {
//		return data;
//	}
//
//	public void setData(double data) {
//		this.data = data;
//	}
//		
//}

//제네릭 클래스

class Class02<T> {
	private T data;
	
	public T display(T data) {
		this.data = data;
		return data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}

public class Generic_02_GenericClass {
	public static void main(String[] args) {
		//abstract, interface는 new가 불가 (이유:구현체가 없음 -> 추상화 -> 그런데 new는 직접 구현가능하도록 만드는것)
		
		// T -> String 결정
		Class02<String> c02 = new Class02<>(); // 제네릭 클래스도 new를 못하기 때문에 new할때 반드시 type 지정해줘야한다.
		
		c02.setData("Grape");
		String fruit = c02.getData();//c02 반환이 전부 String타입으로 고정
		//JVM이 알아서 클래스의 <T>자리를 전부 String으로 교체해서 처리해준다
		
		//------------------------------------------------------------------------
		
		// T -> Integer 결정
		Class02<Integer> c02_1 = new Class02<>();
		
		//------------------------------------------------------------------------
		
		System.out.println( c02 instanceof Class02);
		System.out.println( c02_1 instanceof Class02);
		
//		System.out.println( c02 instanceof Class02<String>); // 지정 타입이 있는 Generic은 더이상 Generic이 아니다
		// -> 사용할 수 없다, 사용하기 위해서는 String자리에 와일드카드 ? 사용한다.
		
//		System.out.println( c02 instanceof Class02<?>);
		
		
	}
}
