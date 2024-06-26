package com.beyond.operator.practice;

public class F_Assignment {
	/* 
	 * 복합 대입 연산
	 *  - 다른 연산자와 대입 연산자를 함께 사용하는 연산자이다.
	 */
	public void method1() {
		int number = 12;
		String str = new String();
		str = "Hello";
		
		number +=3; // number = number + 3;
		System.out.println("number : " + number);

		number -=5; // number = number - 5;
		System.out.println("number : " + number);
		
		number *=6; // number = number * 6;
		System.out.println("number : " + number);
		
		number /=3; // number = number / 3;
		System.out.println("number : " + number);
		
		number %=3; // number = number % 3;
		System.out.println("number : " + number);
		
		str += "\"World!\"";
		System.out.println(str);
	}

}