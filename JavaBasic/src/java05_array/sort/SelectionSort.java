package java05_array.sort;

public class SelectionSort {
	public static void main(String[] args) {
		
		// (심화) 선택정렬
		// 본인은 강사의 정렬 퀴즈문제를 이 방법으로 풀었었음.
		
		int[] arr = { 3, 2, 5, 4, 1 };

		for(int i=0; i<5; i++) {
			for(int j=i+1; j<5; j++) {
				if( arr[i] > arr[j]) { //오름차순 정렬
//				if( arr[i] < arr[j]) { //내림차순 정렬	
					int swap;
					swap = arr[i];
					arr[i] = arr[j];
					arr[j] = swap;
				}
			}
		}
		
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}
}