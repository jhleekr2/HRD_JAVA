package java14_net;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.stream.Stream;

public class Quiz01_Echo_Client {
//	+ ECHO 프로그램 만들기
//	  ** echo : 메아리
//
//	  - 전송된 데이터를 그대로 다시 다시 돌려보내는 프로그램
//
//	  - Quiz01_Echo_Client
//	   키보드로 입력한 데이터를 서버로 전송한다
//
//	   서버로부터 돌아온 데이터를 모니터로 출력한다
//
//
//	  - Quiz01_Echo_Server
//	   클라이언트가 전달한 데이터를 다시 클라이언트로 출력한다
	public static void main(String[] args) {
		System.out.println("클라이언트");
		
		//클라이언트 접속, 통신용 소켓
		Socket sock = null;
		
		//소켓 입력 스트림
		BufferedReader in = null;
		
		//소켓 출력 스트림
		PrintWriter out = null;
		
		//접속할 서버의 포트 번호
		final int PORT = 10001;
		
		try {
			//소켓 객체를 생성하면서 서버로 접속한다
//			sock = new Socket("서버 IP 또는 서버 호스트", 서버포트번호);
			sock = new Socket("192.168.10.15", PORT);
			
			System.out.println("전송할 메시지를 입력하시오> ");
			
//			String msg = sc.nextLine();
			
			in = new BufferedReader( new InputStreamReader( System.in ) );
			String str = in.readLine(); // 새로운 키보드 입력방법(Scanner 대체)
			
			//--- 데이터 통신 ------
//			sock.getInputStream();
//			sock.getOutputStream();
			
			//소켓으로 내보내는 출력스트림 생성
			out = new PrintWriter(
					new BufferedOutputStream(
							sock.getOutputStream()), true); // autoflush
			out.println(str);
			
			//서버에서 돌아오는 소켓으로부터 입력스트림 얻어오기
			in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			str = in.readLine();
			System.out.println("돌려받은 메시지> " + str);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(out!=null)	out.close(); //출력은 소켓 닫기 전에 먼저 닫는다.
				if(in!=null)	in.close();
				if(sock!= null)	sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
