package java13_io.charStream;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CharFileCopy {
	
	// Quiz.
	// CharSource.txt -> CharDest.txt
	// 문자스트림(BufferedReader, PrintWriter) 복사
	
	//String타입 데이터를 이용한 처리
	//readline(), println(String) 사용
	//-------------------------------------------------------------
	public static void main(String[] args) {
		
		File src = new File("./src/java13_io/charStream/", "CharSource.txt"); //입력대상 파일
		File des = new File("./src/java13_io/charStream/", "CharDes.txt"); //출력대상 파일
		
		//입출력 스트림
		BufferedReader in = null;
		PrintWriter out = null;
		
		String str = null; //입력 문자열
		
		
		
		try {
			
			in = new BufferedReader( new FileReader( src ));
			
//			out = new PrintWriter(
//					new BufferedOutputStream(
//							new FileOutputStream(dest)), true);
			
			out = new PrintWriter( new BufferedWriter( new FileWriter(des) ), true);
			while( (str = in.readLine()) != null) {
				out.println(str);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}  finally {
			try {
				if(in!=null)	in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			out.close();
		}		
		
	}
}
// 이 부분은 따로 볼 필요가 있다. Quiz를 풀지 못한 것은 물론이고
// 풀이 적는것조차 완전하지 못했다.
// 이 방식의 파일 복사는 파일 끝부분에 개행이 무조건 들어간 형태로
// 복사되는 문제점이 있다.