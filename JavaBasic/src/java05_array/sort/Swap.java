package java05_array.sort;

public class Swap {
	public static void main(String[] args) {
		
		//스왑(Swap)
		//- 교환, 맞바꾸기
		//----------------------------------------------
		
		// 실제 프로그래밍을 할때는
		// 언어, 네트워크, DB, 웹, 플랫폼 등등의 지식과 함께
		// 자료구조, 알고리즘, 소프트웨어 공학 지식이 필요하다.
		
		int num1 = 11;
		int num2 = 22;
		
		System.out.println("[스왑 전] " + num1 + ", " + num2);
		//잘못 생각한 코드
//		num2 = num1;
//		num1 = num2;
		
		// num1과 num2를 맞바꾸려면, 어쩔 수 없이 임시 변수가 하나 더 필요하다.
		//스왑 코드
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		//이때, 순서만 잘 맞추면 임시 변수에 들어가는 값은 num1과 num2중 어떤 것이 들어가든 상관없다.
		
		System.out.println("[스왑 후] " + num1 + ", " + num2);
		
	}
}
