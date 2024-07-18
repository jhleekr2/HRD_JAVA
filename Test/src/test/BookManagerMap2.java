package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import test.Book;
import test.BookManagerMapInterface;

public class BookManagerMap2 implements BookManagerMapInterface {
//인터페이스 상속
	//맵 객체 생성
	HashMap map = new HashMap();
		
	//Method (자동완성)
	@Override
	public void putBook(Book book) {
		
		map.put(book.getbNo(), book);
		System.out.println(book + "을 삽입");
			
	}

	@Override
	public void removeBook(String bNo) {
		map.remove(bNo);
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
		Set entrySet = map.entrySet();
		Set keySet = map.keySet();
		
		System.out.println("entrySet : " + entrySet); //Entry(key=value)쌍 을 추출한다
		System.out.println("keySet : " + keySet); //key를 추출한다
		//Set으로 변환하면, 이제 iterator 및 for each 구문을 사용할 수 있게 된다.
		
		Iterator keyIter = map.keySet().iterator(); //Set의 힘을 빌려온 map.keySet()에 iterator 적용
		
		while( keyIter.hasNext() ) {
			
			Object key = keyIter.next();//key
			Object data = map.get( key );//data
			
			System.out.println( key + "=" + data );
	
		}
	}

	@Override
	public void printBook(String bNo) {
		
	}
	
	private HashMap booksMap; //field
	
	//기본생성자
	public BookManagerMap2() {
		super();
	}
	//매개변수 있는 생성자
	public BookManagerMap2(HashMap booksMap) {
		super();
		this.booksMap = booksMap;
	}
	

}
