package java06_class.method;

//** 실행클래스의 이름에 Ex를 붙이는 경우가 많다
// (Executor, 실행기)
//-> 메인이 있는 경우가 많다.

public class MethodEx {
	public static void main(String[] args) {
		
		// 객체 생성
		Method_01 m01 = new Method_01();
		// 맨처음에 입력할때 주의해야 하며, 앞의 것과 뒤의 것은 똑같아야 한다.
		
		// 메소드 호출
		int result = m01.subtract(500, 600); // main의 지역변수 result
//		int result = -100;
		// 도움말에서 콜론(:) 이하는 메소드 리턴 후의 데이터 타입을 말해준다.
		System.out.println("뺄셈 결과 : " + result);
		
		System.out.println("---------------------");
		
		int n1 = 404;
		int n2 = 303;
		
		System.out.println("빼기 : " + m01.subtract(n1, n2));
	}
}
