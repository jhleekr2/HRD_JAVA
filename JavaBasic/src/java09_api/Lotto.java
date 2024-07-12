package java09_api;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	//로또 번호 생성기
	// 1~45 범위의 랜덤
	// 6개
	// 중복되지 않도록
	//-----------------------------
	
	// 강사가 수업중에 다룰 내용이었으나, 국비1등은 이 코드를 독자적으로 구현했음!
	
	//랜덤 객체
	private Random ran = new Random();
	
	public void makeLotto(int[] lotto) {
		//6개의 인덱스에 중복되지 않은 숫자 채우기
		for(int i=0; i<lotto.length; i++) {
			//로또번호 랜덤 추출
			int num = ran.nextInt(45) + 1;//1~45
			
			//--중복값 제거하기--
			
			//중복 체크 플래그(flag)변수
			boolean isExist = false;
			
			//중복 체크
			// -> num값이 기존의 lotto배열에 들어있는지 확인
			// -> flag에 저장
			
			for(int j=0;j<i;j++) {//이전에 생성했던 숫자들의 인덱스
				if( lotto[j] == num ){//중복된 값이 이미 존재하는 경우
					isExist = true;//중복 발생했다고 flag만 세워놓고 넘어감
					break;
				}
			}
			//중복 체크 결과에 따른 동작 수행
			// -> flag에 따라 기능 수행
			if(isExist) {
				i--; //반복횟수 한번 추가하기
				continue;
			}
			//--------------------------------
			
			//플래그(Flag)
			//변수활용(boolean, int)
			//맞았다 true 1
			//안맞았다 false 0
			//
			//검사(체크) 기능 수행 
			// 플래그로 결과 저장
			// -> true/false
			//--------------------------------
			//
			//플래그 검사
			// true -> 실행
			// false -> 실행X
			//
			
			//랜덤값을 배열에 대입하기
			lotto[i] = num;
		}
		
		//정렬
		Arrays.sort(lotto);
	}	
		
	public void makeLotto2(int[][] lotto2) {
		
		for(int i=0; i<lotto2.length; i++) {
			this.makeLotto( lotto2[i] );
		}
	}
	
}
