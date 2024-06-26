package com.beyond.stream;

import com.beyond.stream.practice.A_Create;
import com.beyond.stream.practice.B_Filtering;
import com.beyond.stream.practice.C_Sorted;

public class Application {
	/*
	 * Stream API
	 * 	- 스트림은 자바 8부터 추가된 기능으로 컬렉션(배열)의 저장된 요소들을 하나씩 
	 * 		참조해서 람다식으로 처리할 수 있도록 해주는 반복자이당.
	 * 	- 스트림은 람다식으로 요소 처리 코드를 제공할 수 있고, 내부 반복자를 사용해서
	 * 	병렬처리, 중간처리, 최종 처리 작업을 수행할 수 있다.
	 * 	- 중간 처리에는 반복, 매핑(타입 변환), 필터링, 정렬 등을 수행한다.
	 * 	- 최종 처리에서는ㄴ 반복, 카운팅, 평균, 총합 등의 집게 처리를 수행한다.
	 */
	public static void main(String[] args) {
		//		System.out.println("1");
		//		List<Integer> list = Arrays.asList(1,3,5,7);
		//		
		//		list.forEach(i -> {
		//			System.out.println(i);
		//		});

//		A_Create a_Create = new A_Create();
//		a_Create.method3();
//		new B_Filtering().method1();
//		new B_Filtering().method2();
		new C_Sorted().method2();


	}

}
