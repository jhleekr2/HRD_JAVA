package java05_array.quiz;

public class ArrayQuiz2 {
//	 int[] arr = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
//	 배열이 선언된 뒤 문제를 푸시오
//
//
//	 - arr 배열을 invert_arr라는 배열에 거꾸로 입력하시오
//	 => invert_arr : { 21, 13, 9, 8, 10, 27, 9, 3, 17, 10 }
//
//
//	 - arr 배열의
//	  (짝수번째 인덱스 내용의 합) - (홀수번째 인덱스 내용의 합)을
//	  구하시오
//	  	=> -5
//
//
//	 - arr 배열의 숫자들 중 높은 숫자가 1등이 되게하여
//	  rank_arr라는 배열에 순위를 입력하시오
//	 	=> arr :     { 10, 17, 3, 9, 27, 10, 8, 9, 13, 21 }
//	     => rank_arr :{  5,  3, 10,7,  1,  5, 9, 7,  4,  2 }
//
//
//	 - arr 배열의 요소들 중 중복된 값은 over_arr에 넣고 중복되지
//	  않은 값은 ret_arr에 입력하시오
//	 	** over_arr, ret_arr은 길이가 10인 배열로 작성한다
//	 	
//	 	출력한다면 (정렬도 할 수 있으면 해도 됨)
//	 	=> over_arr : 9, 10
//	 	=> ret_arr : 3, 8, 13, 17, 21, 27

	public static void main(String[] args) {
		int[] arr = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
		int[] invert_arr; // 거꾸로 배열 공간 정의
		invert_arr = new int[10]; // 배열의 원소 개수 정의
		
		for(int i=0; i<10; i++) {
			invert_arr[9-i] = arr[i]; // 배열 원소 거꾸로 만듦
		}
		
		for(int i=0; i<10; i++) {
			System.out.print(invert_arr[i] + ", "); // 거꾸로 배열의 성분 출력
		}
		
		System.out.println();
		
		int oddSum = 0; //짝수번째 인덱스 합
		int evenSum = 0; //홀수번째 인덱스 합
		for(int i=0; i<10; i++) {
			if(i % 2 == 0) {//짝수번째 인덱스일때
				evenSum += arr[i];
//				System.out.println(evenSum);
			}
			else {//홀수번째 인덱스일때
				oddSum += arr[i];
//				System.out.println(oddSum);
			}
		// 짝수번째 인덱스 합과 홀수번째 인덱스 합 구함.
				
		}
		
		System.out.println("짝수번째 인덱스 합 - 홀수번째 인덱스 합 = " + (evenSum - oddSum));
	
		// 심화학습
		// 버블 소트 정렬
		// arr[0] arr[1] arr[2]	arr[3] ...arr[n-1]
		// 0과 1 비교해서 더큰 쪽을 왼쪽으로 배열한다
		// 이후 0과 2 비교해서 더큰쪽을 왼쪽 배열
		
		int[] arrSort; // 정렬용 배열 정의
		arrSort = new int[10]; //배열의 숫자 10개
		arrSort = arr;
		System.out.println(arrSort[0]);
		for(int i=0; i<10; i++) {
			
			for(int j=0; j<10; j++) {
				if(arrSort[i] > arr[j]) { //00 01 .. 09 비교해서 상대보다 더 큰 갯수만큼 sort
					arrSort[i] += 1; // 더큰 갯수만큼 
					
				}
			}
		}
		for(int i=0;i <10; i++ ) {
		System.out.println(arrSort[i]);
		}
	}
	
	
	
}










// 국비 - 처참한 현실!
// 퀴즈 1번문제를 제한시간에 푼 사례가 10-15퍼센트에 불과