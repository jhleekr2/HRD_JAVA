package java11_generic;

//	제네릭 메소드
//	[접근제한자] [메소드제한자] <TYPE1, TYPE2, …> [리턴타입] 메소드명(매개변수) {}
//	- 메소드 내에서 사용되는 데이터타입을 일반화시켜 정의한다
//	- 매개변수, 반환타입, 지역변수, …
//	- 제네릭 메소드를 호출하면서 타입파라미터를 결정해준다
//	ex) obj.메소드명(인자);
//	→ 매개변수가 타입파라미터로 선언되었다면 전달인자의 데이터타입으로 타입파라미터가 자동 결정된다
//	ex) obj.<타입파라미터>메소드명(인자);
//	→ 타입파라미터 직접 결정하기

//	제네릭 타입 제한하기
//	<T>
//	어떤 타입이든 허용하는 타입파라미터 T
//	<T extends 부모클래스타입>
//	지정된 부모클래스타입과 하위클래스들만 허용하는 타입파라미터 T
//	-인터페이스로 설정하는 것도 가능하다

//일반 클래스
class Class03 {
	
	//일반 메소드
	public void display(int n) {}
	
	//제네릭 메소드
	public <T> T print(T t) { //반환타입, 매개변수
		T data = (T) t; //지역변수, 형변환
		return data;
	}//제네릭 T 활동범위 - 해당 메소드 한정

//제네릭 클래스
class Class03_2<T> {//제네릭 T 활동범위 - 해당 클래스 한정
	
	//일반 메소드 (제네릭 타입파라미터를 이용하는)
	public void display(T n) {}
	
	//제네릭 메소드
	public <K> void print (K k, T t) {} //K는 메소드에서 왔고, T는 클래스에서 왔다. 
	//문법상으로만 가능하고, 실제로는 너무 복잡해서 이렇게 개발 안함!
}

}
public class Generic_03_GenericMethod {
	public static void main(String[] args) {
		
		Class03 c03 = new Class03();
		//------------------------------------------------------------
		
		//타입파라미터를 지정하지 않았음
		// -> 전달인자의 자료형으로 결정됨 ( T -> Integer )
		c03.print(12345);
		
		//에러, 타입파라미터 결정이 먼저 이루어짐
//		c03.<Double>print( 65465 ); // T -> Double
		
		c03.<Double>print( 123.4556 ); // T -> Double
	}
}