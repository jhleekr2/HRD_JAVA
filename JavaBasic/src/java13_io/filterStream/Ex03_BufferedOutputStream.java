package java13_io.filterStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03_BufferedOutputStream {
	public static void main(String[] args) {
		
		//출력 대상 파일
		File file = new File("./src/java13_io/filterStream/", "BufferedOut.txt");
		
		//출력 스트림 객체
		BufferedOutputStream bos = null;
		
		try {
			//File -> FileOutputStream -> BufferedOutputStream
//			bos = new BufferedOutputStream( new FileOutputStream(file, true) ); //추가 모드
//			bos = new BufferedOutputStream( new FileOutputStream(file), true ); //코드 잘못 적어서 오류 발생!
			// -> 이때 문법오류가 발생하면 다행이지만, 문법오류 없이 넘어가면 나중에 실행시 버그발생한다!
			bos = new BufferedOutputStream( new FileOutputStream(file) ); //쓰기 모드
			
			String data = "BananaApple";
			
			bos.write( data.getBytes(), 0, data.length() );
			bos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bos!=null)	bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
