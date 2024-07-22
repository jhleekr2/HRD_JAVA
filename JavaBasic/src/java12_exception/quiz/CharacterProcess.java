package java12_exception.quiz;

import java12_exception.quiz.exception.CharCheckException;

//디폴트 생성자
public class CharacterProcess {

	// 전달된 문자열값에서 영문자가 몇개인지 카운트해서 리턴
	// 공백문자 있으면 CharCheckException 발생
	// "체크할 문자열 안에 공백 포함할 수 없습니다." 에러 발생
	
	public int countAlpha(String s) throws CharCheckException {//여기서는 예외처리를 다른곳으로 미뤘음
		int num = 0;
//		System.out.println(s); // 테스트 코드
		for(int i=0 ; i<s.length() ; i++ ) { //전달된 문자열값에서 영문자가 몇개인지 카운트해서 리턴
			if((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) {
//				System.out.println(s.charAt(i)); 문자열 테스트용 코드
				num++;
			} else if(s.charAt(i) == ' ') { //만일 전달된 문자열에 공백이 있으면, 예외 발생
				//예외 발생시키기
				throw new CharCheckException();
			}

		}
		
		//이때 Wrapper클래스와 for-each구문, API 등을 이용한 풀이법
		
//		for (Character ch : s.toCharArray()) {
//			//공백문자 파악
//			if( Character.isSpaceChar(ch) ) {
//				System.out.println("공백 찾음");
//			}
//			
//			//알파벳 파악
//			if( Character.isAlphabetic(ch) ) {
//				System.out.println("알파벳 찾음");
//			}
//		}
		
		return num;
	}
	
}
