
// 주석(Comment)
// 코드에 대한 설명을 적을 때 사용하는 문법
// 자바 코드에는 존재하나 실행할 때 영향을 주지 않는다.

// 한줄주석
/* 문장주석 */
/* <- 문장주석의 시작 / 문장주석의 끝 -> */


//패키지(package) 선언 코드, 패키지는 일종의 폴더로 봐도 된다.
// -> 현재 코드(파일)가 test라는 패키지에 포함되었음을 알린다.
package test; //패키지 테스트

//클래스 정의 코드
// -> 클래스, class : 자바 프로그램을 구성하는 기능의 개발 단위
// -> 클래스를 새롭게 만드는(정의하는) 코드
// 1개의 기능 만들때 웹의 경우에는 5개 정도의 클래스가 필요
// 1개 프로그램은 보통 80-150개 정도의 클래스로 이루어져 있음
// 클래스 설계 담당의 경우는 보통 5년 경력직부터 회사에서 요구하며
// 10-15년차가 주력으로 담당한다.
public class Test { //퍼블릭 클래스 Test
		
		//메인(main) 메소드(method) 정의 코드
		//지금은 많이 없어졌지만, 코로나시대 이전에는 메인메소드를 손코딩하는 시험문제/면접문제 가 출제되기도 했었다.
	public static void main(String[] args) {
		//퍼블릭 스태틱 보이드 메인 ( 스트링 배열 args )
			
		//메인 메소드, Main Method
		//자바 프로그램의 시작점
		//콘솔 창에 문장을 출력하는 기능을 수행(실행)하는 코드
		System.out.println("안녕하세요!!!!!!!!!!");
		//시스템 점 아웃 점 프린트엘엔
		//시스템 점 아웃 점 프린트라인(line)
		
	//메인 메소드 정의의 끝, 자바 프로그램의 중단점(Terminate)
	}

//Test 클래스 정의 코드의 끝
}
