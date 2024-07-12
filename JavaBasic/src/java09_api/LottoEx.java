package java09_api;

import java.util.Arrays;

public class LottoEx {
	public static void main(String[] args) {
		
		//로또 번호 배열
		int[] lotto = new int[6];
		
		Lotto l = new Lotto();
		l.makeLotto( lotto );
		
//		for(int i=0;i<lotto.length;i++) {
//			System.out.print(lotto[i] + " ");
//		}
		
		System.out.println( Arrays.toString(lotto) );
		
		System.out.println("----------------------");
		
		int[][] lotto2 = new int[5][6];//(int 6개씩 5묶음)
//		
		l.makeLotto2(lotto2);
//		l.makeLotto( lotto2[0]);
//		l.makeLotto( lotto2[1]);
//		l.makeLotto( lotto2[2]);
//		l.makeLotto( lotto2[3]);
//		l.makeLotto( lotto2[4]);
		
		for(int[] game : lotto2 ) {
			System.out.println( Arrays.toString( game));
		}
		
	}
}
