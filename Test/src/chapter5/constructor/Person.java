package chapter5.constructor;

public class Person {
	String name;
	float height;
	float weight;
	
	public Person() {} // 디폴트 생성자
// 자바 컴파일러는 생성자 안만들어도 자동으로 기본적인 생성자가 있는 것으로 간주한다.
// 하지만, 디폴드 생성자는 개발자가 직접 생성자 추가하면 만들어지지 않는다.
	
	public Person(String pname) { // 이름을 매개변수로 입력받는 생성자
		name = pname;
	}

	public Person(String name, float height, float weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	//이때 클래스에 생성자가 두개이상 제공되는 것을 생성자 오버로드라고 한다.

	
}
