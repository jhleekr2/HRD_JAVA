package java10_collection;

import java.util.LinkedList;
import java.util.Queue;

public class Collection_09_Queue {
	public static void main(String[] args) {
		
//		큐(Queue)
//		- FIFO(First Input First Output, 선입선출)
//		- LILO(Last Input Last Output, 후입후출)
//		- FCFS 알고리즘(First Come First Served)
//		- 대기열 시스템을 구축할 때 사용한다
//		- 자바에서는 Queue는 interface로만 제공된다
//		- 구현체는 LinkedList를 주로 사용한다.
		
//		interface Queue의 주요 메소드( 알고리즘 )
//		- offer() : 데이터 입력, 데이터 enqueue(인큐)
//		- poll() : 데이터 출력, 데이터 dequeue(데크)
//		- peek() : 데이터 확인, poll()될 데이터 확인(삭제X)
		
		//큐(Queue)
		
		Queue queue = new LinkedList(); // LinkedList가 Queue를 상속받고 있음
		
		queue.offer("ALice");
		queue.offer("Bob");
		queue.offer("Clare");
		
		System.out.println( queue );
		
		System.out.println("-----------");
		
		System.out.println( queue.poll() );
		System.out.println( queue.poll() );

		System.out.println("-----------");

		System.out.println( queue.peek() );
		System.out.println( queue );
		
		
	}

}
