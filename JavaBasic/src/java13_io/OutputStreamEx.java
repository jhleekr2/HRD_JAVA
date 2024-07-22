package java13_io;

import java.io.IOException;
import java.io.OutputStream;

	//입출력(I/O, Input/Output)
	//** 모든 입출력의 방향은 프로그램이 기준
	//간혹 개발중에 입출력을 개발자나 사용자 입장에서 생각하는 경우가 있어서 주의한다!
	//프로그램 안으로 들어오면 입력, 프로그램 밖으로 나가면 출력
	//- 프로그램이 입력장치(Input Device), 출력장치(Output Device)와 데이터를 송수신하는 것, 통신하는 것
	//
	//스트림(Stream)
	//- 데이터의 통로, 데이터의 흐름
	//- 입출력 장치와 프로그램 사이에서 데이터를 통신(교환)할 수 있도록 제공되는 SW장치
	//- 단방향이다
	//입력스트림 → 프로그램
	//프로그램 → 출력스트림
	//- FIFO 구조로 되어 있다.
	//- 기본적으로 바이트 단위로 통신한다
	//- 버퍼(Burffer)를 가지고 있다
	//** 버퍼(Buffer)
	//데이터 임시 저장소
	//두 장치 간의 처리 속도 차이를 개선하기 위해 사용된다.
	//
	//스트림의 분류 기준
	//1.입력 기능 구분
	//입력 스트림
	//출력 스트림
	//
	//2.연결 대상을 기준으로 구분
	//1차 스트림 : 입출력장치와 직접 연결되는 스트림
	//system.in → 키보드, system.out → 마우스
	//2차 스트림 : 1차스트림과 연결되어 추가(보조)기능을 제공하는 스트림
	//
	//3.전송 데이터 형태에 따른 구분
	//이진 데이터(Binary Data)
	//→ 바이트 단위로 데이터를 보관/처리한다
	//
	//문자 데이터(Character Data, text data);’
	//글자로 구성되어 있는 파일 - 텍스트 파일
	//대부분 글자가 깨지면 인코딩이 깨졌거나, 바이너리 파일을 텍스트처럼 열은 경우이다.
	//→ 인코딩마다 다름
	//→ 아스키 기반은 바이트 단위
	//→ 유니코드 기반은 2바이트 단위
	//바이트 스트림  :  바이트(1B)단위로 통신한다
	//문자 스트림 : 문자(char, 2B)단위로 통신한다
	//** 전용 프로그램(워드프로세서)으로만 열 수 있는 텍스트 파일(엑셀, 워드, 한글 파일) 등은
	//워드프로세서 자체 기능들을 바이너리로 담고 있으면서 텍스트 정보들을 Wrapper형태로 포장한
	//형태라 바이너리 파일이다.
	//
	//4.기능에 따른 구분
	//보조 스트림 : 직접 입출력하는 기능은 없지만 다른 스트림의 기능을 향상시킨다.

public class OutputStreamEx {
	public static void main(String[] args) {
		
		//OutputStream 클래스의 write 메소드
		//public abstract void write(int b) throws IOException
		//→ 1바이트씩 보낸다
		//
		//public void write(byte[] b) throws IOException
		//→ 묶음으로 보낸다(성능의 향상 위해)
		//
		//public void write(byte[] b, int off, int len) throws IOException //Checked Exception, 이것을 주로 사용한다.
		//→ b 배열의 off 인덱스부터 시작하여 len길이만큼 출력스트림으로 출력한다.
		//→ 출력 결과가 출력 장치로 전송되지 않고 출력 버퍼에 전송된다.
		//일반적으로 Throws가 걸려있는 예외들은 Checked Exception이다(Throws를 통한 경고성이 있기 때문에)
		//→ 반드시 try~catch 구문을 사용해야 한다.
		//
		//---------------------------------------------------------------------------------------- 
		//
		//public void flush() throws IOException
		//→ 출력 버퍼에 담긴 출력 데이터를 출력 장치로 내보낸다
		//→ 출력 버퍼 비우기
		
		//모니터 표준 출력 스트림 객체
		OutputStream os = System.out;
		
		try {
			
			//write()메소드는 출력스트림의 출력 버퍼로 데이터를 출력한다.
			os.write(97); //그러나, 모니터로 보낸 내용은 출력이 안된다. 이때는 아직 버퍼로만 전달된 상태임
			os.write(98);
			os.write(99);
			
			//flush()메소드는 출력 버퍼의 데이터를 출력 장치로 내보낸다.
			os.flush();
			
//			os.close(); //만일 여기서 스트림을 닫았다면 아래쪽의 "Apple" 코드가 동작하지 않았을 것이다.
			//따라서 close는 스트림의 사용이 다 끝난 후에 닫는 것이 바람직하다. 일반적으로는 예외상황을 고려하여
			//프로그램의 맨 마지막에 close 사용하는데, try~catch구문의 마지막 실행 코드인 finally에 적는 것이 가장 좋다.
		} catch (IOException e) {
			e.printStackTrace();
		}//os.write()에서 보낸 내용은 스트림을 닫거나(close), 버퍼를 비울때(flush) 했을 때 비로소 출력된다
		
		//-----------------------------------------------------------------------
		
		//출력 데이터 저장소
		byte[] buf = new byte[10];
		
		//출력할 데이터의 길이
		int len = 0;
		
		//출력할 데이터
		buf[len++] = 'A';
		buf[len++] = 'p';
		buf[len++] = 'p';
		buf[len++] = 'l';
		buf[len++] = 'e';
		buf[len++] = '\n';
		//getBytes()로 대체가능하다.
		
		try {
			//데이터 출력
			os.write(buf, 0, len); //아까와 달리 모니터로 보낸 내용이 출력이 되는데
			// 그 이유는 컴퓨터가 알아서 개행때문에 flush없이도 자동으로 출력을 시켜준것이다.
			// 하지만, 100퍼센트는 아니라서 반드시 flush를 해 줘야만 출력된다고 기억하자.
			
			//출력 버퍼 지우기
			os.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				//스트림 닫기
				if(os!=null)	os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//스트림 닫기 구문은 자주 쓰이므로 공식처럼 외우고, 최대한 자동완성을 활용할 생각을 하자.
		
		
	}
}
