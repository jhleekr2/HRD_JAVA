package java10_collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Collection_02_List {
	public static void main(String[] args) {
		
//		ArrayList list = new ArrayList();
//		LinkedList list = new LinkedList();
		// 비추천, 확장성이 떨어지므로 그냥 부모 데이터타입인 List 데이터 타입으로 개발하는 것이 좋다
		// 만일, ArrayList, LinkedList데이터타입으로 정의하면 확장을 위해서는 오버라이딩이 필요하다.
		
//		List list = new ArrayList();
//		List list = new LinkedList();
		List list = new Vector();
		// 추천
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println(list);
	
		
	}
}
