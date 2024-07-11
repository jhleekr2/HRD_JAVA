package java07_inherit.practice2.product;

public class Product {

	protected String model;
	protected int price;
	// 상속할때는 private가 protected로 바뀐다.
	//constructor
	public Product(String model, int price) {
//		super();
		this.model = model;
		this.price = price;
	}

	public Product() {
		
	}

	//method
	public void out() {//기능은 없지만, 연결하기 위한 코드
		
	}

	//getter and setter
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
