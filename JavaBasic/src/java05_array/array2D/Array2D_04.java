package java05_array.array2D;

import java.util.Scanner;

public class Array2D_04 {
	public static void main(String[] args) {
		
		//학생 성적 관리 프로그램
		// -> 국영수 3과목 점수

		// 점수 1개 -> int
		// 3과목 점수 -> int[3]
		// 4학생의 점수 -> int[4][3]
		// 2개 학급 -> int[2][4][3]
		// 1~3학년 -> int[3][2][4][3]
		
		int[][][][] sco = new int[3][2][4][3];
		// 현실적으로는 변화 가능한 학급수, 학생수, 과목 수의 문제와 성능 문제 등으로 인해
		// 3차원 이하의 배열만 사용한다.
		
	    //QUIZ.
	    //   2명의 국어, 영어, 수학 점수를 처리하기
	    //   학생들의 점수를 입력받고 총점과 평균을 계산하여 출력한다 
	      
	    //   ** 2차원배열 이용해보기
	      
	    //   int[2][3] - 학생들 점수
	    //   int[2] - 학생들 총점
	    //   double[2] - 학생들 평균
	      
	    //----- 최종 출력 -----
	    //   번호   국어   영어   수학   총점   평균
	    //   1번      xxx      xxx      xxx      xxx      xxx.xx
	    //   2번      xxx      xxx      xxx      xxx      xxx.xx
		
		Scanner sc = new Scanner(System.in); // 키보드 입력
		
		final int Student = 2;
		final int Subject = 3;
		
		int[][] arr = new int[Student][Subject];
//		arr = new int[2][3];
		
		int[] tot = new int[Student];
		double[] avg = new double[Subject];
		
		for(int i=0; i<Student; i++) {
			for(int j=0; j<Subject; j++) {
				System.out.print(i+1 + "번 학생의 " + (j+1) + "과목 점수를 입력하세요. >");
				arr[i][j] = sc.nextInt(); // i번 학생의 j과목 점수 입력
				tot[i] += arr[i][j]; // tot[0] = arr[0][0] + arr[0][1] + arr[0][2]
				// tot[1] = arr[1][0] + arr[1][1] + arr[1][2]
			}
			avg[i] = tot[i] / (double)Subject; // 평균 구하기
		}
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		
		for(int i=0; i<Student; i++) {
			System.out.print((i+1) + "번\t");
			for(int j=0; j<Subject; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println(tot[i] + "\t" + String.format("%.2f",avg[i] ) );
		}
		
		
		
	}
}