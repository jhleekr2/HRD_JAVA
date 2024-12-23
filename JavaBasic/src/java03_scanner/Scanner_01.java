package java03_scanner;

import java.util.Scanner;

//** import 선언
// -> 현재 소스코드와 다른 패키지의 클래스를 사용할 때
// 패키지 이름 없이 클래스 이름만으로 사용할 수 있게 해준다

// java.util.Scanner -> Scanner
public class Scanner_01 {
	public static void main(String[] args) {
		
		// class Scanner
		// 스캐너 클래스
		
		// 키보드로 입력한(타이핑한) 내용을 프로그램 데이터로 가져오는 기능의 클래스
		// 입력 기능 클래스
		// -----------------------------------
		
		//기본형 변수
		int num; //int타입 변수 선언
		num = 13;
		// -----------------------------------

		//참조형 변수
		java.util.Scanner input; //Scanner타입 변수 선언 -> java.util패키지에 정의되어 있음
		// 따라서, java.util.Scanner라고 써야 오류가 안난다. 아니면 미리, import 해줘야만 그냥 Scanner라고 쓸수 있다.
		// 단, java.lang패키지에 정의되어 있는 것들은 예외
		Scanner in; // Scanner타입 변수 선언
		
		in = new Scanner( System.in ); // Scanner의 키보드 입력 기능 활성화
		// 컴퓨터는 키보드를 빌려간 것으로 간주하고, 키보드를 모두 사용한 후에는 close를 해줘야 한다.
		// 안그러면 리소스가 새어나간다는 경고가 발생한다.
		// 따라서, 자원을 반납(해제)하기 위해 마지막에 in.close();를 써야 한다.
		// 모니터나 키보드 같은 기본장치 이외의 다른 장치에서 자원을 반납하지 않으면, 각종 오류가 발생할 수 있다.
		// -----------------------------------
		
		Scanner scan = new Scanner( System.in ); // System.in -> 키보드를 의미한다. 키보드 하나만 만들고 쓰면 된다.
		
		// -----------------------------------
		
//		in.nextInt(); // 키보드 입력을 받은 것을 정수형으로 저장한다. 입력 1번 수행
		
//		int data = in.nextInt(); // 숫자형 int 타입을 받는다. 입력 1번 더 수행
		
//		System.out.println("입력한 값 : " + data);
		
		// -----------------------------------
	
		System.out.print("숫자를 입력하세요 : "); // 출력(프로그램에서 나가는 것) - 모니터(Console)과 연결
		int number = in.nextInt(); // 입력(프로그램으로 들어오는 것) - 키보드와 연결
		// 프로그램을 기준으로 한다.
		
		// -----------------------------------
		
		System.out.print("실수값 입력 : ");
//		double number2 = in.nextDouble();
//		System.out.println("입력한 실수값 : " + number2);
		System.out.println("입력한 실수값 : " + in.nextDouble()); // 연산자 우선순위 탓에 먼저 in.nextDouble()이 먼저 실행.

		// -----------------------------------

		// 자원 반납(해제)
		// -> 연결해서 사용한 키보드의 사용 종료를 알린다.
		in.close();
		
	}
}
