package java02_operator;

public class Binary_02 {
	public static void main(String[] args) {
		
		int n1 = 15, n2 = 6; // ,도 연산자로 취급되지만, 특수한 기능이 있어서 기타 연산자라고 부른다.
		
		System.out.println( (double)n1 / (double)n2 );
		//n1까지는 정수형이지만, (double)로 인해 나누기 할때는 double형으로 바뀌어 계산된다.
		//이때 (double)을 형 변환 연산자라 부르며, 단항 연산자이다 -> 오른쪽에 있는 항목 하나를 받아들여 적용된다.
		//연산자보다 변수값 불러오기가 더 우선순위
		//단항 연산자가 모든 이항 연산자보다 우선순위가 더 높고, 단항 연산자끼리는 우선순위가 같다.
		
		System.out.println("--------------------------");
		
		System.out.println( n1 / (double) n2 );
//		System.out.println( 16 / (double) 5);
//		System.out.println( 16 / 5.0); // int / double
//		System.out.println( 16.0 / 5.0); // double / double(자동형변환)
//		System.out.println( 2.5 );
		
		System.out.println("---- 잘못 사용한 경우 ----");
		
		n1 = 17;
		n2 = 3;
		
		System.out.println( (double)(n1 / n2) ); // 실제 개발에서 이러한 문제 때문에 버그가 발생하는 경우가 많다.
		// ()가 최우선 연산자여서 문제가 발생한다.
//		System.out.println( (double)(17 / 3));
//		System.out.println( (double)(5));
//		System.out.println(5.0);
		System.out.println( ((double)n1 / n2) ); // 올바른 사용예

		System.out.println("--------------------------");
		
		double dNum = 3.14;
		
		System.out.println( "3.14 / 2 = " + (dNum/2));

		System.out.println( "3.14 % 2 = " + (dNum%2)); // 소수에 대한 나머지 연산은 다른 언어에서는 차단해놓은 경우가 많다.
		// 1.1400000000000001 - 컴퓨터는 소수부분이 따로 없이 2진수로 받아들이기 때문에 특별한 실수표현체계를 따로 만들어놓았다.
		// 컴퓨터의 실수표현체계를 '부동 소수점(floating point)' 이라 부른다. 이진수로 소수부분을 표현하기 너무 힘들어서 뒤에
		// 오차가 남는다. 오차를 개발자가 알아서 무시해주는 추가적인 처리를 해줘야만 한다.
		// 컴퓨터의 실수 처리의 어려움 때문에 실수부분 계산만을 엄청나게 강화시킨 부품이 바로 GPU이다.
		// ** 실수 계산에서는 부동소수점 표현 오차가 발생할 수 있다.
		// -> 0.0000000000000001
		
		// 일반 프로그래머들은 자료구조와 알고리즘 공부가 필요하지만, 단순 웹앱 만드는 직업으로 취업하는 경우에는
		// 자료구조와 알고리즘 없이 CRUD(게시판 작성) 정도면 충분하다. CRUD는 사실, 어려운 프로그래밍 지식 필요없이
		// 단순 반복작업에 가깝다. 현실적으로 더 어려운 프로그램 개발이 가능한지의 갈림길은 3년차 정도에서 갈린다.
		// 3년차 이후에도 단순 CRUD만 가능하느냐, 아니면 3년차 이후에 자료구조와 알고리즘 같은 고급 기술을 쓸 수 있느냐
		// 이런것들이 갈린다.
		
		// 정보처리기사 - 일부 회사에서 요구! -> 취득하면 좋지만 자격조건 제한이 있고, 취득하면 취업할 수 있는 회사범위 넓어진다.
		// SI 하청할때 초급/중급/고급을 나누는 조건이 정보처리기사 자격증이기 때문에, 일부 회사가 요구함.
		// 정보처리기사 - 전공자 기준으로 6-7학기 분량의 시험범위를 커버한다.
		// 공부시간 - 필기에만 40-50시간 정도 요구한다.
	}
}