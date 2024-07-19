package java11_generic;

//	제네릭 클래스, 인터페이스 상속
//	- 부모타입에 정의된 타입파라미터를 자식타입에서 결정하면서 상속해야 한다.
//	- 자식클래스에서 제네릭타입을 정의하고 상속받은 타입파라미터 결정을 미룰 수 있다.
//	- 인터페이스를 다중 상속하게 되면 제네릭 타입 때문에 오버라이딩이 제대로 적용되지 않을 수 있다
//	(구현코드를 여러 개 요구할 수 있는데, 자바에서는 허용하지 않는다) 
//	**제네릭 관련 개념들은 보통 3~4년차 정도부터 현업에서 활용될 것이다. 그전에는 잘 몰라도 괜찮다. 

class Data<K> {
	K data;
}

class Class05<T> {
	Data d1; // K -> Object(raw type)으로 결정되어 있다.
	
	Data<String> d2; // K -> String 타입
	
	Data<T> d3; // K -> T 타입(2단계에 걸쳐서 데이터타입이 아직 결정되지 않은채로 사용중임)
	
}

public class Generic_05_ClassMember {
	public static void main(String[] args) {
		
		// T -> Integer
		Class05<Integer> c05 = new Class05<>();
		
		// K -> T -> Integer
		c05.d3.data = 51234;
		
		//--------------------------------------------------------------------------------
		//이 시점에서 실행하면 nullpointexception 에러 발생한다.
		
		c05.d1 = new Data<>(); // Data<K> -> Data<Object>
		c05.d2 = new Data<>(); // Data<K> -> Data<String>
		c05.d3 = new Data<>(); // Data<K> -> Data<T> -> Data<Integer>
	}
}
