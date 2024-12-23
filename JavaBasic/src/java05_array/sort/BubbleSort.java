package java05_array.sort;

public class BubbleSort {
	public static void main(String[] args) {
		// 정렬 - 데이터를 크기 순으로 재배치하는 것

		// 버블 정렬
		//--------------------------------------------------
		
//		for() {//회차에 대한 반복
//			for() { //각 회차
//				if() { // 인접한 인덱스 비교
//					 스왑, 개발은 반복문의 가장 안쪽부터 개발을 해야 한다.
//				}
//			}
//		}
		
		//모든 요소 출력
//		for( 모든 요소 반복 ) {
//			요소 출력
//		} // 개발은 출력부분부터(뒤에서부터) 하는 것이 좋다.
		
		
		int[] arr = { 3, 2, 5, 4, 1 };
		//버블 정렬
		for(int j=0;j<arr.length-1;j++) { //회차 반복
			for(int i=0; i<arr.length-1-j; i++) { //각 회차
				if(arr[i] > arr[i+1]) {
					//스왑
					int swap;
					swap = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = swap;
					
				}
			}
		
		System.out.print( (j+1) + "회차: ");
			for(int i=0; i<arr.length; i++) {
				System.out.print( arr[i] + " ");
			}
		System.out.println();
		
		}
		
		
		System.out.println("오름차순 정렬");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		
		System.out.println();

		int[] arr2 = { 3, 2, 5, 4, 1 };
		
		for(int j=0;j<arr2.length-1;j++) {
			for(int i=0; i<arr2.length-1-j; i++) {
				if(arr2[i] < arr2[i+1]) { // 관계연산자 방향에 따라서 오름차순, 내림차순 바꿀수 있다.
					int swap;
					swap = arr2[i+1];
					arr2[i+1] = arr2[i];
					arr2[i] = swap;
					
				}
			}
			
		System.out.print( (j+1) + "회차: ");
			for(int i=0; i<arr2.length; i++) {
				System.out.print( arr2[i] + " ");
			}
		System.out.println();
		
		}
		
		System.out.println("내림차순 정렬");
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] +" ");
		}
			
	}
}

//버블 소트 정렬
//int arr={3,2,5,4,1}
//첫번째 시도 (1-5번 원소까지 비교)
//첫번째 원소와 두번째 비교해서 (32541)
//첫번째 > 두번째 이면
//첫번째와 두번째 바꿈 (23541)
//이후 두번째 세번째 비교해서
//두번째 > 세번째이면
//두번째와 세번째 바꿈 (23541)
//다음은 세번째와 네번째 비교
//세번째 > 네번째이면
//세번째와 네번째 바꿈 (23451)
//마지막으로 네번째와 다섯번째 비교
//네번째 > 다섯번째이면
//네번째와 다섯번째 바꿈 (23415)

//두번째 시도 (1-4번 원소까지 비교) - 마지막은 이미 정렬 끝났음
//23415-> 23145

//세번째 시도 (1-3번 원소까지 비교) - 4,5번째는 이미 정렬 끝났음
//23145 -> 21345

//네번째 시도 (1-2번 원소까지 비교) - 3-5번째는 이미 정렬 끝났음
//21345 -> 12345

//정렬 끝