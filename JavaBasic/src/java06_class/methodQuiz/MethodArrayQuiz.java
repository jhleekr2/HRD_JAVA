package java06_class.methodQuiz;

public class MethodArrayQuiz {

	public int[] mul10(int[] args) {
		for(int i=0;i<args.length; i++) {
			args[i] = args[i] * 10; //arr배열의 모든 요소 10배
		}
		return args;
	}
	
	public void print(int[] args) {
		for(int i=0;i<args.length; i++) {
			System.out.print(args[i] + " "); //arr배열 모든 요소 출력
		}
		System.out.println();
	}
}
// 원래 문제는 return값이 있다. return값 있는 문제 풀어보자!