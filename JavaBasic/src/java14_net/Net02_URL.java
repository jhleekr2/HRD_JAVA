package java14_net;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

//	URL(Uniform Resource Locator)
//	- 인터넷 상의 정보(자원, Resource, 주로 파일)가 어디 있는지 표현하는 방법
//	- 규칙에 맞춰 작성하여 인터넷의 자원이 어디에 위치하는지 표현한다
//	- URL 형식
//	프로토콜://인터넷주소[:포트번호][/디렉토리][/파일이름]
//	ex)
//	https://docs.oracle.com/javase/8/docs/api/java/net/URL.html
//	
//	프로토콜
//	https
//	통신방식(서비스의 형식)
//	보안 WEB(웹) 통신을 표현한다
//	**프로젝트는 http로 끝난다. https를 도전해볼 수는 있지만, 기능개발이 훨씬 중요하다.
//	기능개발이 안될경우는 https 도전이 오히려 독이 될수 있다.
//	
//	인터넷주소
//	docs.oracle.com
//	서버의 위치
//	IP또는 HOST(도메인주소)를 이용하여 표현한다.
//	
//	포트번호
//	:443
//	서비스의 위치
//	컴퓨터(도메인주소)내에서 어떤 프로그램인지를 표현한다
//	생략되어 있음
//	
//	디렉토리 경로
//	/javase/8/docs/api/java/net/
//	서비스되는 프로그램이 인식하고 있는 자원의 디렉토리 경로
//	
//	파일 경로
//	URL.html
//	자원의 경로
//	
//	웹 어플리케이션
//	WebSocket 라이브러리(API)
//	이걸 이용해서 채팅 만듦

public class Net02_URL {
	public static void main(String[] args) {
		
		String urlStr = "https://docs.oracle.com/javase/8/docs/api/java/net/URL.html";
		
		URL url = null;
		
		InputStream is = null;
		FileOutputStream fos = null;
		
		
		try {
			url = new URL(urlStr);
			
			System.out.println( "Protocol : " + url.getProtocol() );
			System.out.println( "Host : " + url.getHost() );
			System.out.println( "Port : " + url.getPort() );
			System.out.println( "Path : " + url.getPath() );
			System.out.println( "File : " + url.getFile() );
			//URL 정보를 파싱(추출)하는 클래스
			
			System.out.println("--------------");
			
			URLConnection conn = url.openConnection();
			//URL 주소에 접속
			
			byte[] buf = new byte[1024];
			int len = -1;
			
			is = conn.getInputStream();
			fos = new FileOutputStream("./src/java14_net/URL.html");
			while( (len = is.read(buf)) != -1) {
				fos.write(buf, 0, len);
			}
			fos.flush();
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos!=null)	fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(is!=null)	is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
