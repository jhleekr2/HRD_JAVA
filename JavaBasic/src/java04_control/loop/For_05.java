package java04_control.loop;

public class For_05 {
	public static void main(String[] args) {
		
		// 1부터 10까지의 총합 구하기
		// (for문 이용하기)
		
		// 답은 55 나와야 함
		//-----------------------------------
		
		int i;
		int sum = 0; // 자바는 쓰레기값 불러오면 오류나므로 반드시 초기화가 필요
		
		for( i=1; i<=10; i++) { //i, 1~10, x10
			sum += i;
//			System.out.println(sum);
		}
		
		// 반복문의 핵심 : 규칙적으로 변화되는 곳이 어디인가?
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
	}
}
