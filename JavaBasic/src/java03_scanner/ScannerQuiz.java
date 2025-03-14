package java03_scanner;

import java.util.Scanner;

public class ScannerQuiz {
	public static void main(String[] args) {
		//학생 정보 관리 프로그램
		   
		//   이름, 나이, 성별, 국어, 영어, 수학
		//   6가지 정보를 저장할 수 있는 변수를 만들고
		//   총점과 평균을 포함한 결과를 출력한다
		   
		//동작 예시)
		   
		//===== 입력 =====
		//Input Name : Alice
		//Input Age : 33
		   
		//Input Gender : F
		   
		//Input Korean : 100
		//Input English : 99
		//Input Mathematics : 97

		//===== 출력 =====
		//이름   나이   성별   국어   영어   수학   총점   평균
		//Alice   33      F      100      99      97      296      98.666666667
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Name : "); // 이름 입력 메시지 출력
		String name = sc.nextLine(); // 입력받는 부분
//		sc.nextLine();
//		sc.skip("[\\r\\n]+");
		
		// 코딩은 다 완성하고 실행해보는 것이 중요하지 않고, 하나하나 잘 실행되고
		// 있는지를 확인하고 테스트 하는 것이 더 중요하다.
		
		System.out.print("Input Age : "); // 나이
		int age = sc.nextInt(); // 면접에서 변수명에 대문자 쓰는순간 바로 탈락하므로 주의!
		
		System.out.print("Input Gender : "); // 성별
//		String gender = sc.next();
		
		// 다른 방법
		sc.nextLine(); // 버퍼 비우기!
		char gender = sc.nextLine().charAt(0); // 테스트 결과 이 부분에서 버그가 발생하고 있다. 원인? 버퍼
//		System.out.println(1111);
//		char gender;
//		System.out.println(2222);
//		String test = sc.nextLine(); // 하지만, 실제 오류는 여기서 잘못 쓴 것이 원인!
//		System.out.println(3333);
//		gender = test.charAt(0); // 디버깅 결과 여기서 오류가 발생!
//		System.out.println(4444);
		
//		System.out.println("테스트] gender : " + gender);
		
		
		System.out.print("Input Korean : "); // 국어
		int kor = sc.nextInt();
		
		System.out.print("Input English : "); // 영어
		int eng = sc.nextInt();
		
		System.out.print("Input Mathematics : "); // 수학
		int mat = sc.nextInt();
		
		// 총점과 평균을 바로 출력해도 되지만, 계산을 미리 해서 출력하는 것이 좋다.
		
		// 총점 계산
		int sum = kor + eng + mat;
		// 평균 계산
		double avg = sum / 3.0;
//		double avg = sum / (double)3;
		// 입력값 출력하는 부분
		System.out.println("이름" + "\t" + "나이" + "\t" + "성별" + "\t" + "국어" + "\t" + "영어" + "\t" + "수학" + "\t" + "총점" + "\t" + "평균");
		System.out.printf(name + "\t" + age + "\t" + gender + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + sum + "\t" + "%.2f", avg);
		System.out.println();
		// 출력부분 또한, 가로로 너무 길어지므로 여러개의 System.out.print의 조합으로 바꿔 쓸 수 있다.
		
		sc.close();
		
		// 항상 코드를 분리하려는 습관을 기르자! 훨씬 효율적이고, 팀프로젝트도 수월하게 가능하다.
	}
}
