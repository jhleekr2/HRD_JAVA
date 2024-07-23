package java13_io.file;

import java.io.File;

public class FileEx_02 {
	public static void main(String[] args) {
		
		//class File의 생성자
		
//		public File(File parent, String child)
//	    public File(String parent, String child)
	    // -> parent 매개변수는 디렉토리(directory)를 나타낸다
	    // -> child 매개변수는 파일 이름(filename)을 나타낸다
	    
//	    public File(String pathname)
	    // -> 디렉토리(directory) + 파일명(filename)을 한번에 나타낸다
		
		//------------------------------------------------------------
		
//		File file1 = new File("D:/workspace/JavaBasic/src/java13_io/file/"
//				+ "FileEx_02.java");
		File file1 = new File("D:/workspace/JavaBasic/src/java13_io/file/"
				+ "Hello");
		
		System.out.println("length : " + file1.length());
		System.out.println("exists : " + file1.exists());
		
		System.out.println("isDirectory : " + file1.isDirectory());
		System.out.println("isFile : " + file1.isFile());
	}
	
}
