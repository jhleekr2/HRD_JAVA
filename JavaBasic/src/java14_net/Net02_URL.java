package java14_net;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

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
