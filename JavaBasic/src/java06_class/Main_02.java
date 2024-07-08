package java06_class;


// 접근제한자(Access Modifier)
// - 객체의 멤버 필드(고유한 속성), 멤버 메소드(고유한 기능)에 대한
// 정보나 기능을 객체의 외부에서 함부로 접근할 수 없도록 제한하는 키워드
// - 객체(인스턴스)는 추상화 작업을 적용하여 만들어진 결과물이다.
// - 프로그램에서 중요하고 필수적인 정보들만 추출하여 코드로 구현한 것이다.
// - 객체의 멤버들을 함부로 접근하도록 공개하면 데이터의 손실같은 위험이 있다.
// - 필요한 정도까지만 공개하고 나머지는 접근을 제한한다.
// 접근제한자의 정의에 관해서는 CS면접에 출제!
// 접근제한자의 종류
// - 종류에 따라 멤버의 공개 범위가 단계적으로 달라진다.
// - private - 같은 객체의 내부에서만 접근 가능
// - default (package) - 같은 패키지의 다른 클래스까지 접근 가능
// - protected - 같은 패키지 + 상속 관계 객체까지 접근 가능
// - public - 모든 접근 가능

// 접근제한자의 공개 범위
// private < default < protected < public

// 접근제한자를 적용할 수 있는 위치
// - 멤버 필드 - 주로 private를 작성한다
// - 멤버 메소드 - 주로 public을 작성한다
// - 클래스 정의 코드 - public 또는 default만 가능하다
public class Main_02 {
	public static void main(String[] args) {
		
		Class_02 cl = new Class_02(); // 참조형 변수 선언
		
		System.out.println( cl.num4 ); // public
		
		System.out.println( cl.num3 ); // protected
		
		System.out.println( cl.num2 ); // default
		
		// 에러, 공개 범위에 맞지 않는 멤버에 접근했다.
		// -> "~ is not visible" 메시지 확인
		// -> 이러한 오류는 접근제한자 문제때문에 발생!
//		System.out.println( cl.num1 ); // private
		
	}
}
