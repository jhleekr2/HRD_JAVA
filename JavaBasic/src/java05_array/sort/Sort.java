package java05_array.sort;

import java.util.Arrays;
import java.util.Collections;

public class Sort {
	public static void main(String[] args) {
		
		int[] arr = {5,34,7,23,2,1,23,6,57};
		
//		String str = Arrays.toString(arr);
		
		//배열 출력
		System.out.println( Arrays.toString(arr));
		
		//정렬
		Arrays.sort(arr); //오름차순 정렬
//		Arrays.sort(arr, Collections.reverseOrder() ); // 내림차순 장렬		
		//내림차순 정렬할때는 배열 arr[] 가 int형이 아닌 integer형이어야 한다.
		//Integer[] arr = { } 로 정의!
		//배열 출력
		System.out.println( Arrays.toString(arr));
	}
}
// 왠만하면, 정렬 알고리즘을 직접 개발하기보다는 자바에 정의된 라이브러리를
// 직접 갖다 쓰는 편이 낫다(자바의 알고리즘은 꽤 성능 좋기 때문).

// 각종 정렬 알고리즘의 성능을 따질때는
// 공간 성능(요즘은 공간 성능을 극한으로 따지지는 않는다)
// 시간 성능
// 을 따진다.