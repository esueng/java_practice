package com.beyond.staticmember.practice;

public class A_StaticField {
	public static int number = 2;
	
	private static String message = "A_StaticField에 선언된 정적 필드입니다.";

	//static 필드에 대한 Getter Setter 
	public static int getNumber() {
		return number;
	}

	public static void setNumber(int number) {
		A_StaticField.number = number;
	}

	// static 필드에 대한 Getter Setter 메소드 또한 static 키워드가 붙어야한다
	public static String getMessage() {
		return message;
	}

	public static void setMessage(String message) {
		A_StaticField.message = message;
	}
	

	
}
