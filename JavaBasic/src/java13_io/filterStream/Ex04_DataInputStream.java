package java13_io.filterStream;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex04_DataInputStream {
	public static void main(String[] args) {
		//입력 파일 객체
		File file = new File("./src/java13_io/filterStream/", "DataTest.txt");
		
		//데이터 입력 스트림
		DataInputStream dis = null;
		
		try {
			dis = new DataInputStream(
					new BufferedInputStream (
						new FileInputStream(file) ) );
			
			boolean bData = dis.readBoolean();
			int iData = dis.readInt();
			char cData = dis.readChar();
			
			System.out.println("boolean : " + bData);
			System.out.println("int : " + iData);
			System.out.println("char : " + cData);
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(dis!=null)	dis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
				

	}
}
