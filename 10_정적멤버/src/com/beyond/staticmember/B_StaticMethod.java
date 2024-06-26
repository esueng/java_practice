package com.beyond.staticmember;

public class B_StaticMethod {
	private static int num1 = 10;
	
	private static int num2 = 20;
	
	private int num3 = 30;
	
	// 1. 매개변수와 반환값이 없는 정적 메소드
	public static void method1() {
		System.out.println(num1 + num2++);
		
		
	}
	// 2. 매개변수가 없고 반환값이 있는 정적 메소드
	
	// 3. 매개변수가 있고 반환값이 없는 정적 메소드
	public static void method3(int num3) {
		System.out.println(num3);
	}
	
	// 4. 매개변수가 있고 반환값도 있는 정적 메소드
	public static int method4(int... numbers) {
		int sum = 0;
		
		for(int i = 0 ; i < numbers.length ; i++ ) {
			sum += numbers[i];
			
		}
		return sum;
	}
}
