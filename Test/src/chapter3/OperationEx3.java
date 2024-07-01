package chapter3;

public class OperationEx3 {
	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10); // 논리곱에서 앞항이 거짓이면 뒷항 실행 안됨
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10); // 논리합에서 앞항이 참이면 뒷항 실행 안됨
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
//		논리곱 &&(And) - 둘다 참이어야 참
//		논리합 ||(or) - 둘중 하나만 참이면 참
	}
}
