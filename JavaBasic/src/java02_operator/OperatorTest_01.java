package java02_operator;

public class OperatorTest_01 {
	public static void main(String[] args) {
		
		int a = 5, b = 6, c = 10, d;
		
		d = ++a * b--;
		
		System.out.println("a=" + a + ", b=" + b + ", d=" + d);
		//d = 36, a=6, b=5
		
		d = a++ + ++c - b--;
		
		System.out.println("a=" + a + ", b=" + b + ", c=" + c + ", d=" + d);
		//d = 12 a = 7  b = 4 c = 11
	}
}












