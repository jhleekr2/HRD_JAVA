package java08_abstract;

public class Student extends Person{

//	private String name; professor와 student의 공통점 -> 상속!
	//수강 과목
	private String subject;

	public Student(String name, String subject) {
		super(name);
		this.subject = subject;
	}
	
	public void display() {//같은 기능끼리는 메소드명 맞추는것을 권장
		System.out.println("[학생] " + name + ", " + subject + " 수강");
	}
}
