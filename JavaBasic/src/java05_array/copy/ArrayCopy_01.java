package java05_array.copy;

public class ArrayCopy_01 {
	public static void main(String[] args) {
		
		//기본 타입 변수
		int num1 = 100;
		int num2;
		
		//num1의 값이 num2에 복사된다
		num2 = num1;
		
		System.out.println("num1: " + num1 + ", num2: " + num2);
		
		//--------------------------------------------------------
		
		//배열(참조형)
		
		int[] arr1 = {10, 20, 30};
		int[] arr2;
		
		arr2 = arr1;
		//** 얕은 복사(Shallow Copy)
		// 참조 대상의 참조값(주소)만 복사되는 현상
		// 실 데이터를 저장하고 있는 내부공간(new로 만들어진)이 복사되지 않는다.
		
		// 원본, 사본 참조형 변수가 같은 메모리 주소를 참조한다
		
		
		arr2[1]= 9999; // 얕은 복사 때문에 arr2 배열의 값을 바꿨는데 arr1 배열의 값도 바뀌었다.

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
