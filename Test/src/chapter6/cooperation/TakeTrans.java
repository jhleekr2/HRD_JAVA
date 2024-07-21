package chapter6.cooperation;

public class TakeTrans {
	public static void main(String[] args) {
		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);
		Student Edward = new Student("Edward", 20000);
	
		Bus bus100 = new Bus(100); // 노선번호 100번 버스 생성
		studentJames.takeBus(bus100); //james가 100번 버스 탑승
		studentJames.showInfo(); //james의 정보 출력
		bus100.showInfo(); //버스의 정보 출력
		
		Subway line2 = new Subway("2호선"); // 2호선 지하철 생성
		studentTomas.takeSubway(line2);//tomas가 2호선 탑승
		studentTomas.showInfo(); //tomas의 정보 출력
		line2.showInfo(); //지하철의 정보 출력
		
		Taxi taxi1 = new Taxi(); //택시 생성
		Edward.takeTaxi(taxi1);//Edward가 taxi1 택시 탑승
		Edward.showInfo(); //edward의 정보 출력
		taxi1.showInfo(); //택시의 정보 출력
	}
}
