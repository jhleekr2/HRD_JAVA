package java04_control.star;

public class Star_07 {
	public static void main(String[] args) {
		for(int i=5; i>0; i--) { // i행
			for(int j=0; j<5; j++) { //j열
				System.out.print(i+j);
			}
		System.out.println();
		}
	}
}

// i의 값이 점점 줄어들기 때문에, 이 부분에 맞게 조건식을 변형하는것이 포인트!