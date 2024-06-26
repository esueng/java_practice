package com.beyond.generics;

import com.beyond.generics.practice.MyGenerics;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String[] names = { "홍길동" , "성춘향", "이몽룡", "김철수", "김영희"};
		Integer[] numbers= {1,10,100,1000,10000,100000}
		Double [] dNumbers= {1.1,10.1,100.1,1000.1,100000.1;
			
			
			MyGenerics generics = new MyGenerics(dNumbers);
			generics.print();
			System.out.println();
			List<Integer> list = generic.tolist();
			
//			generics.toList();
			
	}

}
