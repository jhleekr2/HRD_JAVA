package java06_class.methodQuiz;

public class MethodArrayQuizExReturn {
	public static void main(String[] args) {
		
	MethodArrayQuizReturn maq = new MethodArrayQuizReturn();
	
	int[] arr = { 1,2,3,4,5 };

	//Q1. arr배열의 모든 요소를 10배하여 res배열에 저장한다.
	int[] res = maq.mul10( arr );
	
//	for(int i=0;i<res.length;i++) {
//	System.out.println(res[i]); // 디버깅 목적 코드
//	}
	res = maq.mul10( res ); // 추가 확인 - 이때는 res배열을 대입해야 의도한 결과
	
	//Q2. res배열의 모든 요소를 출력한다.
	maq.print( res );
	}
}