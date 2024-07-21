package chapter6.cooperation;

public class Subway {
	String lineNumber;
	int passengerCount;
	int money;
	
	public Subway(String lineNumber) { //지하철 노선번호를 매개변수로 받음
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += 1500;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("지하철 " + lineNumber + "의 승객은 " + passengerCount + "명이며, 수입은 "
		+  money + "원 입니다.");
	}
}
