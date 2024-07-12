package java08_abstract.interfaceEx;

interface InterA {
	public abstract void getA();
}

interface InterB {
	public abstract void getB();
}

interface InterC extends InterA, InterB {//상속으로 인해 InterC에 getA, getB, getC가 모이게 된다.
	public abstract void getC();
}

//class Children implements InterA, InterB, InterC {
//class Children implements InterC { //에러땜에 주석처리 -> 집에가서 복습으로 수정 필요!
//
//	@Override
//	public void getA() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void getB() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void getC() {
//		// TODO Auto-generated method stub
//		
//	}	
//}

//** 클래스가 클래스를 상속받을 때			extends (다중상속 불가)
//** 인터페이스가 인터페이스를 상속받을 때	extends (다중상속 가능)

//** 클래스가 인터페이스를 상속받을 때		implements (다중상속 가능)

//** 인터페이스가 클래스를 상속받을 수 없다 - 인터페이스는 일반 메소드를 가질수 없기 때문.

//** 인터페이스는 추상 클래스조차 상속받을 수 없다 - 추상 클래스는 일반 메소드를 가질 능력이
//되는 반면, 인터페이스는 일반 메소드를 가질 수 없기 때문에 상속 불가.

public class InterfaceEx_03 {

}
