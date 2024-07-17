package java10_collection.practice1;
//	QUIZ.
//	Set 계열 클래스와 Random 사용
//
//	- 클래스명 : java10_collection.practice1.Lotto.java
//  >> main() 메소드 포함
//  >> lottoDisplay() 실행
//
//	- 메소드 추가 : public static void lottoDisplay(){}
//  >> 구현내용
//
//  1. 1 ~ 45 사이의 정수를 중복되지 않게, 6개 발생시켜
//
//  2. 자동 오름차순정렬되게 처리하는 Set 에 보관하고 
//
//  3. 리스트로 바꾸어 출력.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Lotto {
	public static void main(String[] args) {
		lottoDisplay();
		
		
	}
	
	public static void lottoDisplay() {
		Set set = new TreeSet(); //Set 정의 - 자동정렬 해야하므로 TreeSet 사용
		
		Random ran = new Random(); //랜덤 객체
		
		for(int i=0; set.size()<6; i++) { //set의 크기가 6개가 될때까지 반복 -> 항상 6개의 숫자!
			set.add(ran.nextInt(45) + 1);//1~45 사이의 수 만들기
		}
		
		System.out.println(set); //Set이 알아서 중복을 제거해준다
		
		System.out.println("-------------------");
		
		//Set -> List
		//생성자의 매개변수 사용!
		List list = new ArrayList(set);
		System.out.println(list);
		
		//Set -> 배열
		Object[] arr = set.toArray();
		System.out.println( Arrays.toString(arr));
	}
}
