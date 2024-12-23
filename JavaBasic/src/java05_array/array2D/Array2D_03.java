package java05_array.array2D;

public class Array2D_03 {
	public static void main(String[] args) {
		
		//int형 2차원 배열(타입의) 변수 선언
		// -> (int[]) 타입의 배열
		// -> 윈래 (int[])[]이지만, 이러한 형태를 int[][]으로 표시한다.
		
		int[][] arr;
		
		// (int[]) 자료형의 [4] 크기의 배열 공간 생성
		arr = new int[4][]; // null값이 들어가있는 int배열을 4묶음 만들어라 뜻.
		
		System.out.println(arr); // int 2차원 배열
		
		System.out.println(arr[0]); //int 배열 - null -> 열의 개수 - 없음
		System.out.println(arr[1]); //int 배열 - null
		System.out.println(arr[2]); //int 배열 - null
		System.out.println(arr[3]); //int 배열 - null
		
		System.out.println("----------------------");
		
		System.out.println( arr.length ); // 행의 길이 - 4개
		// . 참조 연산자로서 앞의 참조형을 참조하게 된다.
		
		arr[0] = new int[2]; // 0행으로 int 2개짜리 배열 생성
		arr[1] = new int[3]; //왼쪽이 int[] 자료형이므로, 오른쪽도 마찬가지로 int[] 써줘야 한다.
		// 1행으로 int 3개짜리 배열 생성
		arr[2] = new int[5]; // 2행으로 int 5개짜리 배열 생성
		arr[3] = new int[4]; // 3행으로 int 4개짜리 배열 생성
		
		System.out.println("----------------------");

		System.out.println( arr[0].length); // 0행의 열 길이
		System.out.println( arr[1].length); // 1행의 열 길이
		System.out.println( arr[2].length); // 2행의 열 길이
		System.out.println( arr[3].length); // 3행의 열 길이
	
		System.out.println("----------------------");

		//전체 데이터 출력
		for( int i=0; i<arr.length; i++) { // i행
			for( int j=0; j<arr[i].length; j++) { // j열
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();	
		}
	}
}
