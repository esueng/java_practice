package com.beyond.field.practice;

public class User {
	//필드 선언
	public String id="hong";
	
	private String password="1234";
	
	String name = "홍길동";
	
	//	매개변수가 있는 메소드
	public void test(int number) {
		int num = 20;
		
		// 지역 변수는 반드시 사용하기 전에 초기화해야 한다.
		System.out.println(num);
		
		//	매개 변수는 메소드 호출 시 반드시 값이 전달되어 사용가능
		System.out.println(number);
		
		System.out.println(password);
		
	}
}
