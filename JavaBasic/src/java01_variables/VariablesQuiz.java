package java01_variables;

public class VariablesQuiz {
	// 변수에 알맞은 타입을 골라 선언하고 대입한 후 모든 변수의 데이터를 출력해보자.
	//1. 변수에 알맞은 타입을 골라
	// 이름, 나이, 성별, 키
	
	// 이름 - 문자열 - String
	// 나이 - 정수 - int
	// 성별 - 문자 - char(String도 가능)
	// 키 - 실수 - double(float도 가능)
	// 되도록이면 손가는대로 코딩하지말고 차근차근 정리해가면서 하자. 손가는대로 코딩하는 것을 막코딩이라 하는데
	// 별로 안좋다. 높은확률로 틀릴것이고, 고치는데 더많은 시간이 걸린다.
	
	public static void main(String[] args) {
		//2. 선언하고
		String name; // 이름
		int age;     // 나이
		char gender;    // 성별
		float height;// 키
		
		//3. 대입한 후
		//일단 변수를 만든 후에는 자동완성(Ctrl + space) 적극적으로 써보자.
		name = "Alice"; // String 한글자만 쓰고 싶어도 "" 사용한다.
		age = 45;
		gender = '남'; // 자바에선 한글도 한글자로 인정된다.(C언어는 아님)
		height = 165.06f;
		// 문자
		// char, String
		
		// char -> 단일(1개) 문자 -> 'A' (두 개 이상의 문자열은 쓸수 없다.)
		// String -> 문자열 -> "A"
		
		//4. 모든 변수의 데이터를 출력해보자
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("키 : " + height);
		
		System.out.println("-----------------");
		
		System.out.println("이름 : " + name + ", " + "나이 : " + age + ", " + "성별 : " + gender +  ", " + "키 : " + height);
		
		System.out.println("-----------------");

		System.out.print("AAAA");
		System.out.print("BBBB");
		
		System.out.println(); // 줄바꿈

		System.out.println("-----------------");
		
		System.out.print("이름 : " + name + ", ");
		System.out.print("나이 : " + age);
		System.out.print(", 성별 : " + gender);
		System.out.print(", ");
		System.out.println("키 : " + height);
		// 코드 작성 스타일은 가급적 통일하자.
		System.out.println("-----------------");
		
		System.out.println("HI HELLO HOLA");

		System.out.println("-----------------");

		System.out.println("HI	HELLO	HOLA");
		System.out.println("HI\tHELLO\tHOLA"); // \t = Tab키 -> 컴퓨터 내부에선 1글자로 인식해서 작은따옴표 사용가능
		System.out.println("HI\nHELLO\nHOLA"); // \n = New Line(또는 Line Feed(LF))
		
		//** '\t' : 탭 문자
		// (ASCII 9 - HT, Horizontal Tab)
		
		//** '\n' : 개행 문자, 줄바꿈 문자
		// (ASCII 10 - LF, Line Feed)
		// '\n' = 2바이트(역슬래시 합쳐져서 1바이트 + 작은따옴표 2개가 1바이트)
		System.out.println("-----------------");

		System.out.println("Banana");
		System.out.print("Banana\n"); // 자바를 제외한 다른 언어들은 개행을 자동으로 해주는 println같은 명령이 없다.
		System.out.println("Banana");
		System.out.println();
	}
}
