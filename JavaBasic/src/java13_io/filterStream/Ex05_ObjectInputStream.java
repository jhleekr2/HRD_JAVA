package java13_io.filterStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Ex05_ObjectInputStream {
	public static void main(String[] args) {
		
		//입력 파일 객체
		File file = new File("./src/java13_io/filterStream/", "ObjectTest.ser");
		
		//객체 입력 스트림
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(
					new BufferedInputStream(
							new FileInputStream(file)));
			
			Point p1 = (Point) ois.readObject(); //역직렬화
			Point p2 = (Point) ois.readObject(); //역직렬화
			Point p3 = (Point) ois.readObject(); //역직렬화
			
			System.out.println("p1 : " + p1);
			System.out.println("p2 : " + p2);
			System.out.println("p3 : " + p3);
			
			//---------------------------------------------------------------
			
			ArrayList<Point> list = (ArrayList<Point>) ois.readObject();
			// 형변환이 필요 - 안하면 오류남!
			
			System.out.println( list );
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) { //역직렬화할때 생기는 문제
			e.printStackTrace();
		} finally {
			try {
				if(ois!=null)	ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//어느정도 코드가 정형화, 패턴화 되어있는데, 이부분을 AI 플러그인이 자동화해준다.
		//면접이나 연봉협상에서는 AI플러그인을 자랑해도 되지만, 그 이외의 자리에서는 AI플러그인을 자랑하지말자.
		//안그러면, 회사에서 좋지않게 보거나, 해야할 일이 늘어날 것이다.
	}
}
