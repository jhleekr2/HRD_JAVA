package java14_net;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientBasic {
	public static void main(String[] args) {
		System.out.println("클라이언트");
		
		//클라이언트 접속, 통신용 소켓
		Socket sock = null;
		
		//소켓 출력 스트림
		PrintWriter out = null;
		
		//접속할 서버의 포트 번호
		final int PORT = 10001;
		
		try {
			//소켓 객체를 생성하면서 서버로 접속한다
//			sock = new Socket("서버 IP 또는 서버 호스트", 서버포트번호);
			sock = new Socket("192.168.10.15", PORT);
			
			//--- 데이터 통신 ------
//			sock.getInputStream();
//			sock.getOutputStream();
			
			//소켓으로 내보내는 출력스트림 생성
			out = new PrintWriter(
					new BufferedOutputStream(
							sock.getOutputStream()), true); // autoflush
			
			out.println("하이!");
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
