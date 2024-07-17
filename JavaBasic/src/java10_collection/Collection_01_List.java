package java10_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collection_01_List {
	
//	컬렉션(Collection)
//	- 자바에서 제공하는 기본 자료구조들을 모아놓은 것
//	** 자료구조(Data Structure)
//	- 프로그램에서 사용되는 데이터들을 효과적으로 저장하고 사용할 수 있게 관리하는 전략
//	- 프로그램의 알고리즘(동작의 흐름, 논리적 흐름)에 어울리는 형태로 데이터를 논리적으로 배치하는 방법을 정리한 것이다.
//	ex) 학생 성적관리 프로그램
//	2명의 학생
//	3과목 점수
//	→ int[2][3]
//	- 배열도 자료구조의 일종이다
//	- 자바에서 List, Set, Map 세 가지 형태의 자료구조를 제공한다
//
//	배열(Array)
//	- 기본 문법으로 제공되는 가장 기본적인 자료구조
//	- 데이터(변수)들을 일렬로 배치하는 구조를 가진다
//	- 인덱스로 관리한다
//	→ 일렬로 데이터를 배치하는 구조
//	→ 선형(Linear) 구조
//	↔ 비선형(Non-Linear)구조
//
//	List 인터페이스
//	- 리스트
//	- 리스트 자료구조의 최상위 부모 인터페이스
//	- 데이터를 일렬로 배치하는 구조
//	→ 선형 구조
//	- 요소(Element)들을 인덱스(Index)로 관리한다
//	→ 데이터들의 순서가 존재한다
//	→ 데이터의 삽입 순서를 유지한다
//	- 리스트의 구조는 배열과 유사하다
//	- 배열은 생성하면서 요소를 저장할 수 있는 길이(크기)가 고정으로 정해진다
//	→ 크기를 확장, 축소가 힘들다
//	- 리스트는 처음에는 요소를 저장하는 공간을 만들지 않는다
//	- 요소가 추가될 때마다 각 요소를 저장할 수 있는 개별 공간을 만들고 연결한다.
//
//	interface List의 구현체(구현된 class)
//	- class ArrayList
//	단순 연결 리스트
//	배열과 거의 비슷한 동작을 한다
//	배열과 달리 공간의 크기를 확장하거나 축소할 수 있다
//	빠른 편이다
//	배열에 비해 크게 느리지 않다
//	** 요소들의 연결이 단방향 링크(포인터)로 이루어져 있다
//	** 중간 인덱스 요소의 데이터 삽입, 삭제가 비효율적이다	
//	→ 단방향 포인터의 단점
//	
//	- class LinkedList
//	이중 연결 리스트
//	** 양방향 링크(포인터)를 이용한다
//	** 단순연결리스트에 비해 요소 연결 과정이 복잡하고 양방향 연결을 위한 링크(참조)가
//	추가로 필요하다
//	** 중간 인덱스 요소의 데이터 삽입, 삭제가 효율적이다.
//	→ 양방향 포인터의 장점
//	
//	- class Vector
//	ArrayList와 동일한 기능을 수행한다
//	동기화 처리 되어있다
//	Thread-Safe하다
//	** Thread-Safe(스레드 안전)
//	멀티스레딩 환경에서 여러 스레드에 동시에 영향을 받아도 의도한대로 데이터를 저장하고
//	동작한다
//	== 동기화 처리되어 있다.
//	JDK 1.0시절 자바에서 가장 먼저 나온 자료구조인데, JDK 1.2부터 자료구조가 추가된 이후
//	로는 동기화 처리가 필요한 경우 이외에는 잘 쓰지 않는다
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		//빈(empty) 리스트
		ArrayList list = new ArrayList();
		//ArrayList<E> 여기서 <E>는 Generic을 의미한다.
		//이때 <E>자리에 Integer 넣으면 정수만 넣어진다
		//여기서 Wrapper 사용됨
		//<E> 생략하면 기본적으로 오브젝트만 처리
		
		//[]( == empty)
		System.out.println( list );
		
		System.out.println();
		System.out.println("---데이터 삽입-----");
		
		//.add9)를 실행한 순서대로 인덱스를 부여받는다 ( 0 부터 시작)
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		
		System.out.println( list );

		System.out.println();
		System.out.println("---데이터 조회-----");
		
		System.out.println("1번째 요소 : " + list.get(1));
		System.out.println("2번째 요소 : " + list.get(2));
		System.out.println("3번째 요소 : " + list.get(0));
		
		System.out.println("리스트의 크기 : " + list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + " 인덱스 : " + list.get(i));
		}
		//앞으로는 배열보다는 ArrayList를 자주 써보자.
		//그리고 기존 배열로 작성된 코드들을 ArrayList로 바꿔보기도 해보자
		//현업에서는 배열보다 List를 더 많이 쓰게 될 것이다.
		
		System.out.println("-------------------");
		
