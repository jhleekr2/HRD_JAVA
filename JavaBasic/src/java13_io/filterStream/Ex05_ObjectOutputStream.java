package java13_io.filterStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ex05_ObjectOutputStream {
	public static void main(String[] args) {
		
//		직렬화(Serialization)
//		- 크기가 큰 데이터(객체)를 바이트단위로 잘게 나누어서 스트림을 통과할 수 있도록 직렬(일렬)로 배치하는 것

//		역직렬화(Deserialization)
//		- 바이트 단위로 잘게 나누어져(직렬화되어) 스트림을 통과한 데이터를 원본의 형태(객체)로 다시 합치는 것
		
		
		//출력 파일 객체
		File file = new File("./src/java13_io/filterStream/", "ObjectTest.ser");
		
		//객체 출력 스트림
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(
					new BufferedOutputStream(
							new FileOutputStream(file)));
			
			//출력에 사용할 데이터 객체
			Point p1 = new Point(11,22);
			Point p2 = new Point(111,222);
			Point p3 = new Point(1111,2222);
			
			//객체 출력
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);
			
			//--------------------------------------------------
			
			ArrayList<Point> list = new ArrayList<>();
			
			list.add(new Point(55,66));
			list.add(new Point(66,77));
			//list를 한번에 관리한다.
			oos.writeObject(list);
			
			//--------------------------------------------------
			
			//버퍼 비우기
			oos.flush();
			
			//Point 클래스에 implements Serializable을 추가해야 한다.
			
			//직렬화 결과물 저장파일은 일반적으로 ser확장자를 사용한다(데이터의 차이는 없음)
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos!=null)	oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
