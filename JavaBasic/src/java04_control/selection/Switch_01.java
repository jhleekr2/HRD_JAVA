package java04_control.selection;

public class Switch_01 {
	public static void main(String[] args) {
		
		//switch문, 선택문 (조건문)
		// switch ~ case 문으로도 불린다.(switch와 case는 함께 쓴다.)
		
		//---------------------------------------------------------------
		
//		switch( 비교대상 ) {
//		
//		case 비교값1: // 세미콜론 쓰면 안된다. 예전에 존재하던 goto문의 흔적.
//			실행코드1;
//			
//		case 비교값2:
//			실행코드2;
//			
//		case 비교값3:
//			실행코드3;
//			
//		default:
//			같은 값을 가지는 비교값이 없을 때 default: 부분 실행;
//			
//		}
		
		//** 비교 대상에는 정수형, 문자(char), 문자열(String) 타입이 들어간다
		// ( 연산식도 사용할 수 있다 ) -> 연산의 결과가 정수, 문자, 문자열 타입이면 된다.
		// 실제로 변수 이름도 상당히 많이 사용된다.
		
		//** 비교대상과 같은 값으로 지정한 case구문의 위치(줄)부터 아래쪽 코드를
		//전부 실행한다.
		
		//** default: 부분은 생략할 수 있다.
		
		int num = 10;
		
		switch( num ) {
		
		case 30:
			System.out.println("30입니다");
			break;
			
		case 10:
			System.out.println("10입니다");
			break;
			
		case 20:
			System.out.println("20입니다");
			break;
			
		default:
			System.out.println("10, 20, 30 모두 아닙니다");
		}
		
		System.out.println("switch구문의 바깥쪽");
	}
}
