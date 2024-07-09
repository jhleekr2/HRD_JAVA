package java06_class.overloading;

public class OverloadingEx {
	public static void main(String[] args) {
		
		Overloading ol = new Overloading();
	
		System.out.println("--- display() call ---");
		
		ol.display();
		
		//QUIZ.
		// ol.display();를 호출하면 ( 44, 55 ) 가 출력되도록 조절해보자!
		
		ol.setX(44);
		ol.setY(55);
		
		ol.display();
		
		System.out.println("----------------------");
		
		ol.display(555, 666); // 이클립스 자동완성 하면 자동완성 직후에 매개변수를 편하게 넣을
		// 수 있도록 편의기능을 제공하며, 이때 Enter누르면 편의기능을 더이상 사용할 수 없다.
		//일단 편의기능 사용이 종료된 후에는 지운 다음 다시 자동완성 시도해봐야 한다.
	}
}
