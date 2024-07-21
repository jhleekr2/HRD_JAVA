package chapter6.thisex;

class Person {
	String name;
	int age;
	
	Person() {
		this("이름 없음", 1); //this 이용해서 Person생성자 호출 + 생성자는 오버로딩 되어 있다. 
	}

	//생성자(constructor) - 단축키로 만들수 있다.
	public Person(String name, int age) {
		this.name = name; // 생성자는 클래스가 생성될 때 호출되므로 클래스 생성이 완료되지 않은 시점에 다른 코드가 있다면 오류 발생가능.
		this.age = age; //this사용 생성자 호출 코드 이전에 다른 코드를 넣을 수 없다.
	}
	
	Person returnItSelf() {//반환형은 클래스형 참조변수, this 반환 -> 참조변수 출력
		return this;
	}
	
}
public class CallAnotherCont {
	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName);
	}
}
