package java13_io.filterStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04_DataOutputStream {
	public static void main(String[] args) {
		
		//출력 파일 객체
		File file = new File("./src/java13_io/filterStream/", "DataTest.txt");
		
		//데이터 출력 스트림 객체
		DataOutputStream dos = null;
		
		//Program -> DataOutputStream -> BufferedOutputStream -> FileOutputStream
		try {
			dos = new DataOutputStream(
					new BufferedOutputStream(
						new FileOutputStream(file) ) );
			
			//OutputStream의 기본 출력 메소드
//			dos.write( 65 );
//			dos.write( 'B' );
//			
//			dos.write( "Cherry".getBytes() );
			//정수 -> 숫자 -> 아스키 코드 -> 파일에 기록
			
			//DataOutpuyStream의 자료형 유지 출력 메소드
			dos.writeBoolean(true); //1B
			dos.writeInt(123); //4B
			dos.writeChar('가'); //2BB
			//컴퓨터의 비트를 그대로 바이너리 형식으로 파일에 기록한다. -> 파일에서는 깨진다
			//출력 버퍼 지우기
			dos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(dos!=null)	dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}
}
