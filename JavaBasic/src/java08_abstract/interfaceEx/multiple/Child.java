package java08_abstract.interfaceEx.multiple;

public class Child extends Parent implements Inter_01, Inter_02 {
	// Parent, Inter_01, Inter_02 클래스/인터페이스의 out() 함수가 상속으로 모이게 됨.
	// 추상 메소드끼리는 이름이 겹쳐서 다중상속이 허용된다.
	// 이때는 Parent 클래스의 out 함수가 대신 구현한 것으로 간주한다.
	
	@Override
	public void out() {
		System.out.println("자식 클래스에서 재정의");
	}

}
