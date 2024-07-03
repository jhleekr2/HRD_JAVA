package java04_control.loop;

public class For_09 {
	public static void main(String[] args) {
		
		//for문 중첩, 2중 for문, 3중 for문, ....
//		(일반적으로 3번을 넘어가면 성능이 극적으로 저하되고,4번 이상은 성능 저하가 너무 심해 사용하지 않는다. )
		
		//------------------------------------------------------
		//** 바깥쪽 반복문의 반복 횟수, 구간에 맞춰서, 안쪽 반복문의 빈복 횟수, 구간을 생각해야 한다.
		for(int i=0; i<3; i++ ) { //i, 0~2, x3
			
			for(int j=0; j<3; j++) { // j, 0~2, x3
				// 이때 선언된 변수를 안에서 다시 건드는 것은 위험하다.
				System.out.println("i: " + i + ", j: " + j);
			} //j for end
			System.out.println("---------------------");
		} //i for end
	} //main end
} // class end
// 닫는 중괄호에 주석을 쓴다(중괄호 관련 오류는 컴파일러가 잘 이해하지 못하기 때문)
