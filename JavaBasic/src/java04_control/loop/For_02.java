package java04_control.loop;

public class For_02 {
	public static void main(String[] args) {
		
		// i 변수가 0부터 시작해서 10보다 작은 동안 1씩 증가하면서 반복한다.
		for( int i=0; i<10; i++ ) { // i, 0~9, 10번 반복
//			System.out.println( i );
			System.out.println( "Apple" );
		}
		
//		System.out.println("for 이후 : " + i); // 오류가 발생!
		// 이유는 변수의 선언위치와 관련 있다.
		// 지역변수 vs 전역변수
		// 여기서 for문 안쪽에 선언된 변수 i는 for문 안쪽에서만 살아있는 지역변수이므로
		// for문 바깥으로 나갈 수 없다.
		
		// ** for문의 초기식에서 선언된 변수는
		// for문의 {}중괄호 밖에서 사용할 수 없다.
		// ** for문이 종료될 때 같이 삭제된다.
		
		//----------------------------------------------
		
		int i; // for문 밖으로 나가면서, for문 안쪽의 변수 i가 지워졌기 때문에
		// 오류가 발생하지 않는다.
		
		for( i=0; i<13; i++) {
			System.out.println(i);
		}
		
		// i변수가 0부터 13보다 작은 동안 1씩 증가하면서 반복
		
		// 반복횟수 : 13회
		// 반복구간 : 0 ~ 12(중괄호 안쪽구간 기준)
		
		System.out.println("-----");
		
		for ( i=6; i<11; i++) {
			System.out.println(i);
		}
		
		// i변수가 6부터 11보다 작은 동안 1씩 증가하면서 반복
		
		// 반복횟수 : 5번
		// 반복구간 : 6 ~ 10
	}
}
