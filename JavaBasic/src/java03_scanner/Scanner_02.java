package java03_scanner;

import java.util.Scanner; // 입력기능(클래스)변수 선언

public class Scanner_02 {
	public static void main(String[] args) {
		
		// 문자열(string) 입력받기
		
		// 1. 입력기능(클래스) 변수 선언
//		Scanner in;
//		in = new Scanner( System.in ); // Scanner의 키보드 입력 기능 활성화
		Scanner sc = new Scanner( System.in); // 이때 Scanner를 자동완성 시키면 알아서 import 선언이 된다.
		// Scanner - 클래스이름(식별자), scan - 식별자(클래스 이름)에 대한 식별자
		// 특히, import 선언이 없었더라도, 단축키 Ctrl + shift + O (라이브러리 import최적화) 해주면 알아서 해준다.
		// 하지만, 때때로 똑같은 이름을 가진 다른 패키지들이 종종 있으므로 맹신하진 말자.
		
		// 2. 입력기능 활성화(생성) 하기
		sc = new Scanner(System.in);
		
		// 여기까지가 준비
		
		// 3. 문자열 입력 받기
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		// nextline() - 타이핑한것을 한줄 단위로 입력받는다. 즉, 엔터 누르기 전까지 입력한 모든 것들을 입력.
		
		// 4. 입력받은 문자열 출력하기
		System.out.println();
		System.out.println("--- 입력받은 문자열 ---");
		System.out.println(str);
		
		sc.close();
		
	}
	
}
