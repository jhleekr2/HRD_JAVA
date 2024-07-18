package java10_collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Collection_06_Map {
	public static void main(String[] args) {

//		Map 인터페이스
//		-맵
//		-매핑된 데이터를 관리하는 자료구조
//		-Key, Value 두 데이터를 한 쌍(Entry)으로 묶어서 관리한다
//		-맵 객체에는 여러 쌍의 데이터(여러 개의 Entry)를 저장할 수 있다
//		-key는 데이터쌍(Entry)의 기준값으로 사용한다(데이터 식별값)
//		-Value는 데이터쌍(Entry)의 key에 대응하는 값으로 사용한다(매핑된 값, 데이터)
//		→ {key - value} 형태로 묶어서 표현
//		-Key는 맵 객체안에서 중복값을 사용할 수 없다
//		-Value는 중복된 데이터를 사용할 수 있다
//		
//		interface Map의 구현체(구현된 class)
//		
//		- class HashMap
//		가장 기본이 되는 Map객체
//		key의 중복 검사에 hashCode()가 같고 equals()의 결과가 true인 것을 확인한다.
//		→ 만일 가끔 개발중에 중복검사가 잘 작동하지 않는다면, hashCode, equals 등을 오버라이딩 해보자.
//
//		- class Hashtable(특이하게 이름이 Table이 아닌 table이다)
//		HashMap과 같은 기능이다
//		동기화처리되어 있다.
//		null 타입 key, value가 차단되어 있다.
		
//		- class Properties
//		Hashtable의 하위 클래스
//		키(key)와 값(value)들의 데이터타입이 String으로 제한된다
//		주로 프로그램의 설정값이나 실행도중 필요한 값, 기본값 등을 저장할 때 사용한다
//		파일(File)로 key-value 쌍을 저장하고 불러오는 기능이 추가되어 있다
//		저장하는 파일의 확장자를 주로 .properties로 사용한다.
//		데이터타입을 properties로 써야 한다.
		
		//맵 객체 생성
		Map map = new HashMap();
//		Map map = new Hashtable();
		
		//데이터 삽입
		System.out.println("--- put( key, value ) -------");
		map.put("a", "Apple"); // "a"="Apple" (여기서는 key value쌍의 대응기호로 표현)
		map.put(200, "Banana"); // 200="Banana"
		map.put(true, 3.4523); // true=3.4523
		
		System.out.println(map);
		
		System.out.println();
		System.out.println("--- get( key ) -------");
		
		System.out.println( map.get("a")); // "Apple"
		System.out.println( map.get(true)); // 3.4523
		
		System.out.println();
		System.out.println("--- 중복된 키 put() -------");
		
		//기존에 존재하는 key(true)에 매핑된 value(3.4523)를

		//새로운 value("Durian") 으로 교체한다
		map.put( true, "Durian");
		System.out.println(map); // true="Durian"
	
		System.out.println();
		System.out.println("--- 중복된 값 put() -------");
	
		//중복된 value는 상관없이 삽입된다.
		map.put(500, "Apple");
		System.out.println(map);
		
		System.out.println();
		System.out.println("--- contains -------");
		
		System.out.println("Key 5 : " + map.containsKey( 5 )); //false
		
		//존재하지 않는 key를 이용하여 .get(key)를 호출하면 null을 반환한다
		System.out.println("get(5) : " + map.get(5)); //null(API에 의하면 대응키가 없으면 null이 뜬다고 되어 있다)
		
		System.out.println("Value \"Banana\" : " + map.containsValue("Banana")); //true

		System.out.println();
		System.out.println("--- size() -------");
		
		System.out.println("크기 : " + map.size());
		
		System.out.println();
		System.out.println("--- isEmpty() -------");
		
		System.out.println("비었는가? : " + map.isEmpty());
		
		System.out.println();
		System.out.println("--- remove -------");
		
		//key가 200인 Entry를 제거한다
		map.remove( 200 );
		System.out.println(map);
		
		//key가 true인 Entry를 찾아서 value가 "Orange"라면 제거한다
		map.remove( true, "Orange" );
		System.out.println(map);
		
		map.remove( "a", "Apple");
		System.out.println(map);
		
		System.out.println();
		System.out.println("--- null 데이터 처리 -------");
		
		//별로 신경쓰지 않고 잘 들어가긴 한다. 하지만, value의 경우는 괜찮지만
		//key에 null값을 집어 넣는 것은 좋지 않다.
		
		// HashMap은 key 또는 value가 null인 상황은 에러까진 아니지만 좋지 않다.
		
		// Hashtable은 key, value로 null을 허용하지 않는다
		
		map.put(null, "Bob");
		map.put(900, null);
		System.out.println(map);
		
		map.put(null, null);
		System.out.println(map);

		System.out.println();
		System.out.println("--- map <-> set -------");
		
		//map은 iterator가 없다. 이유? 부모 타입이 없다. -> iterable하지 않고, for each 구문도 사용 불가하다.
		//따라서, Set의 도움을 받는다.
		Set entrySet = map.entrySet();
		Set keySet = map.keySet();
		
		System.out.println("entrySet : " + entrySet); //Entry(key=value)쌍 을 추출한다
		System.out.println("keySet : " + keySet); //key를 추출한다
		//Set으로 변환하면, 이제 iterator 및 for each 구문을 사용할 수 있게 된다.
		
		System.out.println();
		System.out.println("--- 맵에 대한 반복 처리 -------");
		
		Iterator keyIter = map.keySet().iterator(); //Set의 힘을 빌려온 map.keySet()에 iterator 적용
		
		while( keyIter.hasNext() ) {
			
			Object key = keyIter.next();//key
			Object data = map.get( key );//data
			
			System.out.println( key + "=" + data );
		}
	}
}
