package java14_net;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.CharBuffer;

public class Quiz02_Client {
//	 + File 전송 프로그램 만들기
//
//	  - Quiz02_Client
//		data.txt 파일 읽어서 서버로 전송
//
//	  - Quiz02_Server
//		전송받은 데이터를 receive.txt 파일로 저장
	
//	-------------------------
//	 class Ex04_Client
//	-------------------------
//	 - sock : Socket
//	 - out : PrintWriter
//	 - file : File
//	 - in : FileReader
//	-------------------------
//	1. sock 생성
//	2. in 생성
//	  파일 입력 스트림
//	3. out 생성
//	  네트워크 출력스트림
//	4. 파일 읽어서 보내기
//	  read(char[])
//	  write(char[], int, int)
//	5. close() 적절히
	
	public static void main(String[] args) {
		System.out.println("클라이언트");
		
		//클라이언트 접속, 통신용 소켓
		Socket sock = null;
		
		//소켓 출력 스트림
		PrintWriter out = null;
		
		//접속할 서버의 포트 번호
		final int PORT = 10001;
		
		File file = new File("./src/java14_net/", "data.txt");
		
//		//파일 입출력을 보조할 변수
//		byte[] buf = new byte[1024]; //입력 데이터 저장소(임시 저장소) - 크기는 32비트 - 1024, 64비트 - 4096 권장
//		int len = -1; //입력 데이터의 길이
//		
//		int total = 0; //총 입출력된 데이터의 길이(크기)		
		
		//파일 입력 스트림 객체 변수
		BufferedReader in = null;
		try {
			//소켓 객체를 생성하면서 서버로 접속한다
//			sock = new Socket("서버 IP 또는 서버 호스트", 서버포트번호);
			sock = new Socket("192.168.10.15", PORT);
			
			//--- 데이터 통신 ------
//			sock.getInputStream();
//			sock.getOutputStream();
			
			in = new BufferedReader( new FileReader( file ));
				
			//소켓으로 내보내는 출력스트림 생성
			out = new PrintWriter(
					new BufferedOutputStream(
							sock.getOutputStream()), true); // autoflush
			//파일 입력
			String str = null;
			while( ( str = in.readLine() ) != null) {
				out.println(str);
			}
				
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(out!=null)	out.close(); //출력은 소켓 닫기 전에 먼저 닫는다.
				if(sock!= null)	sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
