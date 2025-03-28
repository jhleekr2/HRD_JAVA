package java02_operator;

public class OperatorTest_02 {
	public static void main(String[] args) {

		int a = 5, b = 6, c = 10;

		boolean res1;
		res1 =  a<b || --a>c++;
		System.out.println("a=" + a + ", b=" + b + ", c=" + c);
		// true || 4>6 -> 뒤쪽은 동작을 안한다.
//		a = 5 b = 6 c = 10
		
		boolean res2;
		res2 = c<b++ && c-->++a;
		System.out.println("a=" + a + ", b=" + b + ", c=" + c);
		// 10<6++ && 10 -> false && 10-->++5 -> 뒤쪽은 동작을 안한다.
//		c = 10 b = 7 false 이므로 뒤는 계산 안함.a  =5
		//** 논리연산의 단축수행
		
		// OR연산은 왼쪽 피연산자가 true라면 오른쪽항 연산을 수행하지 않는다.
		// AND연산은 왼쪽 피연산자가 false라면 오른쪽항 연산을 수행하지 않는다.
	}

}















