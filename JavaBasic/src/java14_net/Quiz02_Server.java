package java14_net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Quiz02_Server {
//	 + File 전송 프로그램 만들기
//
//	  - Quiz02_Client
//		data.txt 파일 읽어서 서버로 전송
//
//	  - Quiz02_Server
//		전송받은 데이터를 receive.txt 파일로 저장
	
//	-------------------------
//	 class Ex04_Server
//	-------------------------
//	 - serv : ServerSocket
//	 - sock : Socket
//	 - in : BufferedReader
//	 - file : File
//	 - out : FileWriter
//	-------------------------
//	1. serv 생성
//	2. Listen 및 sock 생성
//	3. Remote 정보 출력
//	  IP정보 : InetAddress
//	  Port정보 : sock
//	4. in 생성
//	  네트워크 입력스트림
//	5. out 생성
//	  파일 출력 스트림
//	6. 파일 받아서 저장
//	  read(char[])
//	  write(char[], int, int)
//	7. close() 적절히
//
//	** 추가사항 : 2부터 반복
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
		
		File file = new File("./src/java14_net/", "receive.txt");
		
		//파일 입출력을 보조할 변수
		byte[] buf = new byte[1024]; //입력 데이터 저장소(임시 저장소) - 크기는 32비트 - 1024, 64비트 - 4096 권장
		int len = -1; //입력 데이터의 길이
		
		int total = 0; //총 입출력된 데이터의 길이(크기)		
		
		//파일 출력 스트림 객체 변수
		PrintWriter out = null;
		
		
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
			
			out = new PrintWriter( new BufferedWriter( new FileWriter(file) ), true);
			String str = null;
			while( (str = in.readLine()) != null) {
				out.println(str);
			}
			
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
