package java04_control.loop;

public class While_02 {
	public static void main(String[] args) {
		
//		초기식; // 초기식은 while코드 이전(밖)에 작성한다.
//		
//		while(조건식) {
//			//조건식이 참(true)일 때 실행할 코드
//		
//			증감식; //증감식은 while의 {} 중괄호 안쪽 제일 마지막 코드로 작성한다.
//		}
		
		// 초반에는 while 조건식을 for와 같은 형식으로 쓰자!
		
		for(int i=0; i<10; i++) { // i, 0~9, 10번
			System.out.println( i );
		} // 증감에 영향을 많이 받을때 사용
		
			System.out.println("-----------");
		int i = 0;
		while(i<10) {
			System.out.println( i );
			i++;
		} // 조건만 따진다
		
		//---------------------------------------------------------
		//** for 문은 반복 휫수가 정해져있거나 정수값의 진행을 반복적으로 수행해야 할
		//때 주로 사용한다.
		
		//** while문은 반복 수행운 해야하지만 횟수가 명확하지 않거나 정해지지 않았을 떄
		//주로 사용한다.
		//-> 반복이 종료되는 시점만 조건으로 나타낼 수 있는 경우
	}
}
