package java05_array.copy;

public class ArrayCopy_02 {
	public static void main(String[] args) {
		
		//배열(참조형)
		
		int[] arr1 = {10, 20, 30}; // 원본(Source)
		int[] arr2;				   // 사본(Destination)
		
		//1. 데이터가 복사될 공간을 새롭게 생성한다.
		arr2 = new int[arr1.length];
		
		//2. 데이터를 복사한다.
//		for(int i=0; i<arr2.length; i++) {
//			arr2[i] = arr1[i];	
//		}
		
		// System.arraycopy(src, srcPos, dest, destPos, length);
		// src 원본 배열 변수
		// srcPos 원본에서 복사가 시작될 인덱스
		// dest 사본 배열 변수
		// destPos 사본에서 복사가 시작된 인덱스
		// length 복사할 요소의 개수
		// 자동 완성기능에서 설명이 영어로 나오기는 한다.

		//** 깊은 복사(Deep Copy)
		// 참조 대상의 내용물을 새로운 공간에 복사하는 것
		// 원본데이터와 사본데이터가 분리된 별개의 공간을 가진다
		
		// -> 위의 for문을 이용한 깊은 복사 코드를 다음 코드로 대체할 수 있다.
		
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		
		// 직접 개발하는 것과 라이브러리 이용하는 것을 비교하여 배열의 깊은 복사사례처럼
		// 직접 개발하는 것이 라이브러리 이용하는 것보다 더 효율적이거나 비슷하면
		// 직접 개발해도 되지만, 나중에 개발할 때는 라이브러리 이용이 훨씬 더 편리한 경우가 많다.
		// 그럴때는, 라이브러리를 적극적으로 이용하자.
		
		arr2[1]= 9999;

		System.out.print("arr1 : ");;
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		System.out.print("arr2 : ");;
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
	}
}
