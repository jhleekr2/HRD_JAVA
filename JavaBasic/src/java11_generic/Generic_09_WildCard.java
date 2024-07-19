package java11_generic;

import java.util.Arrays;
import java.util.List;

public class Generic_09_WildCard {
	
//	public static void display(List list) //타입안정성 X
//	public static void display(List<Object> list) { //에러
	public static void display(List<?> list) { //제네릭 타입 상관없이 List객체
//	public static void display(List<? extends Number> list) { //Number의 하위타입으로 제네릭이 적용된 List객체
//	public static void display(List<? super String> list) { //String의 상위타입으로 제네릭이 적용된 List객체
		for(Object o:list ) {
		System.out.println(o);
	}
}	
	//--------------------------------------------------------------------------------
	
	//** 제네릭 타입만 다른 걸로는 오버로딩 안됨
	
//	public static void display(List<Integer> list) {
//	}
//	public static void display(List<String> list) {
//	}
	
	//--------------------------------------------------------------------------------
	public static void main(String[] args) {
		
		List<Integer> iList = Arrays.asList(10,20,30);
		display(iList);
		
		System.out.println("-----");
		
		List<String> sList = Arrays.asList("A", "B", "C");
		display( sList );
		//--------------------------------------------------------------------------------

		Object o = null;
		Integer i = null;
		
		o = i; //Object클래스는 Integer클래스의 부모클래스
	
		//--------------------------------------------------------------------------------
		
		List<Object> oList = null;
		List<Object> objList = null;
		
		oList = objList; // 제네릭까지 포함하여 같은 타입으로 인식한다
	
		//--------------------------------------------------------------------------------

		List<Object> ol = null;
		List<Integer> il = null;
		
		//에러, 제네릭은 자바의 상속 구조를 무시한다.
//		ol = il; // 데이터타입도 맞고 인식도 하지만, 갑자기 상속 구조를 무시해버린다.
		//이는 프로그래밍 언어들이 공통적으로 갖고 있는 현실적인 어려움으로 
		//이런 상황을 타파하기 위해서, 와일드카드라는 문법을 추가해 놓았다.
		
	
	}
}




