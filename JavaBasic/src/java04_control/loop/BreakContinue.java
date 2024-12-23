package java04_control.loop;

public class BreakContinue {
	public static void main(String[] args) {
		
		// break;
		// 반복문(for, while, do-while) 또는 switch구문을 중단시키는 코드

		// --------------------------------------------------
		
		// continue;
		
		if( true ) {
			System.out.println("HI");
			
			// break; 에러 발생. 반복문이나 switch 없이 break를 사용할 수 없다 
			
			System.out.println("HELLO");
			
		}
		System.out.println("----------------------");
		
		for(int i=0; i<100; i++) { //i, 0~99, 100번
			
			System.out.println( i );
			
			if( i >= 5 ) { // 중단되는 지점은 기존의 i == 5일 때와 똑같지만, 보안상 이렇게 쓰는 것이 더 낫다.
				break; //for문 중단, 일반적으로 if와 다른 반복문(for, while, do-while, switch) 구문과
			// 조합된 상황에서 실행된다.
			}
			
		}
		System.out.println("----------------------");

		for(int i=0; i<5; i++) { //i, 0~4, x5
			
			for(int j=0; j<5; j++) { //j, 0~4, x5
				
				if( j>=2 ) {
					break;
				}
				
				System.out.println("i:" + i + ",j:" + j);
			
			}
			
			System.out.println();
		}
		System.out.println("----------------------");

		// continue;
		// 반복문에서만 사용할 수 있는 제어문
		
		// 현재 반복코드(중괄호)를 중단하고 다음 반복을 수행한다.
		// 반복문의 {}중괄호 블록의 남은 코드 부분을 break와는 달리 한번만 건너뛴다.
		
		for( int i=0; i<10; i++ ) { //i, 0~9, 10회
			
			if(i %2 == 0 ) { //짝수
				continue; // 짝수일때 하지 않는다.
				
			}
			System.out.println(i); // 조건으로 짝수가 걸려있지만, 실제로는 홀수를 출력한다.
		}

		System.out.println("----------------------");
		
		//** while문의 contivue는 조건식으로 가기때문에
		// 증감식을 만나지 못하고 조건 검사만 반복 수행한다
		
		// -> (예상치 못 한) 무한 루프
		
//		int i = 0;
//		while( i<10 ) { //i, 0~9, 10회
//			
//			if(i %2 == 0 ) { //짝수
//				continue; // 짝수일때 하지 않는다.	
//			}
//			
//			System.out.println(i); // 조건으로 짝수가 걸려있지만, 실제로는 홀수를 출력한다.
//			
//			i++; // for문은 continue 만나면 증감식으로 가지만, while, do-while문의 경우에는
//			// continue 만나면 조건식으로 간다. 위의 코드는 무한루프가 발생한다.
		// --------------------------------------------------
//		}
		
		// 대처법 : 짝수일 때도 continue; 바로 앞에 증감식을 한번더 적는다.
		
		//** for문에서는 continue 수행 시 증감문으로 간다
		
		//** while, do-while문에서는 continue 수행 시 조건식으로 간다
		
	}
}
