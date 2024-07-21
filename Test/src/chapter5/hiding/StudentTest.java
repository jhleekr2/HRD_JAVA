package chapter5.hiding;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student();
//		studentLee.studentName = "이상원"; // 그냥은 private 때문에 오류발생
		//대신 getter.setter를 호출해서 이용해야 한다
		studentLee.setStudentName("이상원");
		
		System.out.println(studentLee.getStudentName());
	}
}
