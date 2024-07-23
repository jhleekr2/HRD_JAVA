package java13_io.file;

import java.io.File;

public class FileEx_03 {
	public static void main(String[] args) {
		//파일의 절대경로 지정 vs 상대경로 지정(난이도가 어렵지만, 중요하다)
//		
//		절대 경로 표현법(Absolute Path)
//		- 경로 표현의 기준점을 루트(root) 디렉토리로 설정하고 표현한다
//		- 루트 디렉토리로부터 파일까지의 모든 경로를 나타내는 방법이다
//		** 윈도우 OS는 루트디렉토리가 드라이브마다 존재한다
//		→ “드라이브문자:”\
//		** 리눅스, 맥OS는 루트디렉토리가 1개 존재한다
//		→ /
//		ex) “D:\\Test\\folder\\file.txt”
//		ex) “/directory/file.txt”
//
//		상대 경로 표현법(Relative Path)
//		- 프로그램이 실행된 위치(경로)를 기준으로 파일의 위치를 상대적으로 표현한다
//		**클래스 패스(Class Path)
//		→ 프로그램이 실행된 위치(경로)
//		→ 이클립스로 프로그램을 실행할 경우 프로젝트 폴더를 클래스 패스로 설정한다
//		** 프로그램에서는 절대 경로보다 상대 경로를 사용해야 한다
//		- 개발 환경과 실행 환경이 달라지면 절대 경로의 기준이 되는 위치가 달라질 수 있다
//		- 프로그램이 실행되는 환경을 고려해서 문제없이 동작되도록 해야 한다
//		- 프로그램의 내부(프로젝트의 내부)를 기준으로 파일의 경로를 상대적으로 지정하여 개발해야 한다
		
		//절대 경로 지정 - Absolute Path
//		File file1 = new File("D:\\workspace\\JavaBasic\\src\\java13_io\\file\\" + "Hello");
		File file1 = new File("D:/workspace/JavaBasic/src/java13_io/file/" + "Hello");
		
		System.out.println(file1.exists());
		
		System.out.println("---------------------");
		
		//상대 경로 지정 - Relative Path
		
		//상대경로의 기준점
		// == 클래스 패스(Class Path)
		// == 프로젝트 폴더
		// == D:/workspace/JavaBasic/
		
		File file2 = new File("src/java13_io/file/" + "Hello");
//		File file2 = new File("/src/java13_io/file/" + "Hello");
//		File file2 = new File("./src/java13_io/././././././file/" + "Hello"); // . 자기자신을 가리킴
//		File file2 = new File("../src/../java13_io/../../../file/" + "Hello"); // .. 부모 디렉토리를 가리킴
		// ././../../ 이런거는 중간에 적어도 된다.
		//상대경로에서 맨앞에 슬래시는 루트디렉토리를 표현하는 기호로서 역할한다.
		
//		경로 지정 특수 문자
//		- 경로를 표현할 때 사용하는 디렉토리를 지정하는 예약된 특수 문자들이다
//		.	→ 현재 디렉토리
//		..	→ 부모 다랙토리
//		/	→ 루트 디렉토리 (최상위 폴더)
//		** 상대경로의 제일 앞에 와야 루트 디렉토리로 사용된다
//		** 디렉토리들 사이에서 사용된 /는 폴더 구분 기호이다
//		- 프로그램이 실행된 위치, 작업중인 폴더를 기준으로 적용된다
//		ex) "D:/workspace/JavaBasic" 경로에서 작업중일 경우
//		-> "/test" - "D:/test"
//		-> "./" - "D:/workspace/JavaBasic"
//		-> "../" - "D:/workspace"
//		-> "../././../hi" - "D:/hi"
		
		System.out.println(file2.exists());

		//절대 경로 확인
		System.out.println(file2.getAbsolutePath());
	}
}
