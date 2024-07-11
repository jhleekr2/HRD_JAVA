package java07_inherit.practice2.product;

public class Computer extends Product{
//	private String model; //모델명
//	private int price; //가격
//	상속후 지워지며, getter, setter도 같이 지워진다.
	
	//constructor
	public Computer(String model, int price) {
		super(model, price);
	}
	//method
	@Override
	public void out() {
		System.out.println("Computer");
	}

	//getter and setter
//	public String getModel() {
//		return model;
//	}
//
//	public void setModel(String model) {
//		this.model = model;
//	}
//
//	public int getPrice() {
//		return price;
//	}
//
//	public void setPrice(int price) {
//		this.price = price;
//	}
	
	
}
