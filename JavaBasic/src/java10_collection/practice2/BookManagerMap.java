package java10_collection.practice2;

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
//		System.out.println(book + "을 삽입");
			
	}

	@Override
	public void removeBook(String bNo) {
		booksMap.remove(bNo);
//		System.out.println(bNo + "를 삭제");
	}

	@Override
	public String searchBook(String bTitle) {
		//--- entrySet()을 이용한 처리 -------
		Set entrySet = booksMap.entrySet();
		Iterator iter = entrySet.iterator();
		
//		Map.Entry entry = (Map.Entry) iter.next();// 맵 구성요소 (엔트리)
//		Object key = entry.getKey(); // String - 도서번호
//		Object value = entry.getValue(); // Book - 책
		
		Iterator entrys = booksMap.entrySet().iterator();
		
		while( entrys.hasNext() ) {
			Map.Entry currentEntry = (Map.Entry) entrys.next();
			
			String currentbNo = (String) currentEntry.getKey();
			Book currentBook = (Book) currentEntry.getValue();
			
			if(bTitle.equals( currentBook.getTitle() ) ) {
				return currentbNo;
			}
		}
		
		return null;
		//--- keySet()을 이용한 처리 -------
//		Iterator bNos = booksMap.keySet().iterator();
//		
//		while( bNos.hasNext()) {
//			Book currentBook = (Book) booksMap.get( bNos.next() );
//			
//			if( bTitle.equals( currentBook.getTitle() ) ) {
//				
//				return currentBook.getbNo();
//			}
//		}
//		
//		return null;
	}

	@Override
	public void displayAll() {
		
		Set keySet = booksMap.keySet(); //String
		Iterator iter = keySet.iterator();
		
		System.out.printf("%10s", "도서번호");
		System.out.printf("%10s", "카테고리");
		System.out.printf("%15s", "제목");
		System.out.printf("%15s", "저자");
		System.out.println();
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
		System.out.printf("%10s", getCategoryText( book.getCategory() ) );//카테고리 텍스트를 글자로 변경
		System.out.printf("%15s", book.getTitle());
		System.out.printf("%15s", book.getAuthor());
		System.out.println();
		
//		System.out.print(book.getbNo() + "\t");
//		System.out.print(book.getCategory() + "\t");
//		System.out.print(book.getTitle() + "\t");
//		System.out.println(book.getAuthor() + "\t");
	}
	
	//기능을 추가하고 싶으면 메소드를 하나 만들자
	private String getCategoryText(int category) {
		switch (category) {
		case 1:
			return "인문";
		case 2:
			return "자연과학";
		case 3:
			return "의료";
		case 4:
			return "기타";
		default:
			return null;
		}
	}
	


}
