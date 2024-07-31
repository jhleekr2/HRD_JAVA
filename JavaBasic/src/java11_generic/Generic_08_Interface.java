package java11_generic;

import java.util.ArrayList;
import java.util.List;

interface Inter1<T1> {
	public abstract void method(T1 data);
	
	public abstract void print(T1 data);
}
interface Inter2<T2> {
	public abstract void method(T2 data);
	
	public abstract void display(T2 data);
}	
class Class08<E> implements Inter1<E>, Inter2<E> {//다중상속 안되는데 인터페이스로 다중상속 비슷하게 구현하고 있다.	
	
	@Override
	public void method(E data) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void display(E data) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void print(E data) {
		// TODO Auto-generated method stub
	
	}

	
}

public class Generic_08_Interface {

	public static void main(String[] args) {
	
//		List<? extends> list = new ArrayList<>(); //?의 자식들만 허용
//		List<? super> list = new ArrayList<>(); //?의 부모들만 허용
		
		List<?> list = new ArrayList<>(); //제한없이 허용
//		List<Object> list = new ArrayList<>(); //제한없이 허용
		//자료형으로 인정해주는것은 <>앞의 것만을 따름
		//약간의 차이점 존재

	}
}