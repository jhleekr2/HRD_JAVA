package java12_exception.quiz;

import java12_exception.quiz.exception.NumberRangeException;

public class NumberProcess {
	
//	- 임의의 정수 두개를 전달받아, 첫번째 수가 두번째수의 배수인지 확인하고
//	  배수가 맞으면 true 를 리턴하고, 아니면 false를 리턴함
//	- 단, 전달된 첫번째와 두번째 수가 1~100사이의 값이 아니면
//	  NumberRangeException 발생시킴
//	- 에러메시지 : "1부터 100사이의 값이 아닙니다."

	public boolean checkDouble(int n1, int n2) throws NumberRangeException { // 여기서는 예외처리를 다른 곳에 전가시킨다.
		
		if(n1 > 0 && n1 <= 100 && n2 > 0 && n2 <= 100) {
		
			if( n1 % n2 == 0) {
				return true; //return으로 끝나는 구조면 else 안써도 될수 있다.
			}
			return false; // boolean은 기본값이 false이므로 아무것도 안적었을때는 return false가 더 맞다.
		} else {
			//예외 발생시키기
			throw new NumberRangeException(); //사실, 구조상으로는 예외를 사전차단 하는 것이 더 낫다.
		}
			
	}
	
}
