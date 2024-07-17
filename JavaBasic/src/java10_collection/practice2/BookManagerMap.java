package java10_collection.practice2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class BookManagerMap implements BookManagerMapInterface {
//인터페이스 상속
	
	//Method (자동완성)
	@Override
	public void putBook(Book book) {
		//맵 객체 생성
		Map map = new HashMap();
		map.put(book, map);
		
				
		
	}

	@Override
	public void removeBook(String bNo) {
		map.remove(bNo);
	}

	@Override
	public String searchBook(String bTitle) {
		return null;
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
	public BookManagerMap() {
		super();
	}
	//매개변수 있는 생성자
	public BookManagerMap(HashMap booksMap) {
		super();
		this.booksMap = booksMap;
	}
	

}