//		for( String item : list ) { // list가 가지고 있는 요소 elememt(object)를 String으로 형변환할수 없다는 에러 발생
		for( Object item : list ) {
			System.out.println( item );//object타입이면 .toString() 호출하게 된다.
		}
		
		System.out.println();
		System.out.println("---데이터 수정-----");
		list.set(0, "Orange");
		System.out.println( list );
		
		System.out.println();
		System.out.println("---데이터 삭제-----");
		
		// .remove(int index) - 인덱스로 요소를 지정하여 삭제
		// .remove(Object element) - 요소의 값을 비교(equals)하여 같으면 삭제
		list.remove(1);
		System.out.println( list );
		
		list.remove("Apple");
		System.out.println( list );
		
		list.remove("Cherry");
		System.out.println( list );
		
		System.out.println();
		System.out.println("--- isEmpty -------"); // 일반적으로 is/has형태로 시작하는 함수들은 반환값이 boolean
		
		//리스트가 비어있는지 확인한다.
		System.out.println(list.isEmpty());
		
		ArrayList l1 = null; //리스트 객체를 생성하지 않음
		ArrayList l2 = new ArrayList(); //리스트 객체를 생성함, 비어있음
		
		System.out.println("l1 : " + l1);
		System.out.println("l2 : " + l2);
		
		System.out.println( l1 == null ); // true
		System.out.println( l2 == null ); // false
		
//		l1.isEmpty(); // 에러, NullPointerException		
		l2.isEmpty(); // true
		
		if(l2 != null ) { // true
			if(!l2.isEmpty()) { // false
				
				//NullPointerException
				//IndexOutOfBoundsException
				// 두 종류의 예외 상황을 고려하고 작성했다.
				
				System.out.println( l2.get(0)); // if문에 의해 검사되어 실행되지 않지만, 밖에 있었으면 오류났을것임
				// 이때 IndexOutOfBoundsException 에러가 발생
			}
		}
		System.out.println();
		System.out.println("--- clear ---------");
		
		list.clear(); //모든 요소 제거
		System.out.println( list ); //비어있다
		
		list = null; // 객체 제거
		System.out.println( list ); //참조 객체가 없다
		
 		// 여기서 리스트 객체를 생성하지 않은 경우와 비어있는 리스트 객체간 혼동하여
		//실제 프로그램 개발에서 예상치 않은 오류를 뿜어대는 경우가 있으므로 주의한다!
		
		System.out.println();
		System.out.println("-------------------");
		
		//** 컬렉션들은 요소의 데이터타입을 정해놓고 사용하길 권장한다
		// -> 제네릭문법(<>)으로 정한다
		
		//** 제네릭(<>)을 적용하지 않으면 Object로 사용되도록 자동 결정된다
		// -> raw type
		
		list = new ArrayList(); // 위에서 제거했던 객체를 다시 만들어줌
		
		list.add("Alice");
		list.add(12345);
		list.add(4.2345);
		list.add(true);
		
		System.out.println( list );
		
		System.out.println();
		System.out.println("-------------------");
		
		int[] arr = {1,2,3,4,5,6};
		
//		ArrayList l3 = (ArrayList)Arrays.asList( 1,2,3,4,5,6 );// 또는
		List l3 = Arrays.asList( 1,2,3,4,5,6 ); // 로 써야 한다. 보통은 부모 타입인 list쪽으로 많이 쓴다.
		
		System.out.println( l3.get(1) );
		
		List l4 = Arrays.asList( "Apple", "Banana", "Cherry" );
		System.out.println( l4 );
		
		//List -> 배열 변환
		Object[] arr2 = l4.toArray();
		
		System.out.println( Arrays.toString(arr2) );
		//출력이 같기 때문에 출력만 보고서는 Array, List 차이를 구분하기 힘들다
		//코드를 봐야 Array와 List를 구분할 수 있다.
		
		//----------------------------------------------------------------------

		List test = new ArrayList(); // List를 쉽게 만들수 있는 방법
		
		
		//----------------------------------------------------------------------
		// 삽입, 조회, 수정, 삭제
		
		// 데이터(자료구조)를 다룰 때 기본(자주) 사용되는 동작(기능, 로직, 알고리즘)
		
		// CRUD
		
		// Create - 삽입/추가/생성
		// Read   - 조회/탐색/검색
		// Update - 수정/변경
		// Delete - 삭제/제거
		
		// 프로그램을 게시판 사이트, 데이터베이스를 게시글로 생각해보자!
		
		// 게시판
		// 글쓰기 - Create
		// 목록/상세보기 - Read
		// 글수정 - Update
		// 글삭제 - Delete
		// 를 기본으로 부가기능(댓글, 추천수 등등)을 1년차 신입들이 하게 될 일들이다.
		// 회원 기능도 마찬가지
		
		
//		ArrayList test = new ArrayList();
//		
//		test.add(new ArrayList());
//		test.add(new ArrayList());
//		test.add(new ArrayList());
//		
//		list.get(0);
		
	}
}
