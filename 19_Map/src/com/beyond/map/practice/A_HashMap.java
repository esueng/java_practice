package com.beyond.map.practice;

import java.util.HashMap;
import java.util.Set;

public class A_HashMap {
	//	new HaspMap<>
	public void method2() {
		HashMap<String,Snack> map = new HashMap<>();

		map.put("다이제",new Snack("다이제","초코맛",1000));
		map.put("칸초", new Snack("칸초","바나나맛",250));
		map.put("프링글스", new Snack("프링글스","어니언맛",500));
		map.put("프링글스", new Snack("프링글스","짠맛",400));
		map.put("먹태깡", new Snack("먹태깡","청양마요",300));
		
		// map은 인덱스의 개념이 없어서 반복문을 사용할 수 없다.
//		for (int i=0 ; i<map.size(); i++) {
//			map.get(map);
//		}
		
		// Map은 Iterable 인터페이스를 구현하지 않아서 향상도니 for문을 사용할 수 없다.
		
		//List와 Map은 구조가 달라서 ArrayList에 담아서 상용할 수 없다.
		
		Set<String> set = map.keySet();
		
		for (String key:set) {
			System.out.printf("key : %s, value : %s\n", key, map.get(key));
		}
		System.out.println();
	}
}
