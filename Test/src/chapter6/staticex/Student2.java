package chapter6.staticex;

public class Student2 {
	private static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	
	
	public Student2() {
		serialNum++; //학생이 생성될 때마다 증가
		studentID = serialNum; //증가된 값을 학번 인스턴스 변수에 부여
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	//static 변수를 private로 변경 -> getter and setter 필요
	public static int getSerialNum() {
		return serialNum;
	}
	public static void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum;
	}
	
	
}
