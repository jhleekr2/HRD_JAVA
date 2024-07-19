package chapter5.classpart;

public class Student { //클래스명은 항상 대문자로 사용!
	int studentID; //학번
	String studentName; //학생이름
	int grade; //학년
	String address; //사는 곳
	
	//학번, 이름, 학년, 사는 곳을 멤버변수라 부른다.
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address); //이름, 주소 출력
	}//클래스 기능을 구현한 멤버함수 또는 메서드(함수라고 생각하면 된다)

	public String getStudentName() { //학생 이름에 대한 getter 메서드
		return studentName;
	}

	public void setStudentName(String studentName) { //학생 이름에 대한 setter 메서드
		this.studentName = studentName;
	}
	
	public static void main(String[] args) {
		Student studentAhn = new Student(); //Student 클래스 생성
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
