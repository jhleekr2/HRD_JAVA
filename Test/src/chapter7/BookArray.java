package chapter7;

public class BookArray {
	public static void main(String[] args) {
		Book[] library = new Book[5]; //Book 클래스형으로 객체 배열생성
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]); //이때는 인스턴스를 가리키는 주소값만 생성 -> null 출력
		}
	}
}
