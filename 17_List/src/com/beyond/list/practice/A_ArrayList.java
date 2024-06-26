package com.beyond.list.practice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class A_ArrayList {
	public void method1() {
		List<Object> list = new ArrayList<>();
		//			List list = new Vector();
		//			List list = new LinkedList();

		// 객체를 저장할 때는 add()메소드를 사용한다.
		list.add("안녕하세요.");
		list.add(LocalDateTime.now());
		list.add(3.14);
		list.add(false);
		list.add('a');

		System.out.println(list);
		System.out.println(list.size());
		System.out.println();

		// 객체를 가져올 때는 get()메소드를 사용한다.
		String str = (String)list.get(0);
		list.get(0);
		LocalDateTime now = (LocalDateTime)list.get(1);
		Double number = (Double)list.get(2);

		// 객체의 중복 저장을 허용한다.
		list.add("안녕하세요.");
		// null 저장을 허용한다.
		list.add(null);
		list.add(null);

		System.out.println(list);
		System.out.println();

		// 원하는 인덱스 위치에 객체를 추가할 수 있다.
		list.add(2,12000);
		// 원하는 인덱스 위치에 객체를 변경할 수 있다.
		list.set(2,false);

		System.out.println(list);
		System.out.println();

		list.removeFirst();
		list.removeLast();

		System.out.println(list);
		System.out.println();

		list.remove(null);

		// List 에 저장된 객체를 모두 삭제할 때는 clear() 메소드를 사용한다.
		System.out.println(list.isEmpty());
		list.clear();
		System.out.println(list.isEmpty());
		System.out.println(list);
		System.out.println();

	}
	public void method2() {
		/* 
		 * 컬렉션으로 제네릭스(<>)를 사용하는 이유
		 * 	명시된 타입의 객체만 저장하도록 제한을 두기 위해서
		 */

		List<String> fruits = new ArrayList<>();
		fruits.add("사과");
		fruits.add("참외");
		
//		numbers.add(Integer.valueOf(4));
		Collections.sort(fruits);
		System.out.println(fruits);
	}
	public void method3() {
		System.out.println("실행 테스트");
	}
	
	public void method4() {
		List<Music> list = new ArrayList<Music>();
		list.add(new Music("How Sweet","뉴진스",1));
		list.add(new Music("소나기","이클립스",3));
		list.add(new Music("해야","뉴진스",6));
		list.add(new Music("ETA","에스파",4));
		list.add(new Music("Drama","크러쉬",5));
		
		for (Music music : list) {
			System.out.println(music);
			
		}
		
		System.out.println();
		Collections.sort(list, new ArtistAccending());
		
		for (Music music : list) {
			System.out.println(music);
		}
		
		System.out.println();
		
		// 아티스트순으로 리스트를 내림차순 정렬 ( 익명 구현 객체를 사용 )
		Collections.sort(list,new Comparator<Music>(){
			@Override
			public int compare(Music o1, Music o2) {
				
				return o2.getArtist().compareTo(o1.getArtist());
			}
		});
		for ( Music music : list ){
			System.out.println(music);
		}
		
	}
}
