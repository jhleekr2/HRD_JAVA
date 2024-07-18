package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class BookManagerMap implements BookManagerMapInterface {//extends Book 넣으면 틀린다!
//인터페이스 상속 첨에 하면 오류나는데, 이때 Add Unin~ 선택!
	private HashMap booksMap; //field
	//정확한 메모리 구조를 파악했으면 더 좋았을 것이다. 헷갈리면 개발노트에 그림그려보자.
	
	//기본생성자 : 맵 객체 생성함
	public BookManagerMap() {
		booksMap = new HashMap();
		
	}
	//매개변수 있는 생성자 : 다른 맵을 전달받아 booksMap 객체의 초기값으로 생성함
	public BookManagerMap(HashMap booksMap) {
		super();
		this.booksMap = booksMap;
	}
		
	//Method (자동완성)
	@Override
	public void putBook(Book book) {
		
		booksMap.put(book.getbNo(), book);
		System.out.println(book + "을 삽입");
			
	}

	@Override
	public void removeBook(String bNo) {
		booksMap.remove(bNo);
		System.out.println(bNo + "를 삭제");
	}

	@Override
	public String searchBook(String bTitle) {
//		Set entrySet = map.entrySet();
//		Set keySet = map.keySet();
//		
//		System.out.println("entrySet : " + entrySet); //Entry(key=value)쌍 을 추출한다
//		System.out.println("keySet : " + keySet); //key를 추출한다
//		//Set으로 변환하면, 이제 iterator 및 for each 구문을 사용할 수 있게 된다.
//		
//		Iterator keyIter = map.keySet().iterator(); //Set의 힘을 빌려온 map.keySet()에 iterator 적용
//		
//		while( keyIter.hasNext() ) {
//			
//			Object key = keyIter.next();//key
//			Object data = map.get( key );//data
//			
//			System.out.println( key + "=" + data );
//		}
//		map.get(bTitle);
//		System.out.println(map);
		return bTitle;
//		return null;
	}

	@Override
	public void displayAll() {
		
		Set keySet = booksMap.keySet(); //String
		Iterator iter = keySet.iterator();
		
		while( iter.hasNext() ) {
//			
			Object key = iter.next();//key
//			Object data = booksMap.get( key );//data
//			
//			printBook(key);// String에서 유도된 Object를 String에 집어넣기! -> 오류!(중간과정이 호환안됨)
			printBook( (String) key);
//			System.out.println( key + "=" + data );
//	
		}
	}

	@Override
	public void printBook(String bNo) {
		Book book = (Book) booksMap.get(bNo); // Map에 생성해놓은 책 한권 꺼냄
		
		if( book == null ) {
			System.out.println("["+ bNo + "]없는 책입니다");
			return;
		}
		System.out.printf("%10s", book.getbNo());
		System.out.printf("%10d", book.getCategory());
		System.out.printf("%15s", book.getTitle());
		System.out.printf("%15s", book.getAuthor());
		System.out.println();
//		System.out.print(book.getbNo() + "\t");
//		System.out.print(book.getCategory() + "\t");
//		System.out.print(book.getTitle() + "\t");
//		System.out.println(book.getAuthor() + "\t");
	}
	

	


}
