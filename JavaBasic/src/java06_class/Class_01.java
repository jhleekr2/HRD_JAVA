package java06_class;

//일반 클래스
//기능 클래스
// 메인 메소드가 없는 클래스
// 스스로 프로그램을 시작할 수 없는 클래스
public class Class_01 {

	// 멤버 필드(Member Field)
	// -> 객체의 데이터, 정보, 속성을 추상화한 것
	// -> 변수 또는 상수
	int num; // 멤버(클래스의 구성요소) - 3가지가 있다
	String data; // 멤버 필드, 멤버 메소드, 생성자
	
	// 멤버 메소드(Member Method)
	// -> 객체의 기능, 행위, 동작
	// ex) .nextInt(), .nextLine, .sort() 등
//	public void 메소드의 이름() {	
//	}
	public void display() {
		System.out.println("HI");
		System.out.println("display() 메소드 호출, 사용, call");
	}
}
