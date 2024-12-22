package java14_net;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

//	네트워크(Network)
//	- 노드(node)들의 연결망(통신망)
//	- 통신망에 연결된 노드
//	→ 네트워크로 연결된 시스템들
//	→ 컴퓨터, 주변장치, 네트워크장비, 모바일기기, 스마트기기 등등
//	
//	노드의 역할 구분
//	- 서버(Server) : 다른 노드에게 서비스(기능)을 제공하는 노드
//	- 클라이언트 : 다른 노드에게서 서비스를 제공받는(이용하는) 노드
//	**서버와 클라이언트 모두 프로그램으로 인식하자(카카오톡, 브라우저, 게임 등등이 각각의 노드임)
//	**다만, 1컴퓨터에 여러 노드가 존재하는 클라이언트와 달리 서버는 1컴퓨터에 1서버만 존재하도록
//	구축하는 경우가 많다
//	- 전용 서버를 둔 방식을 CS방식이라고 한다
//	- 각 노드가 서버, 클라이언트 역할 구분없이 통신하면 P2P방식이라고 한다.
//	
//	프로토콜(Protocol)
//	- 통신 규약
//	- 노드들이 통신(데이터 교환)할 때 지켜야할 규칙을 정해놓은 것
//	** 3G,4G,5G,Wifi,LTE 이런 것들이 프로토콜의 예시이다
//	**웹서비스 - HTTP 프로토콜 규격 
//	- 통신 방식, 절차, 순서, 전송하는 데이터의 형식, 노드의 위치(주소) 표현법 등을 정의해놓는다
//	- 대표적인 프로토콜은 TCP/IP Protocol이 있다
//	
//	TCP/IP Protocol
//	- Transmission Control Protocol / Internet Protocol
//	- TCP : 통신 방식에 대한 규칙
//	- IP : 노드의 위치(IP주소)에 대한 규칙
//	
//	TCP(연결(통신)제어 프로토콜)
//	- 네트워크를 통해 전달되는 데이터를 작은 조각으로 나누거나 재조립하는 방법을 정의하고 있다
//	- 잘게 나눈 데이터 조각을 ‘패킷’이라고 한다
//	- 한 번에 큰 용량의 데이터를 한꺼번에 전송하는 것은 현실적으로 부적절하므로 패킷이라는 단위로
//	잘게 나누어 여러 번 전송한다
//	- 패킷마다 순서(번호)를 붙여서 전송한다
//	- 기본 전송 방식에 따라 TCP방식, UDP방식으로 나눈다
//	
//	TCP vs UDP
//	- 패킷을 전송하는 전략(방법)이 다르다
//	- TCP : 연결지향적, 신뢰성있는 통신, 데이터 안정성
//	- UDP : 비연결지향적, 신뢰성없는 통신, 속도, 실시간 통신
//	** 연결지향 : 송수신장치 사이에 연결이 먼저 수립된 후 데이터 통신한다
//	** 데이터 신뢰성 : 원본 데이터의 원형을 유지하며 통신하는가
//	** 스타크래프트는 UDP방식의 멀티플레이를 지원하는데, 이때 방장의 컴퓨터가 서버역할을 한다.
//	** 닌텐도는 모든 멀티플레이 게임들이 UDP방식으로 되어 있다. → 멀티플레이 게임 연결이 불안정하다.
//	
//	IP(인터넷 프로토콜)
//	- 노드의 위치를 표현하는 방법을 정의하고 있다
//	- IP주소를 이용해서 패킷이 전송될 곳을 구분할 수 있게 해준다
//	- 패킷마다 IP주소가 부여된다
//	- 송신지, 수신지를 따로 적어서 구분한다
//	
//	TCP/IP 프로토콜에서 사용하는 주소 체계
//	- IP Address(IP주소)
//	네트워크 상에서 각 노드들의 위치를 나타내는 주소 체계
//	노드들을 서로 구분하는 용도로 사용된다
//	IP Protocol에 형식이 정의되어 있다
//	32bit DWORD 타입으로 표현한다
//	( DWORD == 부호없는 32비트 정수 == 양수만 표현한다 ) → 약 42억개
//	bit
//	nibble == 4bit
//	byte == 8bit == 2nibble
//	WORD = 2Byte
//	DWORD == Double Word ==2WORD = 4Byte
//	QWORE == Quad Word ==4WORD = 8Byte
//	32bit를 1바이트 단위로 4자리를 나눠서 표현한다. 
//	0~255.0~255.0~255.0~255
//	ex) IP확인
//	192.168.10.12
//	→ win키 + r(실행창)
//	→ cmd(콘솔창)
//	→ ipconfig
//	→ IPv4 주소 확인
//	** 리눅스, 맥OS : 터미널창에서 ipconfig
//	
//	- Port Address, Port Number(포트 번호)
//	TCP 프로토콜에서 정의한다
//	IP로 구분되는 시스템 안에서 서비스(프로그램)의 위치를 구분하는 주소
//	같은 컴퓨터 안에서 어떤 프로그램이 통신하는 지 구분할 수 있게 된다
//	16bit WORD타입으로 표현된다
//	0 ~ 65535 내에서 정수값으로 사용된다
//	IP주소 뒤에 : 을 붙이고 추가로 적용해서 표현한다
//	ex) 192.168.10.12:8001
//	IP : 192.168.10.12
//	Port : 8001
//	** Well-Known Port(잘 알려진 포트 번호)
//	-0번 ~ 1023번
//	-자주 사용되는 기능(서비스)에 일반적으로 사용하는 포트번호
//	80 - 웹 서비스, HTTP
//	443 - 보안 웹 서비스, HTTPS
//	** netstat -ano로 현재 활성 연결을 확인할 수 있다.
//	
//	소켓(Socket)
//	- TCP/IP 네트워크 통신을 하기 위한 SW적으로 구현된 접속 장치
//	- 자바에서는 클래스 API로 제공된다
//	- 통신에 필요한 절차를 직접 개발하지 않아도 바로 통신할 수 있도록 만들어진 API를 뜻한다
//	
//	소켓 클래스의 종류
//	- 서버쪽 소켓 클래스
//	ServerSocket class
//	Socket class
//	
//	- 클라이언트쪽 소켓 클래스
//	Socket class

