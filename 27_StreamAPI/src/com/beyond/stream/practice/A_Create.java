package com.beyond.stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class A_Create {
	/* 
	 * 스트림의 종류
	 * 	-java.util.stream 패키지에 존재하고 BaseStream 인터페이스를 부모로 해서 
	 * 자식 인터페이스들이 상속관계를 이루고 있습니다.
	 * 	- IntStream, LongStream, DoubleStream, Stream<T>
	 * 
	 * 스트림의 생성
	 * 	- 숫자 범위로 스트림을 생성하는 방법
	 * 	- 배열로부터 스트림을 생성하는 방법
	 * 	- 컬렉션으로부터 스트림으 생성하는 방법
	 */
	public void method1() {
		int sum=0;
		IntStream stream = null;

		// a:b
		stream = IntStream.range(1, 10);
		//		sum=stream.sum();
		//		sum = stream.peek(int value ->{
		//			System.out.println(value + " ");
		//		}).sum();

		sum = stream.peek(value -> System.out.println(value + " ")).sum();

		System.out.println("\nsum : "+ sum);
		System.out.println();
		//a:b+1
		stream = IntStream.rangeClosed(1, 10);
		sum = stream.peek(value -> System.out.println(value + " ")).sum();

		System.out.println("\nsum : "+ sum);
		System.out.println();
	}
	public void method2() {
		String[] names = {"홍길동", "이몽롱", "성춘향", "임꺽정", "성춘향"};

		//for문을 사용하여 출력
		for (String name : names) {
			System.out.println(name + " ");
		}

		//Stream을 사용하여 출력
		//		Stream <String> stream = Stream.of(names);
		//		Stream<String> stream = Arrays.stream(names);
		Stream<String> stream = Stream.of("홍길동", "이몽롱", "성춘향", "임꺽정", "성춘향");

		stream.forEach((String name) -> { System.out.println(name + " ");});
		System.out.println();
	}
	public void method3() {
		List<String> names = Arrays.asList("홍길동", "이몽룡", "성춘향", "임꺽정", "성춘향");
		for(int i = 0 ; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
	}
}
