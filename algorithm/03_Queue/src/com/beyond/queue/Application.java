package com.beyond.queue;

import com.beyond.queue.practice.ArrayQueue;
import com.beyond.queue.practice.Queue;

public class Application {
	public static void main(String[] args) {
//		Queue<String> queue = new ConcurrentLinkedQueue<>();
//		
//		System.out.println(queue);
//		System.out.println(queue.size());
//		
//		queue.add("딸기");
//		queue.add("사과");
//		
//		//peek 테스트
//		System.out.println(queue.peek());
//		System.out.println(queue.size());
//		
//		//contains 테스트
//		System.out.println(queue.contains("딸기"));
//		System.out.println(queue.contains("포도"));
		
//		
		Queue<String> queue = new ArrayQueue<>(5);
//		queue.enqueue("포도");
//		queue.enqueue("딸기");
//		queue.enqueue("사과");
//		queue.enqueue("복숭아");
//		queue.enqueue("오렌지:");
//		
//		System.out.println(queue);
//		System.out.println(queue.isEmpty());
//		
//		System.out.println(queue.dequeue());
//		System.out.println(queue.peek());
//		System.out.println(queue.contains("hi"));
//		
		queue.enqueue("이구아나");
		System.out.println();
	}
}
