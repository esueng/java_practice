package com.beyond.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class A_HashSet {
	public void method1() {
		Set<String> set = new HashSet<>();
		set.add(null);
		set.add("반갑습니다");
		set.add(new String("반갑습니다."));
		set.add(null);
		
		System.out.println(set);
		
		// Set에 저장된 객체에 접근하는방법
//		1. 향상된 for문을 사용하는 방법
		for(String a: set) {
			System.out.println(a);
		}
		
		// 2.HashSet에 저장된 객체들을 사용해 접근하는 방법
		ArrayList<String> list = new ArrayList<>(set);
		for(int i = 0 ; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 3. Iterator 반복자를 상용하는 방법
		// - 가져올 객체가 있는지 확인할 때는 hasNext() 메소드를 사용한다
//			- 하나의 객체를 가져올 때는 next() 메소드를 사용한다.
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		System.out.println();
		
		// 참고 : for EachRemaining() 메소드와 람다식 활용
		iterator = set.iterator();
		iterator.forEachRemaining((t) -> System.out.println(t+"_lambda"));
		
		//메소드 참조
		iterator.forEachRemaining(System.out::println);
	}
	
	public void method2() {
		List<Music> list = new ArrayList<Music>();
		list.add(new Music("How Sweet","뉴진스",1));
		list.add(new Music("소나기","이클립스",3));
		list.add(new Music("해야","뉴진스",6));
		list.add(new Music("ETA","에스파",4));
		list.add(new Music("Drama","크러쉬",5));
		
		for (Music music : list) {
			System.out.println(music);
		}
		
	}
	
	public void method3() {
		TreeSet<String> ts = new TreeSet<>();
		// 중복 제거, 정렬, null 저장 x
		ts.add("하하하");
		ts.add("자자자");
		ts.add("마마마");
		ts.add("타타타");
		ts.add("가가가");
		ts.add("나나나");
		ts.add("다다다");
		ts.add("하하하");
	}
}
