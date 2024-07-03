package java04_control.loop;

public class LabeledBreak {
	public static void main(String[] args) {
		
		//레이블 브레이크(Labeled Break)
		//레이블 컨티뉴(Labeled Continue)
		//가급적 사용하지 않는것을 강력히 권장한다.(프로그램의 자연스러운 흐름 방해하기 때문)
		Apple:
		for(int i=0; i<5; i++) {
			
			Banana:
			for(int j=0; j<5; j++) {
				
				if( j>=2 ) {
//					break;
//					break Banana;
					break Apple; // 바깥쪽 for문이 중단
				}
				
				System.out.println("i:" + i + ", j:" + j);
			}
		}
	}
}
