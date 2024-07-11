package java07_inherit.practice.model;

public class Rectangle extends Point {
	
	private int width; // 멤버번수 선언(가로너비)
	private int height; //(세로높이)
	//너비(width), 높이(height) 용어는 프론트엔드 할때 빈번하게 사용될 예정이다.
	
	//constructor
	public Rectangle() {
		super();
	}
	
	public Rectangle(int x, int y, int width, int height) {
		super(x,y); //(x,y) 좌표는 부모 클래스의 생성자로 넘김
		setWidth(width);
		setHeight(height);
	}

	//getter, setter 구현
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	// 어느정도 자기가 개발할 내용을 구상하고 난 다음 constructor(생성자), getter, setter를 전부
	// 자동완성 때려버리면 개발에 상당한 시간을 절약할 수 있다.
	
	@Override
	public void draw() {
		System.out.print("사각형의 x, y 좌표(좌측상단) : ");
		super.draw(); // 부모 메소드 결과 이용해서 사각형의 좌측상단 좌표 호출
		double area = width * height; // 사각형의 넓이 계산
		double length = 2 * (width + height); // 사각형의 둘레 계산
		System.out.println("사각형의 넓이 : " + String.format("%.1f", area));
		System.out.println("사각형의 둘레 : " + String.format("%.1f", length));
		//따로 변수 지정 안하려면 형변환에 대해 고려해야 한다.
		//length 자리에 (double)2 * (width + height) 이런 식으로 넣어야 한다.
	}
	
	// 서로의 유사한 관계와 구조를 확인하였다면, 개발 시간이 상당히 단축되었을 것이다.
	// 앞으로 새로운 도형을 더 만든다면 그냥 rectangle 기반으로 복사해서 붙여넣기 하고 조금만 고쳐쓰면 된다.
	// 이렇게 함으로써, 코드의 재사용성이 극적으로 올라가고 분업도 가능해진다.
	// 회사에서 개발할 때 재사용성에 대해 이해하고 있다는 것을 증명!
	// 분업에 대한 것을 보기 위해 실제 회사에서 국비수업 프로젝트를 필수로 요구하고 있다!
}
