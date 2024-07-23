package java13_io.file;

import java.io.File;
import java.io.IOException;

public class FileEx_01 {
	public static void main(String[] args) {
		
		//class File
		// 파일 또는 디렉토리의 정보를 관리하는 클래스
		
		// 파일의 내용을 가지고 있는 건 아니다
		// 파일의 경로(디렉토리, Path)와 파일 이름을 저장하고 있다
		
		// 파일 입출력 스트림의 입출력 대상(장치)으로 지정할 수 있다
		//-----------------------------------------------------------
		
//		D:\workspace\JavaBasic\src\java13_io\file\FileEx_01.java
		
//		"D:\\workspace\\JavaBasic\\src\\java13_io\\file\\FileEx_01.java"
//		"D:/workspace/JavaBasic/src/java13_io/file/FileEx_01.java"
		
		//** 파일의 경로를 지정할 때 폴더를 나타내는 문자는 '/'가 편하다
		// "\\" - 역슬래시 2번
		// "/" - 슬래시 1번
		
		// -> 두 방법 모두 사용 가능
		//-----------------------------------------------------------
		
		//존재하지 않는 파일

//		File file1 = new File("D:\\filetest\\text.txt");
		File file1 = new File("D:/filetest/text.txt");
		
		System.out.println("File info : " + file1);
		
		System.out.println("length : " + file1.length());
		System.out.println("exists : " + file1.exists());
		
		//파일이 실재로 존재하지는 않지만, 존재하는 것 처럼 작동한다. 대신, file의 존재여부는 false로 뜬다.
		
		//-----------------------------------------------------------
		
		//존재하는 파일
		
		File file2 = new File("D:/filetest/file.txt");
		
		System.out.println("File info : " + file2);
		
		System.out.println("length : " + file2.length());
		System.out.println("exists : " + file2.exists());
		
		System.out.println("isDirectory : " + file2.isDirectory());
		System.out.println("isFile : " + file2.isFile());
		//-----------------------------------------------------------
		System.out.println("--------------------------");
		
		//디렉토리(Directory)
		File file3 = new File("D:/filetest/"); //directroy(folder) - 폴더와 파일을 구분하기 위해
		// 폴더를 표현할 때에는 뒤에 /를 붙이는 것을 권장한다.
		
		System.out.println("File info : " + file3);
		
		System.out.println("length : " + file3.length());
		System.out.println("exists : " + file3.exists()); // 0 바이트 파일로 간주
		
		System.out.println("isDirectory : " + file3.isDirectory());
		System.out.println("isFile : " + file3.isFile());
	
		//-----------------------------------------------------------
		System.out.println("--------------------------");
		
		File file4 = new File("D:/filetest/testFolder/");
		
		//MaKe DIRectory
		// 경로에 해당하는 폴더가 없으면 새롭게 생성한다
		file4.mkdir();
	
		System.out.println("--------------------------");
		
		File file5 = new File("D:/filetest/testFolder/test");
		
		try {
			//새로운 파일 생성
			file5.createNewFile(); // IOException이 throw 되어있다. 반드시 try~catch 적용!
		} catch (IOException e) {
			e.printStackTrace();
		}
		//참고로 자바에서는 엑셀 파일을 만드는 API가 존재한다.
	}
}
