package java06_class.methodQuiz;

public class MethodArrayQuizEx {
	public static void main(String[] args) {
		
	MethodArrayQuiz maq = new MethodArrayQuiz();
	
	int[] arr = { 1,2,3,4,5 };

	//Q1. arr배열의 모든 요소를 10배한다.
	maq.mul10( arr );
	
//	System.out.println(arr); // 디버깅 코드
	maq.mul10( arr ); // 추가 확인
	
	//Q2. arr배열의 모든 요소를 출력한다.
	maq.print( arr );
	}
}
