package com.beyond.map.practice;

import java.util.HashMap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Snack {
	private String name;

	private String flavor;

	private int calorie;

	public void method1() {

		HashMap<String,Snack> map = new HashMap<>();

		map.put("다이제",new Snack("다이제","초코맛",1000));
		map.put("칸초", new Snack("칸초","바나나맛",250));
		map.put("프링글스", new Snack("프링글스","어니언맛",500));
		map.put("프링글스", new Snack("프링글스","짠맛",400));
		map.put("먹태깡", new Snack("먹태깡","청양마요",300));
		
		System.out.println(map);
		System.out.println();
		
		map.get("다이제");
		
		System.out.println(map.size());
		System.out.println();
		
		map.remove("먹태깡");
		
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println();
		
	}
}
