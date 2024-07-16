package java09_api;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TimeEx {
	public static void main(String[] args) {
		
//		testDate();
		
//		testCalendar();
		
		testGregorianCalendar();
		
//		testDatetime();
	}
	
	private static void testDate() {
		
		//java.util.Date 클래스
		
		Date today1 = new Date();
		System.out.println( today1 );
		
		Date today2 = new Date(2134525235323L); // 밀리초 단위의 에포크 타임을 적음
		System.out.println( today2 );
		
		//밀리초 단위
		Date today3 = new Date( (long)(1* 1000 * 60 * 60 * 24 * 365) );
		//long형 전환 전에 이미 오버플로우 발생으로 인해 데이터 손실이 일어난다
		System.out.println( today3 );
		today3 = new Date( (long)1* 1000 * 60 * 60 * 24 * 365 );
		System.out.println( today3 );
		
		//자바는 날짜관련 라이브러리들에서 심각한 보안상의 문제점이 발견되어
		//1.8 버전으로 넘어가면서 기존 라이브러리를 Deprecated 시키고 새로운 날짜관련 라이브러리를
		//만들었으나, 새로운 라이브러리조차도 망해서 지금은 SQL에서 빌려와서 쓰는 편이다.
		
		//------------------------------------------------------
		
		//추가 메소드, 생성자 들이 대부분 deprecated 되어 있다.
		
		//단순 현재 시간 저장 또는 날짜시간 저장변수 용으로만 사용된다.
		
		//날짜시간 변경해서 적용할 때에는 java.util.Date를 사용하지 않는다. 대신 java.util.GregorianCalendar 사용
		
		//자바의 날짜관련 라이브러리의 저열한 성능때문에 joda-time같은 날짜관련 사설 라이브러리들이 제작되었다.
		
		//사설 라이브러리 설치 - .jar파일 다운받아서 자바 설치폴더에 추가
	}
	private static void testCalendar() {
			
		//java.util.Calendar 클래스
		
//		Calendar today; // new를 쓸수 없다. 대신 만들어져 있는 인스턴스를 구해서 쓰도록 되어있다.
		//Calendar 클래스는 추상 클래스
		Calendar today = Calendar.getInstance();
			
		System.out.println(today);
			
		System.out.println( today.get(1) ); //YEAR
		System.out.println( today.get(Calendar.YEAR) ); //년도
		System.out.println( today.get(Calendar.MONTH) ); //월(0 : 1월, 11: 12월)
		System.out.println( today.get(Calendar.DATE) ); //일
		
		System.out.println( today.get(Calendar.HOUR) ); //12시간 기준 시
		System.out.println( today.get(Calendar.HOUR_OF_DAY) ); //24시간 기준 시
		System.out.println( today.get(Calendar.MINUTE)); //분
		System.out.println( today.get(Calendar.SECOND)); //초
			
	}
		
	private static void testGregorianCalendar() {
		
		//java.util.GregorianCalendar 클래스
		
		GregorianCalendar today = new GregorianCalendar(); //Calendar 클래스와는 달리 new가 가능하다.
//		GregorianCalendar today = new GregorianCalendar(3000, 5, 23, 15, 2, 37);
		//여기서부터 time계산이 가능하다. Calendar, Date 클래스는 time 계산이 불가능.	
		System.out.println(today);
		
		System.out.println( today.get(Calendar.DAY_OF_WEEK) );//1~7 - 한 주의 몇번째 날짜? 요일
		//언어, 라이브러리에 따라 1부터 일요일인지?, 0부터 월요일인지? 알수가 없다.
		//따로 테스트 해봐야한다. 테스트 결과 1-일요일, 7-토요일 임을 확인했다.
		System.out.println( today.get(1) ); //YEAR
		System.out.println( today.get(Calendar.YEAR) ); //년도
		System.out.println( today.get(Calendar.MONTH) ); //월(0 : 1월, 11: 12월)
		System.out.println( today.get(Calendar.DATE) ); //일
		
		System.out.println( today.get(Calendar.HOUR) ); //12시간 기준 시
		System.out.println( today.get(Calendar.HOUR_OF_DAY) ); //24시간 기준 시
		System.out.println( today.get(Calendar.MINUTE)); //분
		System.out.println( today.get(Calendar.SECOND)); //초
		
	}
	
	private static void testDatetime() {
		
		Date now = new Date(); // 현재 날짜/시간
		
		//--------------------------------------------------------
		
		//Date -> Calendar 자료형 변환
		Calendar cal = Calendar.getInstance(); //객체 생성
		cal.setTime(now);
		
		//--------------------------------------------------------
		
		//Date -> GregorianCalendar 변환
		GregorianCalendar greCal = new GregorianCalendar();
		greCal.setTime(now);
		
		Date res1 = cal.getTime(); //Calender -> Date
		Date res2 = greCal.getTime(); //GregorianCalendar -> Date
	}
}

