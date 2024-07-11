package java08_abstract;

public class Professor extends Person{

//	private String name; professor와 student의 공통점 -> 상속!

//default 생성자에 의해 부모 생성자를 자식 생성자가 자동으로 호출하는데, 이 과정에서 에러!
//
	//전공
	private String major;
	//강제적으로 부모 생성자의 매개변수 조작
	public Professor(String name, String major) {
		super(name);
		this.major = major;
	}
	
	public void display() {//같은 기능끼리는 메소드명 맞추는것을 권장
		System.out.println("[교수] " + name + ", " + major + " 전공");
	}
}