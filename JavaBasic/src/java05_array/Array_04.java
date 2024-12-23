package java05_array;

public class Array_04 {
	public static void main(String[] args) {
		
		// 문자열(String)
		// 참조형
		//-----------------------------------------------
		
		String str1 = "Apple"; // 상수 처리
		System.out.println(str1);
		String str2 = new String("Apple"); // 생성(동적할당) 처리
		System.out.println(str2);
		// JVM은 메모리를 3영역으로 나눠서 쓰며
		// 중심이 되는 메모리 영역을 스택(Stack) 메모리 영역이라고 부른다.
		// 스택(Stack) - 지역변수(선언)
		// 그 외 두번째 메모리 영역으로 힙(heap) 메모리 영역이 있다.
		// 여기는 동적 할당(new로 생성한 공간 포함) 변수들이 저장.
		// 마지막으로 데이터(Data) 메모리 영역, 또는 코드(Code) 메모리 영역이 있다.
		// 상수, 정의 코드들이 데이터 영역에 포함.
		
		// 기본형 데이터는 스택에 저장, 참조형 데이터는 주소값을 저장 후 상수는 데이터 코드에 저장하고 참조.
		
		// 배열은 대표적인 참조형 데이터, 클래스도 참조형 데이터이며
		// 실제 데이터들은 참조형을 상당히 많이 쓴다.
		
		// 구글에 '자바 메모리 힙 스택'으로 검색해서 더 자세한 정보를 볼 것!
		
		// 해당 내용들은 정보처리기사 시험에 출제되며, 언젠가는 반드시 알아야 한다.
		
		// 참조값(메모리에 저장된 위치)을 비교하는 코드
		System.out.println( str1 == str2 ); // str1과 str2의 출력 결과가 같지만, 저장되는 위치와 방식이 달라서
		// 실행하면 false가 뜬다.
		
		System.out.println( str1 == "Apple"); // 여기서는 True가 뜬다.
		// 큰따옴표를 세번 적었는데, 이들은 모두 상수
		// str1에 상수 주소가 들어가 있고, Apple 도 결국은 상수 주소 -> 자기자신끼리의 비교
		
		// 문자열의 모든 글자가 같은 글자로 구성되어 있는지 비교하는 코드
		System.out.println( str1.equals(str2));
		System.out.println( str1.equals("Apple"));
		System.out.println( "Apple".equals(str2));
	}
}
