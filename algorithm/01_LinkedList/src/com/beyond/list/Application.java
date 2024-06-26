package com.beyond.list;



import com.beyond.list.practice.List;
import com.beyond.list.practice.SinglyLinkedList;

public class Application {

	public static void main(String[] args) {
//		List<String> list = new LinkedList<>();
		
//		list.addFirst("사과");
//		list.addFirst("포도");
//		
//		list.addLast("딸기");
//		list.addLast("키위");
//		
//		list.add(1,"수박");
//		System.out.println(list);
//		System.out.println(list.contains("딸기"));
		List<String> list = new SinglyLinkedList<>();
		
		list.addFirst("사과");
		list.addLast("포도");
		list.addFirst("딸기");
		list.addFirst("후뿌뿌뿌");
		list.addLast("용감한 그리핀돌");
		list.add(1, "복숭아");
		
		System.out.println(list.get(0));
		
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
	}
}
