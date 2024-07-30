package chapter15.stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {
	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("./src/chapter15/stream/outputstream/output3.txt")) {
//		try(FileOutputStream fos = new FileOutputStream("output3.txt")) { // 이러면 Java 프로젝트 루트 폴더에 파일 생성
			byte[] bs = new byte[26];
			byte data = 65;
			for(int i = 0; i < bs.length ; i++) {
				bs[i] = data;
				data++;
			}
		fos.write(bs, 2, 10);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
		
	}
}
