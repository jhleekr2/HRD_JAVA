package java06_class.variable;

public class ClassVariable_03 {

	//--- 멤버 필드 ---
	private int num1 = 777; //인스턴스 변수(일반 멤버필드)
	private static int num2 = 888;// 클래스 변수(정적변수)
	
	//--- 멤버 메소드 ---
	public void method(int num3, int nun4) {//매개변수(지역변수 취급)
		
		System.out.println( num1 ); //인스턴스 변수 출력
		System.out.println( num2 ); //클래스 변수 출력
	//--------------------------------------------------------
		
		int num1 = 101; //지역 변수
		int num2 = 202; //지역 변수
		
		System.out.println("-----");
		
		System.out.println( num1 ); //지역 변수 출력
		System.out.println( num2 ); //지역 변수 출력
		
		//따라서, 멤버변수와 지역변수의 이름을 같게 하여 프로그램을 작성하는것은
		//되도록이면 피해야만 한다.
		System.out.println("-----");
		
		System.out.println( this.num1 ); //인스턴스 변수 출력
//		System.out.println( this.num2 ); //클래스 변수의 경우는 this 쓰는 것이 좋지 않다.
		System.out.println( ClassVariable_03.num2 ); //클래스 변수 출력
		
	}// 호출이 되어야 활성화되고 실행됨
	
}