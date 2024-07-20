package chapter5.constructor;

public class PersonTest {
	public static void main(String[] args) {
		Person personKim = new Person();
		System.out.println(personKim.name);

		personKim.name = "김유신";
		personKim.height = 85.5F;
		personKim.weight = 180.0F;
		
		
		Person personLee = new Person("이순신", 175, 75); // 자바에서 클래스를 생성할때 사용하는 Person() 함수를 생성자(Constructor)라 부른다
		//클래스의 멤버변수는 메서드에 의해서도 값이 변하기도 하지만, 처음부터 값을 정해야 할수도 있다.
		//이때 생성자가 클래스를 처음 만들 때 멤버변수나 상수를 초기화한다.
		
		System.out.println(personLee.name);
		System.out.println(personKim.name);
	}
}
