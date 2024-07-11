package java08_abstract;

public abstract class Person {
	
	protected String name; // 이름
	
	public Person(String name) {
		this.name = name;
	}
	
	public abstract void display();
	// 자식 클래스의 연결점 역할을 하는 문법적으로만 연결하기 위한 목적
	
	//메소드는 정의부(Head)와 {} 안의 구현부(Body)로 나뉜다.
	//그런데 abstract는 중괄호 부분을 구현하지 않기 때문에, 중괄호 없이
	//그냥 세미콜론으로 대체한다.
	//그리고 추상 메소드는 반드시 추상 클래스에서만 사용가능
	//추상화->구현X->실행X->에러!
	
	//Person을 실체화하는 코드는 new Person();이고 그 결과 만들어진 것이 인스턴스.
	//abstract 클래스는 new를 할 수 없다!
	
}
