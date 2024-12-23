package java04_control.loop;

public class For_07 {

	public static void main(String[] args) {
//Quiz.
//  첫날에 10원을 예금하고,
//  다음날에는 전날의 2배를
//  예금하는 방식으로
//  보름(15일) 동안 저축한 금액은?
//     -> 327670

		
		// HINT
		// 1. 필요한 데이터 변수 파악하기
		// -> 변화가 있거나 저장해놓고 써야하는 데이터
		
		// 날짜 int day
		// 예금액 int money
		// 총금액 int total
		
		//2. 반복 패턴
		//-> 어떠한 작업을 반복하는지
		//-> 몇번을 반복하는지
		
		//3. 반복 패턴 1번에 수행해야하는 작업 정리
	int day; // 날짜
	int total = 0; // 예금액
	int money = 10; // 총 금액
	
	for(day=0;day<15;day++) {
		// 입금하기
//		System.out.print("입금액 : " + money);
		total = total + money;
//		System.out.println(", 총금액 : " + total);
		
		// 예금액 2배로 증가시키기
		money *= 2;
		
		}

	System.out.println("총 금액 : " + total + "원");

	}
}