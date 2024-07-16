package java09_api;

public class ObjectEx {

//	Object 클래스
//	- 패키지 : java.lang
//	** hierarchy - 계단구조, 계층구조
//	- 자바의 모든 클래스들의 최상위 부모 클래스
//	- 사용자가 직접 정의한 클래스들도 Object 클래스를 자동으로 상속받는다.
//	- 배열도 Object클래스를 자동 상속받고 있다
//	- 별도로 extends Object 코드를 작성하지 않는다 
//
//	Object 클래스의 메소드
//	- 재정의 불가능 메소드( final 키워드가 붙어있다, 오버라이딩 불가능)
//	notify, notifyAll, wait(3개로 오버로딩 되어있음) - 멀티스레딩의 동기화에 사용된다
//	** 이 수업에서는 멀티스레딩의 개념정도만 다룬다
//	** 멀티스레딩을 하려면, 개발 환경과 개발 방식 자체를 바꿔야만 한다. 
//	** 스레딩 - 프로그램의 실행 단위, 프로그램의 실행 단위를 여러개로 분할하는 것이 멀티스레딩
//	** 기본 이론들을 전부 배운 후에야 습득 가능한 프로그래밍 기법으로, 상용 프로그램들은 전부 멀티스레딩 방식임
//
//	getClass - 클래스 타입(class Class)의 객체 정보를 반환한다.
//	** Class 클래스
//	클래스의 각종 정보를 객체화 할 수 있도록 만들어진 클래스
//	주로 이름, 필드, 생성자, 메소드 정보를 확인할 때 사용한다.
//	- 재정의 가능 메소드(오버라이딩 가능)
//
//	toString - 객체를 설명하는 문자열 반환하는 메소드
//	“데이터타입@참조값” 형식의 문자열을 반환하는 것이 기본이다.
//	기본값은 개발자에게 쓸모가 그닥 없기 때문에 toString을 개발자들은 주로 재정의(오버라이딩)해서 객체의 인스턴스변수값들을 출력하도록 한다. 
//	System.out.println(Object); 메소드에 매개변수를 객체로 적용하여 호출하면 객체의 .toString() 반환값을 출력한다.
//	equals - 객체의 동등성(equal to)을 비교하는 코드로 재정의한다
//	기본 코드는 동일성을 비교하도록 되어있다.
//	동등성 비교가 필요하면 재정의하여 사용한다
//	**동일성(Identity) - 같은 객체인가, 같은 참조값을 가지는가
//	**동등성(Equality) - 같은 데이터를 가지는가
//	** String 클래스에는 equals()가 동등성 비교로 재정의 되어 있다.
//
//	hashCode - 객체의 고유한 값을 반환하는 메소드
//	객체의 참조값을 10진수로 반환하는 것이 기본 동작이다.
//	** String 클래스는 문자열 데이터를 이용하여 해시값을 생성해 반환하도록 재정의 되어 있다.
//	→ 같은(동등한) 문자열이면 같은 .hashCode() 결과가 반환된다.
//
//	clone - 객체를 복사하여 반환하는 메소드
//	깊은 복사되도록 처리한다
//	접근제한자 변경, 오버라이딩, 예외 처리, Cloneable 상속 등의
//	추가 처리를해야 사용 가능하다
//
//	finalize - 건들지 말고 재정의하지 말고, 호출도 하지 마세요!
//	객체가 소멸될 때 호출되는 메소드 ( == 소멸자 )
//	GC(Garbage Collector)가 객체를 파괴할 때 호출되는 메소드
//
//	** 실제로는 getClass, toString, equals 정도만 거의 사용한다. 그중에서도 toString을 깊게 알아야 한다.
//
//	** clone, finalize는 거의 사용하지 않음.
	
	
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
		
		System.out.println();
		System.out.println("----clone--------");

		Point pOriginal = new Point(33, 44);
		
		// 얕은 복사
		Point pClone1 = pOriginal;
		
		// 깊은 복사
		Point pClone2 = new Point( pOriginal.getX(), pOriginal.getY());
		
		// clone()을 이용한 깊은 복사
//		try {
//			
//			Point pClone = pOriginal.clone(); // 에러나는 이유? 
//			//https://stackoverflow.com/questions/5116264/the-method-clone-from-object-is-not-visible
//			//접근제한자 변경, 오버라이딩, 예외 처리, Cloneable 상속 등의
//			//추가 처리를해야 사용 가능하다
//			
//			System.out.println("pClone : " + pClone );
//			
//			System.out.println("pOri hash : " + pOriginal.hashCode());
//			System.out.println("pClo hash : " + pClone.hashCode());
//			
//		} catch (CloneNotSupportedException e) {
//			e.printStackTrace();
//		}
		

	}
		
}

