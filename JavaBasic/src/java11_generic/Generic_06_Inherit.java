package java11_generic;

import java.util.ArrayList;
import java.util.List;

//제네릭 클래스
class Parent<T> {
	T data;
}

class Child01 extends Parent { //제네릭 클래스 상속을 줄때는 반드시 자료형 결정을 해줘야만 한다.(안하면 자동으로 T -> Object로 결정)
	
}

class Child02 extends Parent<String> { // T -> String
	
}

class Child03<K> extends Parent<K> { // T -> K
	//상속받은 타입파라미터(T)를 결정하지 않고 미룬다 (K)
}

class Child04<M, N> extends Parent<M> {
	N data2; // 이때는 두개 모두 제네릭(실제 개발에서는 잘 없다)
}
public class Generic_06_Inherit {
	public static void main(String[] args) {
		
		Parent<Integer> p = new Child03<>();
		
		List<String> list = new ArrayList<>();
		
	}

}
