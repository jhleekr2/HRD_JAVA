package java10_collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Collection_05_Convert {
	public static void main(String[] args) {
		
		List list = Arrays.asList("Apple", "Banana", "Cherry",
				"Banana", "Cherry");
	
		System.out.println(list);
		
		System.out.println("----------------");
		
		//List -> Set 변환
		// -> 중복 제거, 순서 유지 X
		Set set = new HashSet( list );
		System.out.println(set);
	
		System.out.println("----------------");

		List list2 = new LinkedList(set);
		System.out.println(list2); //arraylist를 hashset에 넣었다가 다시 linkedlist로 뺐다
		// 이때 중복을 제거하는것은 좋지만, 순서정렬이 망가졌다
		// 순서정렬까지 고려하여 중복 제거하려면 treeset 이용한다
		
		System.out.println("----------------");
		
		list2.sort( new Comparator() {
			
			@Override
			public int compare(Object o1, Object o2) { 
//				if(o1 < o2) return -1; // 왼쪽 배치 정렬
//				else if(o1 == o2) return 0;
//				else if(o1 > o2) return 1; // 오른쪽 배치 정렬
				//-> Object가 참조형이라 연산자 비교 불가 -> 에러
				
//				((String) o1).compareTo( (String) o2); //String의 경우는 대소비교가 이미 API에 정의되어 있다.
				//문자열1.compareTo( 문자열2 );
				//왼쪽 문자열을 오른쪽 문자열과 비교하여 작으면 음수 반환
				
				return ((String)o1).compareTo((String)o2);
			}
			
		});
		
		System.out.println( list2 );
	
	}
}
