package java09_api;

public class RSPDetermine {
	
	//게임 호출 루틴
	public static void play(int user) {
	int com = (int)((Math.random() * 3) + 1); // 1~3 랜덤값 만들어서 컴퓨터에 입력
	
	if( com == RSP.SCISSORS && user == RSP.ROCK ) {
		System.out.println("user(바위) 승");
		}
	else if( com == RSP.ROCK && user == RSP.PAPER ) {
		System.out.println("user(보) 승");
		}
	else if( com == RSP.PAPER && user == RSP.SCISSORS) {
		System.out.println("user(가위) 승");
		} //사용자가 이기는 경우
	if( com == RSP.SCISSORS && user == RSP.PAPER) {
		System.out.println("com(가위) 승");
		}
	else if( com == RSP.ROCK && user == RSP.SCISSORS) {
		System.out.println("com(바위) 승");
		}
	else if( com == RSP.PAPER && user == RSP.ROCK) {
		System.out.println("com(보) 승");
		} //컴퓨터가 이기는 경우
	else if( com == user) {
		System.out.println("무승부");
		} //무승부
	}
	
}
