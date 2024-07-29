package chapter15.stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("./src/chapter15/stream/inputstream/input.txt");
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				if(fis!=null)	fis.close();
			} catch (IOException e) {
				System.out.println(e);
			} catch (NullPointerException e) {
				System.out.println(e);
			}
		}
		System.out.println("end");
	}
}
