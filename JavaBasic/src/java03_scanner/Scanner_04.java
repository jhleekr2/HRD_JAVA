package java03_scanner;

import java.util.Scanner;

public class Scanner_04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// ---------------------------------------------------
		
		// Scanner를 이용한 char값 처리하기
		// -> Scanner에는 char를 직접 입력받는 메소드가 없다.
		// -> nextChar() 메소드 없음
		
		// -> String 타입은 char형을 모아서 나열해 둔 클래스 타입이다.
		// -> String으로 입력받은 문자열의 첫 글자(0인덱스)를 char타입으로 꺼내서 사용할 수 있다.
		// ---------------------------------------------------
		
		// 이 과정이 복잡하기 때문에, char타입을 굳이 쓰지 않고 일반적으로는 String 타입으로 처리해도 된다.
		// 단, 일부 경우에 있어서 char타입을 쓰긴 써야 할 수 있다.
		
		String str = "Apple Banana"; // [6]번째 문자 = 'B'
		// 12개의 문자로 구성 -> 인덱스는 0-11
		//str. 하면 공식 문서에 나온 모든 메소드들이 추천이 된다.
		
		//String객체.charAt(인덱스)
		// -> String객체에 저장된 문자열 중 인덱스에 해당하는 문자를 char타입으로 반환한다.
		
		char returnData = str.charAt(6); //'B'
		System.out.println("6번째 인덱스 : " + returnData);
		
		returnData = str.charAt(0); // 'A'
		System.out.println("0번째 인덱스 : " + returnData);
		
		System.out.println("---------------");
		
		System.out.println("Input: ");
		
		char charData = sc.nextLine().charAt(0); // Scanner 데이터타입 -> . 후에 나오는 것들은 앞에 있는 데이터타입의 기능들임.
		//결과적으로 sc.nextLine() 까지의 타입은 String 타입이다. 따라서, sc.nextLine 뒤에 .하면
		//String 타입의 기능(메소드)들이 나온다.
		//sc.nextLine().charAt(0); 전체 코드의 데이터 타입 = char 타입!
		//마우스를 위에 올리면 IDE가 알아서 데이터 타입을 표시해준다.
		// 위의 코드가 너무 복잡하기 때문에 코드를 둘로 나눌 수도 있다.
//		String strData = sc.nextLine();
//		char charData2 = strData.charAt(0);
		
		System.out.println( charData );
		
		System.out.println("---------------");
		
		System.out.println("Input: ");
		String strData = sc.nextLine();
		char charData2 = strData.charAt(0);
		System.out.println( charData2);
		
		// 이 코드는 char타입 처리가 안 되는 것을 우회를 통해 char 타입을 흉내낸 것이다.
		sc.close();
	}
}