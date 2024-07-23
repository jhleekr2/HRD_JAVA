package java13_io.fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	// Quiz
	
	// Source.txt파일 내용을 읽어들여 Destination.txt파일로 저장
	// -> 파일 복사
	
	// 49,520,698 bytes(49MB)
	
	// Source.txt --> FileCopy --> Destination.txt
	
	public static void main(String[] args) {
		File src = new File("./src/java13_io/fileStream/", "Source.txt"); //입력대상 파일
		System.out.println("[TEST] source exists : " + src.exists());
		
		File des = new File("./src/java13_io/fileStream/", "Destination.txt"); //출력대상 파일
		
		//파일 입출력을 보조할 변수
		byte[] buf = new byte[1024]; //입력 데이터 저장소(임시 저장소) - 크기는 32비트 - 1024, 64비트 - 4096 권장
		int len = -1; //입력 데이터의 길이
		
		int total = 0; //총 입출력된 데이터의 길이(크기)
		
		//파일 입력 스트림 객체 변수
		FileInputStream fis = null;
		//파일 출력 스트림 객체 변수
		FileOutputStream fos = null;

		
//		try ( FileInputStream fis = new FileInputStream(src);
//			FileOutputStream fos = new FileOutputStream(des);) {} 코드도 가능하다.
		
		//ByteArrayInput(Output)Stread상수가 있다
		
		try {
			//파일 입력 스트림 생성
			fis = new FileInputStream(src);
			//파일 출력 스트림 생성
			fos = new FileOutputStream(des);
			
			//읽어들일 데이터가 존재하면 반복 처리한다
			
			//-----------------------------------------------------
			
			//동작 흐름 파악
//			while( fis에서 끝까지(EOF까지) read ) {
//				입력받은 데이터를 fos로 write
//			}
			
			//-----------------------------------------------------
			
			// 입력 기능
//			fis.read(buf); //한번에 버퍼 크기만큼(1024바이트)씩 입력받기
			
			// 출력 기능
//			fos.write(buf, 0, len); // 입력받은 만큼 출력하기
			
			//-----------------------------------------------------

			//파일입력스트림(fis)에서 더이상 읽어들일 데이터가 없을때까지 반복
			// -> Source.txt 파일의 오프셋(offset)이 파일의 끝에 도달할 때
			// -> End Of Stream에 도달할 때
			// -> EOF
			
			//파일을 읽고 있는 위치(Byte 단위) - offset이라 부른다
			
			//Source.txt 파일을 처음부터 끝까지 읽으면서 반복하기
//			while( true ) {
//				len = fis.read(buf); //한번에 1024바이트씩 입력받기
				
				//End Of Stream
//				if( len == -1 ) {
//					break;
//				}
				//진행상황을 콘솔(모니터)에 출력하기
//				System.out.print( new String(buf, 0, len));
				
				//파일 출력
//				fos.write(buf, 0, len);
				
				//읽어들인 전체 길이
//				total += len;
//			}
			//-----------------------------------------------------
			
//			System.out.println("읽어들인 총 데이터 : " + total + " Bytes ");
			
			while( ( len = fis.read(buf) ) != -1 ) {
				//입력 받은 데이터를 출력한다(출력 파일에)
				fos.write( buf, 0, len );
				
				total += len;

				//출력 버퍼 지우기
				fos.flush();
			}
			
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			
			System.err.println("[SYSTEM] 파일이 존재하지 않습니다");
		} catch (IOException e) {
//			e.printStackTrace();
			
			System.err.println("[SYSTEM] 파일 입출력에 문제가 발생했습니다");
		} finally {
			
			try {
				//input 스트림 닫기
				if(fis!=null)	fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				//output 스트림 닫기
				if(fos!=null)	fos.close();
			} catch (IOException e) {
				e.printStackTrace();
				}
			
		}// try end
		
		System.out.println("읽어들인 총 데이터 : " + total + " Bytes ");
		System.out.println("[TEST] destionation exists : " + des.exists());
		
	}
}
