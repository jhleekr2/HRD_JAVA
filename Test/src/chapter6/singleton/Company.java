package chapter6.singleton;
// 싱글톤 패턴 - 객체지향 프로그램에서 인스턴스를 단 하나만 생성하는 디자인 패턴
// 먼저 private생성자 만들고, 그다음 클래스 내부에는 static으로 유일한 인스턴스 만든다.
//이후 외부에서 참조할 수 있는 public메서드 만들고 실제 사용코드를 만드는 식으로 개발한다.
public class Company {
	private static Company instance = new Company();
	private Company() {}
	
	//인스턴스를 외부에서 참조할 수는 있지만, 외부 인스턴스를 생성할 수는 없도록 만듬
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
}
