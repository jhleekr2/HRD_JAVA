package chapter6.staticex;

public class StudentTest4 {
	public static void main(String[] args) {
		Student2 studentLee = new Student2();
		studentLee.setStudentName("이지원");
		System.out.println(Student2.getSerialNum()); //serialNum 변수를 직접 클래스 이름으로 참조(static변수이므로)
		System.out.println(studentLee.studentName + " 학번 : " + studentLee.studentID);
		
		Student2 studentSon = new Student2();
		studentSon.setStudentName("손수경");
		System.out.println(Student2.getSerialNum());
		System.out.println(studentSon.studentName + " 학번 : " + studentSon.studentID);
		
		//자바에서 static변수는 인스턴스 참조변수 대신 클래스 이름으로 직접 참조하는 것을 권장한다.
	}
}
