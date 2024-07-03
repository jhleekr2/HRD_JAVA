package java04_control.loop;

public class For_07_v2 {
	public static void main(String[] args) {
		
		// for( 초기식; 조건식; 증감식 ) {}
		
		//** 초기식, 증감식에 여러 연산식을 적을 땐 ,(콤마)로 구분한다.
	int total = 0; // 예금액
	
	for(int day = 0, money = 10; day<15; day++, total+=money, money*=2) {
		}

	System.out.println("총 금액 : " + total + "원");
	// For_07 문제를 여러 연산식을 적는 형태로 푼 것
	// 너무 복잡해서 잘 쓰이지는 않는다.
	}
}
