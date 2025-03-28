package java10_collection.practice2;

public class Book {
	private String bNo;
	private int category;
	private String title;
	private String author;
	
	//constructor, toString 오버라이딩, getter and setter는 전부 단축키로 만들면 된다.	
	
	
	//constructor(매개변수 없는 생성자)
	//디폴트 생성자, ctrl + space
	public Book() {
		
	}
	//constructor(매개변수 있는 생성자)
	//매개변수 있는 생성자, alr + shift + s, o
	public Book(String bNo, int category, String title, String author) {
		super();
		this.bNo = bNo;
		this.category = category;
		this.title = title;
		this.author = author;//책에 대한 정보들을 생성한다.
	}

	//toString() 메소드 오버라이딩, alt + shift + s, s
	@Override
	public String toString() {
		return "Book [bNo=" + bNo + ", category=" + category + ", title=" + title + ", author=" + author + "]";
	}
	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		
//		return this.category + "\t" + this.title + "\t" + this.author;//책에 대해 저장된 값들을 반환하도록 오버라이딩 시전
//		return super.toString();
//	}
	
	
	//getters and setters 메소드 작성, alt + shift + s, r, alt + a, alt + r 
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


