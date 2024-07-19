package chapter5.classpart;

public class StudentTest2 {

	public static void main(String[] args) {
		Student student1 = new Student(); //첫 번째 객체 생성
		student1.studentName = "안연수"; //참조변수 이용하여 인스턴스의 멤버변수 참조
		Student student2 = new Student(); //두 번째 객체 생성
		student2.studentName = "안승연";
		
		System.out.println(student1); //참조변수 값 출력 - 주소값(참조값)출력
		System.out.println(student2);
		//지역변수 - 스택 메모리
		//참조변수와 인스턴스 - 힙 메모리
		
		//생성된 인스턴스는 각각 다른 메모리 공간을 차지
		//클래스에 선언된 멤버변수들은 다른말로 인스턴스 변수라고도 함
	}

}
