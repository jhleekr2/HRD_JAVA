package java04_control.loop;

public class For_08 {
	public static void main(String[] args) {
		
		// 제어문 중첩시켜 사용하기
		
		// for문과 if문 중첩
		for( int i = 0; i < 10; i++) { // i, 0~9, x10, 반복문은 0부터 시작해서 특정수 미만까지 실행되는 형태가 일반적.
			
			if (i % 2 == 0) { // 짝수일 때
				
				System.out.println("짝수 : " + i);
			
			}
		// 이 반복문은 10번 실행되지만, 출력은 그 절반인 5번만 출력된다.
		}
		
		System.out.println("----------------------");
		
		for( int i = 0; i < 10; i+=2) {
			System.out.println("짝수 : " + i);
			
		}
	}
}
