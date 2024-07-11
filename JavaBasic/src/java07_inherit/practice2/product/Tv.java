package java07_inherit.practice2.product;

public class Tv extends Product{
//	private String model;
//	private int price;
//	상속후 getter,setter랑 같이 지워진다.	
	//constructor
	public Tv(String model, int price) {
		super(model, price); // 상속하면서 멤버변수 초기화도 미룸
	}
	//method
	@Override
	public void out() {
		System.out.println("TV");
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
