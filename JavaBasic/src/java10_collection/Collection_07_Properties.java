package java10_collection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Collection_07_Properties {
	public static void main(String[] args) {
		
		//Properties 객체 생성
		Properties prop = new Properties();
		
		// .put(), .get() 메소드를 이용하면 Properties의 고유한 특성을
		//무시하고 Map의 기능을 사용한 것 -> 호출은 가능하지만 가급적 사용하지 않는다!
//		prop.put(true, 345235);
		
		//에러, value가 String 타입이 아니다
//		prop.setProperty("A", 100);
		
		//.setProperty(), getProperty() 메소드를 이용하여 문자열타입의 key=value쌍을 관리한다
		prop.setProperty("A", "100");
		System.out.println( prop.getProperty("A") );
		
		prop.setProperty("username", "Alice");
		prop.setProperty("password", "Ali123");
		prop.setProperty("test", "data");
		
		System.out.println( prop );
		
		System.out.println("-------------------------");
		
		//Properties 객체의 정보를 파일로 저장하기(단, xml방식이 좀더 표준에 가깝다.)
		
		//파일또한, 프로그램에서는 스트림을 이용한 장치로 인식한다.
		//파일에서는 스트림 입력, 스트림 출력의 두개의 스트림이 필요하다.
		
		//자바에는 기본적인 스트림은 따로 구현이 되어 있다.
		//InputStream, OutputStream 인터페이스로 구현되어 있다.
		
		//파일 출력 스트림 객체
		FileWriter writer = null;
		
		try {
//			writer = new FileWriter("D:\\workspace\\JavaBasic\\src\\java10_collection\\user.properties");
//			writer = new FileWriter("D:/workspace/JavaBasic/src/java10_collection/user.properties");
			writer = new FileWriter("./src/java10_collection/user.properties"); // 상대경로(다른환경에서도 에러 회피목적)
			// 자바에서는 역슬래시 두번대신 슬래시 한번써도 폴더로 인식한다.
			// 맥, 유닉스, 리눅스에서는 폴더 쓸때 윈도우의 (\) 대신 (/)를 쓴다.
			
			// 사실 프로그램 개발할 때는 절대경로 쓰면 안되고 상대경로를 써야 한다.
		
			prop.store(writer, "comment: User Information");
			
			//스트림 닫기 - 닫지않으면 시스템이 불안정해짐
			writer.close();
		} catch (IOException e) { //예외적 상황
			e.printStackTrace();
		}
		//디폴트 생성자가 없어서 그냥은 만들수 없다.
		//기본적으로는 Unhandled Exception 에러가 발생한다. 해결책으로 try-catch 사용!
		
		//실제 workspace폴더에는 있는데 이클립스에 안뜨는 파일이 있다-> workspace폴더에 가서 F5(새로고침)누른다.
		
		System.out.println("-----------------------");
		
		//파일 입력 스트림 객체
		FileReader reader = null;
		
		//파일로부터 입력받은 데이터를 저장할 Properties 객체
		Properties test = new Properties();
		try {
//			reader = new FileReader("D:/workspace/JavaBasic/src/java10_collection/user.properties");
			reader = new FileReader("/src/java10_collection/user.properties"); // 상대경로(다른환경에서도 에러 회피목적)
			
			System.out.println("입력받기 전 : " + test);
			
//			test.load(reader);//에러 - Unhandled exception 발생
			//이때 해결책은 이미 try-catch로 감쌌기 때문에 이때는 AddCatchClouse 선택한다.
			test.load(reader);
			System.out.println("입력받은 후 : " + test);
			
			//스트림 닫기
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); //-오류 메시지가 뜰때 STACK TRACE를 시행한다.
		}
		//에러창 뜰때 에러창에 커서 위치시키고 F2 눌러보자. 그러면 에러 해결책이 나온다(이는 마우스 대는거랑 같은 효과).
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//시스템 정보 Properties
		
		Properties sysProp = System.getProperties();
		
		System.out.println("--- 자바 버전 ---");
		System.out.println( sysProp.getProperty("java.version"));
		
		System.out.println("\n--- OS 이름 ---");
		System.out.println( sysProp.getProperty("os.name")); // 윈도우 11 환경에서는 Windows 11 출력
		
		System.out.println("\n--- 사용자 계정 ---");
		System.out.println( sysProp.getProperty("user.name"));
		
		System.out.println("\n--- sysProp ---");
		System.out.println(sysProp);
		
		
		
	}
}
