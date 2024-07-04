package java05_array;

public class Array_03 {
	public static void main(String[] args) {
		
		int[] arr = {47,8,2,3,9,5,79,8235,78,9,3,2058,329,06,802,986,9,238,6};
		
		System.out.println( arr ); // 배열의 실제 메모리 주소가 출력된다.
		
		//** 배열의 길이
		// 요쇼의 개수
		// 배열의 크기
		
		// -> 배열이름.length
		
		// ex) arr.length
		//--------------------------------------------------------
		
		System.out.println("배열의 길이 : " + arr.length);
		
		System.out.println("------------");
		
		// 배열의 모든 요소를 출력하기 - for문 이용
		
		// i 인덱스, 0 ~ arr.length-1
		
		for( int i=0; i<arr.length; i++) {
			System.out.println( arr[i] );
			
		}
		
		//** 이클립스 자동완성(Ctrl + space)을 이용하여 작성 가능
		// -> for타이핑하고 ctrl+space, 목록 중에서 for - use index on array 선택
//		for (int i = 0; i < arr.length; i++) {
//			
//		}
	}
}
