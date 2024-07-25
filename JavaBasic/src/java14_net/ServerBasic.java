package java14_net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerBasic {
	public static void main(String[] args) {
		System.out.println("서버");
		
		//서버 리슨 소켓
		ServerSocket servSock = null;
		
		//서버 통신 소켓
		Socket sock = null;
		
		//소켓 입력 스트림
		BufferedReader in = null;
		
		
		
		//서버 포트 번호
		final int PORT = 10001;
		
		try {
			servSock = new ServerSocket(PORT); 
			System.out.println("+ + + 서버 리슨 소켓 생성 + + +");
			
			System.out.println();
			System.out.println("--- Listening ---");
			System.out.println("--- 클라이언트 접속 대기중 ---");
			System.out.println("Listen Port : " + servSock.getLocalPort());
			System.out.println("------------------------------");
			
			
//			while(true) {
			//클라이언트가 접속하면 통신용 소켓(sock)을 반환한다
			sock = servSock.accept(); //리슨 시작
			
			//포트가 열렸고, 최초 실행시 윈도우에서 보안 경고가 뜬다
			//--- BLOCKED 상태 ---
			// -> 프로그램이 실행 도중 일시 정지된 상태
			// -> 주로, 사용자나 외부 기기 등의 입력을 기다리는 상태
			
			//서버가 이미 켜져 있는 상태에서 서버를 다시켜면
			//BindException 예외가 발생한다.
			//서버가 안켜져 있는 상태에서 클라이언트를 켜면
			//ConnectException 에외가 발생한다.
			
			//클라이언트의 IP정보 얻기
			InetAddress ip = sock.getInetAddress();
			
			System.out.println(" >> 클라이언트 접속!");
			System.out.println(" >> IP : " + ip.getHostAddress());
			System.out.println(" >> Port : " + sock.getPort());
			
//			System.out.println(" >> Local IP : " + sock.getLocalAddress().getHostAddress());
//			System.out.println(" >> Local IP : " + sock.getLocalPort());
			System.out.println("------------------------------");
			
			//--- 데이터 통신 ------
//			sock.getInputStream();
//			sock.getOutputStream();
			
			//소켓으로부터 입력스트림을 얻어오기
			//메서드 입력후 Ctrl + Space 누르면 자동으로 Import한다.
			in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			
			String msg = null;
			
			msg = in.readLine();
			
			System.out.println("받은 메시지> " + msg);
//			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(servSock!=null)	servSock.close();
				
				if(in!=null)	in.close(); //입력은 소켓 닫기 전에 먼저 닫는다
				if(sock!= null)	sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
