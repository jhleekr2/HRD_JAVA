package chapter6.cooperation;

public class Taxi {
	int passengerCount;
	int money;
	
	public Taxi() {
	}
	
	public void take(int money) {
		this.money += 10000;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("택시의 승객은 " + passengerCount + "명이며, 수입은 "
		+  money + "원 입니다.");
	
	}
}
