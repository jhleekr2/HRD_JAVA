package chapter6.cooperation;

public class Student {
	public String studentName;
	public int grade;
	public int money;
	
	public Student(String studentName, int money) {//학생 이름과 가진 돈을 매개변수로 갖는 생성자
//		super();
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {//버스탔을때 -> Bus 클래스 구현필요!
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {//지하철탔을때 -> Subway 클래스 구현필요!
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void takeTaxi(Taxi taxi) {//택시탔을때 -> Taxi 클래스 구현필요!
		taxi.take(10000);
		this.money -= 10000;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "원입니다.");
	}
}
