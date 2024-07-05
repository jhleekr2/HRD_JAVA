package java05_array.array2D;

public class Array2D_02 {
	public static void main(String[] args) {
		
		//1차원 배열의 선언과 동시에 초기화
		int[] arr1D = { 1,2,3,4,5 };
		
		//1차원 배열의 선언과 동시에 초기화
		int[][] arr2D = { 
					{ 1,2,3 }, 
					{ 4,5,6 }, 
					{ 7,8,9 }
			};
		// -> 3행 3열의 2차원 배열을 생성한다
		// -> 3X3배열, 3 by 3 array
		
		//-----------------------------------------------
		
		//전체 데이터 출력하기 - for
		
		for(int i=0; i<3; i++) { //i행
			
			for(int j=0; j<3; j++) { //j열
				System.out.print(arr2D[i][j] + " "); // 요소 출력
			}
			System.out.println();
		}
	
		//-----------------------------------------------

		arr2D = new int[5][4]; //무조건 0으로 초기화하며, 원래 있던 arr2D공간과의 연결은 끊긴다.
		// 이후 필요없어진 arr2D[3][3]은 JVM의 GC(Garbage Collector)에 의해 제거된다.
		
		for(int i=0; i<5; i++) { //i행
			
			for(int j=0; j<4; j++) { //j열
				System.out.print(arr2D[i][j] + " "); // 요소 출력
			}
			System.out.println();
		}
		
		
	}
	
}
