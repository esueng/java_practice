package com.beyond.stream.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class C_Sorted {
	/*
	 * 정렬
	 * 	- 
	 */
	
	public void method1() {
		IntStream.of(3,5,1,4,2)
		.sorted()
		.forEach(value -> System.out.println(value+" "));
		
		IntStream.of(3,5,1,4,2)
		.boxed()
		.sorted(Comparator.reverseOrder())
		.forEach(value -> System.out.println(value+" "));
	}
	public void method2() {
		List<String> names = Arrays.asList("홍길동", "이몽룡", "성춘향", "임꺽정", "성춘형", "홍길동", "변사또");
		
		// 오름차순 정렬
		names.stream()
		.distinct()
		.sorted()
		.forEach(name -> System.out.println(name + " "));
		
		System.out.println();
		
		//내림차순 정렬
		names.stream()
//		.sorted()(o1,o2) -> o2.compareTo(o1))
		.sorted(Comparator.reverseOrder())
		.forEach(name -> System.out.println(name + " "));
		
	}
}
