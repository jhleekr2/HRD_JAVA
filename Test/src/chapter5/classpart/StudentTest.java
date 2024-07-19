package chapter5.classpart;

public class StudentTest {

	public static void main(String[] args) {
		Student studentAhn = new Student(); //Student 클래스 생성
		//이때 패키지가 다르면 반드시 import문으로 불러와야함
		//Student 클래스 자료형으로 studentAhn 변수를 선언하고 new Student로 Student 클래스를 생성하여
		//Student 클래스 자료형을 가진 studentAhn 변수에 대입한다는 뜻
		//이때 studentAhn 변수를 참조 변수라고 부르며, 이 변수가 생성된 인스턴스를 가리킨다.
		
		//객체란 의사나 행위가 미치는 대상 의미(또는, 생성된 클래스의 인스턴스 의미하기도 한다), 
		//객체를 코드로 구현한 것이 클래스
		//클래스가 메모리 공간에 생성된 상태를 인스턴스
		studentAhn.studentName = "안승연";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());

	}

}
