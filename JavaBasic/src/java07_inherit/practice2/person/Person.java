package java07_inherit.practice2.person;

import java07_inherit.practice2.product.Product;

public class Person {
	private String name;
	private int money;
	private Product prod = new Product(); //prod는 
	
	//constructor
	public Person(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}
	
	//method
	
	//진행상황을 출력한다
//	public void buy(Product prod) {
//		System.out.println(prod.getModel() + "을 구매하려 합니다.");
//		System.out.println("가격은 " + prod.getPrice() + "원입니다.");
//		if( (money - prod.getPrice() >= 0 )) {
//			System.out.println(this.name + "님이 " + prod.getPrice() + "원을 지불하고 " + prod.getModel() + " 구매함");
//			money = money - prod.getPrice();
//			//money -= prod.getPrice();
//		}
//		else {
//			System.out.println("잔액이 부족합니다.");
//		}
//		System.out.println("[잔액] " + this.money + "원");
//	} // 정상 코드조건을 검사하는 방식의 프로그래밍은 좋지 않다.
	
	
	public void buy(Product prod) {
		
//		if( 예외적인 흐름 ) {
//			return; //메소드 중단 코드
//		}
		
	//------------------------------------------------------
		//buy메소드에 물건(prod)이 전달되지 않았을 때 (null 전달값)
		if( prod == null ) {//이런경우는 우선적으로 예외처리 해야한다. 안그러면 프로그램이 튕긴다.
			System.out.println("[SYSTEM] 수행할 수 없는 작업입니다.");
			
			return;
		}
		
		if( money < prod.getPrice() ) {//가격이 모자랄 때
			System.out.println("[SYSTEM] 잔액이 부족합니다");
			System.out.println("[잔액]" + money + "원");
		
			return; //메소드 중단 코드
		}
		
		//return - 메소드를 중단하는 역할을 한다.
		
		//전달인자로 받은 Product를
		//멤버필드에 저장하고
		this.prod = prod;

		//물건가격만큼 money를 차감한다
		money-= prod.getPrice();
		
		System.out.println(this.name + "님이 " + prod.getPrice() + "원을 지불하고 " + prod.getModel() + " 구매함");
		System.out.println("[잔액] " + money + "원");
	}
	
	
	
	
	
	//getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	

}
