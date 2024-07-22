package java12_exception.quiz;

import java.util.Scanner;
import java12_exception.quiz.CharacterProcess;
import java12_exception.quiz.exception.CharCheckException;
import java12_exception.quiz.exception.NumberRangeException;

public class ExceptionQuizEx {
	public static void main(String[] args) {
		
		quiz1();
		
		quiz2();
		
	}

	public static void quiz1() {

		System.out.print("영문자가 몇개인지 카운트할 문자열을 입력하세요.>");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		CharacterProcess cp = new CharacterProcess();
		//다른 메소드에 입력값을 보내기 위해 새로운 참조변수 정의
		//(안하면, static해야만 한다)
		
		int countednum;
		try {
			countednum = cp.countAlpha(s);
			System.out.println("입력한 문자열의 영문자 수는 " + countednum + "개입니다.");
		} catch (CharCheckException e) {
			e.printStackTrace();
		} //countAlpha 메소드에 입력값을 보내고, 리턴값을 countednum 변수에 저장한다.
		
//		sc.close();
		
	}
	
	public static void quiz2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1부터 100 사이의 첫번째 숫자를 입력하세요.>");
		int num1 = sc.nextInt();
//		sc.next();
		System.out.print("1부터 100 사이의 두번째 숫자를 입력하세요.>");
//		sc.next();
		int num2 = sc.nextInt();
		
//		System.out.println(num1 + num2);
		NumberProcess np = new NumberProcess();
		
		//이클립스가 감싸주는 try~catch는 제대로 작성되었는지 검증 필요하다.
		//종종 잘못 코드 작성해줌
		try {
			boolean b = np.checkDouble(num1, num2);
				if(b == true) {
					System.out.println(num1 + "은 " + num2 + "의 배수입니다.");
				} else {
					System.out.println(num1 + "은 " + num2 + "의 배수가 아닙니다.");
				}
					
//			System.out.println(b);
		} catch (NumberRangeException e) {
			e.printStackTrace();
		}
	}
	



}
