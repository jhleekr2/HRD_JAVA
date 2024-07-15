package java09_api;

public class ObjectEx {

	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
		
		System.out.println( p1.toString() ); //println(String)
		
		System.out.println( p1 ); //Object, println(Object)
	
		System.out.println();
		System.out.println("--- equals ---");
		
		Point p2 = new Point(11, 22);
		Point p3 = new Point(11, 22);
		Point p4 = p2;//얕은 복사, p2의 참조값을 p4에 그대로 복사 -> 변수명은 다르지만 같은 객체
		
		System.out.println( p2 );
		System.out.println( p3 );
		System.out.println( p4 );
		
		// 이때 p2, p3, p4가 모두 같다고 볼수 있는가?
		
		// == 연산자 비교
		// 동일성 비교, identity(ID, 유사함)
		// 같은 객체인지 비교한다.
		// 참조값이 같은지 비교한다.
		// 객체 변수에 저장된 값(참조값)이 같은 지 비교한다.
		
		System.out.println();
		System.out.println("p2==p3 : " + (p2==p3)); //false, 동일하지 않다
		System.out.println("p2==p4 : " + (p2==p4)); //true, 동일하다
		
		System.out.println("------------------------");
		
		// .equals() 메소드 비교
		// 동등성 비교, equality
		// 객체의 값(인스턴스 변수값)이 같은 지 비교한다.
		// 개발자가 재정의 하여 인스턴스 변수의 값을 비교하도록 만들어야 한다.
		
		System.out.println();
		System.out.println( "p2.equals(p3) : " + p2.equals(p3)); //false
		System.out.println( "p2.equals(p4) : " + p2.equals(p4)); //true
		
		System.out.println();
		System.out.println("------------------------");

		String s1 = new String("Apple");//힙에 저장
		String s2 = new String("Apple");//new는 할때마다 서로 다른 인스턴스를 만들어서 저장 공간이 다름
		String s3 = new String("Banana");
		String s4 = "Apple";//데이터 영역(정적영역)에 저장
		//s1, s2, s4는 서로 동일하지 않다.
		
		System.out.println("s1==s2 : " + (s1==s2)); //false
		System.out.println("s1==s4 : " + (s1==s4)); //false (서로 저장공간은 다름)
		
		System.out.println("Apple" == s4); //true - 상수는 전부 동일한 것을 내부적으로 가져다 쓴다.
		
		System.out.println("s1.equals(s2) : " + s1.equals(s2)); //true
		System.out.println("s1.equals(s4) : " + s1.equals(s4)); //true (string의 equals는 이미 오버라이딩이 되어 있다.)
	
		System.out.println();
		System.out.println("----equals--------");
		
		System.out.println("p2 : " + p2.hashCode());
		System.out.println("p3 : " + p3.hashCode());
		System.out.println("p4 : " + p4.hashCode());
		
		System.out.println();
		System.out.println("s1 : " + s1.hashCode());
		System.out.println("s2 : " + s2.hashCode());
		System.out.println("s3 : " + s3.hashCode());
		System.out.println("s4 : " + s4.hashCode());
		
		
	}
}
