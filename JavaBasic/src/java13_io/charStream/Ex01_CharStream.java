package java13_io.charStream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Ex01_CharStream {
	public static void main(String[] args) {
		
		//문자 스트림(Character Stream)
		// -> 문자 단위로 통신하는 스트림
		// -> ASCII, Unicode 두 문자 체계 모두 인식해서 문자로 처리한다
		
		//기본 스트림은 InputStream, OutputStream (바이트 스트림)이다
		//문자 스트림은 바이트 스트림을 변환해서 사용한다
		
		// InputStreamReader : InputStream -> Reader 변환
		// OutputStreamWriter : OutputStream -> Writer 변환
		
		//--------------------------------------------------------------------
		
		//문자스트림을 이용하여 키보드의 입력을 모니터(콘솔)로 출력하기
		
		Reader reader = new InputStreamReader( System.in );
		Writer writer = new OutputStreamWriter( System.out );
		
		char[] cbuf = new char[1024]; //임시 저장소
		int len = -1; //입력한 데이터의 길이
		try {
			
			//입력할 데이터가 스트림에 남아있으면 반복하면서 입력한다
			// -> EOF
			// -> End Of Stream
			while ( (len = reader.read(cbuf)) != -1) {
				writer.write(cbuf, 0, len);
				writer.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(reader!=null)	reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(writer!=null)	writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
