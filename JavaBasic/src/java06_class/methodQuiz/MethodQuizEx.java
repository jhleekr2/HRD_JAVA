package java06_class.methodQuiz;

public class MethodQuizEx {
	public static void main(String[] args) {
		
		//실행 가능하도록 작성하기
		MethodQuiz mq = new MethodQuiz();
		//자료형 변수명;-> 자료형 첫글자 대문자 -> 클래스
		//새 클래스 만들어야 한다.
		
		//1~100 출력
		mq.print100();
		
		//"Hello"를 7번 출력
		mq.printHello(7);
		mq.printHello(3); //추가 확인
		
		//첫 인자만큼, 두번째 인자 출력
		mq.printData(3, "안녕");
		mq.printData(5, "HOLA"); //추가 확인
	}

}