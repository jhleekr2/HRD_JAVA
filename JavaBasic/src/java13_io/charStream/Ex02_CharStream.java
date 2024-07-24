package java13_io.charStream;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Ex02_CharStream {
	public static void main(String[] args) {
		
		//BufferedReader
		//PrintWriter(사용), BufferedWriter(보조)
		//---------------------------------------------------------------
		
		BufferedReader in = new BufferedReader(
				new InputStreamReader( System.in ));
		
//		PrintWriter out = new PrintWriter(
//				new BufferedWriter(
//						new OutputStreamWriter( System.out )));

		PrintWriter out = new PrintWriter(
				new BufferedOutputStream( System.out ), true   /*PrintWriter영역(boolean autoFlush)*/);
				
		//** PrintWriter의 생성자에 두 번째 인자로 autoFlush를 설정할 수 있다
		// true로 설정할 경우 활성화
		
		//-> print(), println(), printf() 메소드를 이용하여 출력하면
		//자동 flush()한다.
		
		//-> '\n' 또는 개행처리가 될 때에도 자동 flush()한다.
		
		//Sysout이 PrintWriter와 관련있어서 Sysout이 자동 flush
		
		//---------------------------------------------------------------
	
		//** 사용할 메소드
		
//		in.readLine() : String
		
//		out.println(String) : void
		
		//---------------------------------------------------------------
		
		//입력받은 문자열
		String str = null;
		
		try {
			//입력받은 문자열이 남아 있으면 반복
			while ((str = in.readLine()) != null) {
			out.println(str);
//			out.flush(); //생략 가능, Auto flush
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(in!=null)	in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			if(out!=null)	out.close(); 
		}
	}
}