public class Net01_InetAddress {
	public static void main(String[] args) {
		
		//InetAddress 클래스
		// IP정보 관리 클래스
		
		// 생성자 없음
		// 직접 new해서 객체 생성할 수 없다
		
		// 주로 도메인주소(호스트네임)를 이용하여 IP주소를 객체로 얻어와서 사용한다
		
		// ** 호스트 네임 : 네트워크에서 노드를 구분하기 위해 정하는 이름
		// ** 도메인 주소 : 인터넷 상에서 IP를 대신해서 사용하는 문자 주소
		
		// ** DNS : IP <-> 도메인 변환 시스템
		
		// www.naver.com
		// www - 호스트 네임
		// naver.com - 도메인 주소, 컴퓨터(네트워크 주소)
		
		//nslookup 명령어로 DNS서버에 접속 가능
		//접속 이후 사이트 주소 입력하면 사이트의 IP주소 알려준다.
		//--------------------------------------------------
		
		InetAddress ip = null; //IP주소 표현 객체
		
		try {
			
			//도메인네임(host)을 통해 IP주소 얻기
			ip = InetAddress.getByName("www.naver.com");
			
			System.out.println(ip);
			//호스트 네임(도메인)
			System.out.println( ip.getHostName() );
			
			//호스트 주소(IP)
			System.out.println( ip.getHostAddress() );
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("-------------------------");
		
		//루프백 호스트(Loopback Host)
		// 네트워크 상에서 자기 자신 노드를 지칭하는 방식
		
		// 가상 루프백 호스트
		
		// 루프백 호스트 네임 : localhost
		// 루프백 호스트 IP : 127.0.0.1
		
		try {
			InetAddress local = InetAddress.getLocalHost();
			
			System.out.println(local);
			System.out.println(local.getHostName());
			System.out.println(local.getHostAddress());
			
			byte[] ipAddr = local.getAddress();
			System.out.println(Arrays.toString(ipAddr));

		
		
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
	}
}
