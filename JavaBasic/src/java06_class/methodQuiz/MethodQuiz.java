package java06_class.methodQuiz;

public class MethodQuiz {

	public void print100() {
		for(int i=0;i<100;i++) { //1부터 100까지 숫자 출력
			System.out.print((i+1) + " ");
			if(i % 30 == 29) {
				System.out.println();
			} else if (i == 99) {
				System.out.println();
			}
		}
	}
	
	public void printHello(int num1) {
		for(int i=0; i<num1;i++) { //num1의 횟수만큼 hello 출력
			System.out.println("Hello");
		}
	}
	
	public void printData(int num1, String args) {
		for(int i=0; i<num1; i++) { //num1의 횟수만큼 제시한 문자열을 출력
			System.out.println(args);
			
		}
	}
}

// 그날그날의 진도는 바로바로 복습을 해두자
// 복습하고 시간남으면 더 이전의 개념들 복습으로 올라가야 한다
// 현실적으로 수업시간이 길기 때문에 예습시간은 거의 나지 않을 것이다