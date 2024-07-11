package java08_abstract.interfaceEx;

public class interfaceEx {
	public static void main(String[] args) {
		
		//인터페이스의 상수
		System.out.println( TestInterface.NUM1 );
		System.out.println( TestInterface.NUM2 );
		
		//클래스의 상수
		System.out.println( TestClass.MAX);
		
		//상속받은 상수들
		System.out.println( Test1.MAX );//위의 것과 이름만 다르게 접근중
		System.out.println( Test2.NUM3 );
		System.out.println( Test3.MAX );
		System.out.println( Test3.NUM4 );
		//상속이 계속 진행되다보면 결국은 어디 클래스나 인터페이스에서부터 정의되었는지 불분명해지는 경우가 있다.
		//따라서, 상수는 그냥 어디든 떠다니는 존재처럼 생각한다.
		
	}
}
