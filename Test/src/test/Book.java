package test;

public class Book {
	private String bNo;
	private int category;
	private String title;
	private String author;
	
	//constructor(매개변수 없는 생성자)
	public Book() {
		
	}
	//constructor(매개변수 있는 생성자)
	
	public Book(String bNo, int category, String title, String author) {
		super();
		this.bNo = bNo;
		this.category = category;
		this.title = title;
		this.author = author;//책에 대한 정보들을 생성한다.
	}

	//toString() 오버라이딩
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return this.category + "\t" + this.title + "\t" + this.author;//책에 대해 저장된 값들을 반환하도록 오버라이딩 시전
//		return super.toString();
	}
	
	//getters and setters 작성
	public String getbNo() {
		return bNo;
	}

	public void setbNo(String bNo) {
		this.bNo = bNo;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
}
