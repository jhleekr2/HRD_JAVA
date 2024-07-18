package java10_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collection_04_Set {
	public static void main(String[] args) {

//		Set 인터페이스
//		- 집합
//		- 데이터 모음, 묶음
//		- 데이터의 삽입 순서를 유지하지 않는다
//		- 인덱스 없음
//		- 비선형 구조
//		- 중복데이터를 허용하지 않는다 → 같다는 기준을 무엇으로 할것인가? 이슈 발생
//		→ hashCode(), equals() 를 이용하여 요소의 중복 검사를 수행한다.
//		- interface Set의 구현체 (구현 class)
//
//		- class HashSet
//		가장 기본이 되는 Set 구현체
//
//		- class LinkedHashSet
//		데이터의 입력 순서를 유지한다
//		인덱스는 없다
//
//		- class TreeSet
//		정렬 기능이 포함된 Set
//		오름차순 정렬한다
//
//		이진 탐색트리(Binary Tree)
//		이진 (Binary): 2개의
//		→ 자식 노드를 2개로 제한한다.
//
//		탐색
//		왼쪽 자식에는 부모보다 작은값
//		오른쪽 자식에는 부모보다 큰 값
//		빠른 탐색이 가능하다는 장점
//
//		- Class TreeSet
//		정렬기능이 포함된 Set
//		오름차순으로 정렬한다
//		트리 구조의 Set을 생성하는 작업이 느린 편이다
//		데이터를 추가, 삭제하는 작업이 느린 편이다.
//		대신, 조회(탐색)이 매우 빠른 편이다.
//
//		- 매핑(Mapping)
//		-데이터와 데이터 사이의 관계를 표현한디
//		-두 집합을 구성하는 원소들 간의 대응관계
//		-일대일 매핑 (one to one, 1:1 )
//		-일대다 매핑 (one to many, 1:7)
//		-다대일 매핑 (many to many), 
//		-다대다 매핑 컴퓨터가 구현하기 무리가 많이 따른다.
		
//		Set set = new HashSet(); //기본 Set
//		Set set = new LinkedHashSet(); //입력 순서 유지 Set
		Set set = new TreeSet(); //정렬 상태 유지 Set
		
		set.add( 10 );
		set.add( 20 );
		set.add( 30 );
		set.add( 40 );
		
		System.out.println( set ); // 순서가 유지되지 않는다.
		
		//중복 데이터 삽입
		// -> 허용하지 않는다
		
		set.add( 30 );
		set.add( 30 );
		set.add( 30 );
		set.add( 30 );
		
		System.out.println( set );
		
		System.out.println("-----------------");
		//기능들을 이용한 후 List로 꺼내서 사용하는 경우가 많다.
		
		//Set객체의 Iterator 사용하기
		//-> 전체 출력
		
		//반복자 변수 선언
		Iterator iter = null; // Iterator 자체가 코드 표준화를 위해 만들었기 때문에, 객체를 바꿔도 똑같은 형태임
		
		//Set객체를 이용하여 Iterator 객체 생성
		iter = set.iterator();
		
		//요소가 존재하는 만큼 하나씩 반복한다
		while( iter.hasNext() ) {
					
		//요소를 반환하고 다음 요소를 참조하도록 만든다
			Object data = iter.next();
					
			System.out.println( data );
		
		}
		
//		Iterator iter = set.iterator();
//		while( iter.hasNext() ) {
//			System.out.println( iter.next() );
//		} // 위의 코드를 좀더 간결하게 적은 경우
		
		//Set객체의 for-each 사용하기 - 더 간단하지만, 내부구조는 사실 같다. 애초에 for-each 구문 자체가
		//iterator 기반으로 내부적으로 되어 있다.
		//-> 전체 출력
		
		for(Object data : set) {
			System.out.println( data );
		}
		
		//개발은 이전에 이미 있는 코드를 복사하고 붙여넣기 하는 것이 기본이 되어야 한다.
		System.out.println("-----------------");
		
		System.out.println("크기? " + set.size());
		System.out.println("비었는가? " + set.isEmpty());
		System.out.println("30 이 존재하는가? " + set.contains(30));
		System.out.println("30 제거하기 : " + set.remove(30)); //true (있어서 지웠음)
		
		System.out.println("50 제거하기 : " + set.remove(50)); //false (없어서 안 지웠음)
		
		System.out.println(set);
		
		//전체 데이터 삭제
		set.clear();
		
		System.out.println(set);
		System.out.println("비었는가? " + set.isEmpty());
		System.out.println("크기? " + set.size());

		
	
	
	}
}
