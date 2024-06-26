package com.beyond.object.practice;
/*
 *	클래스에서 사용 가능한 접근 제한자
 *
 *	1. public
 *	- public으로 선언된 클래스는 아무런 제약없이 사용할 수 있다.
 *
 *	2. default
 *	- 동일한 패키지에는 아무런 제약없이 사용할 수 있지만 다른 패키지에서는 사용할 수 없다.
 */
public class Person {
	// 1. 필드 정의
	private String name;
	
	private int age;
	
	// Phone 클래스와 동일한 패키지에 존재하는 Person 클래스에서 Phone에 접근
	private Phone phone = new Phone();
	
	// 2. 생성자 정의
	public Person() {
		System.out.println("생성자 호출");
	}
	
	//3. 메소드 정의
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age >= 0 ? age : 0;
	}
	
	public void setPhone(String brand, String name, String color) {
		phone.setBrand(brand);
		phone.setName(name);
		phone.setColor(color);
		
	}
	public void whoAreYou() {
		System.out.printf("안녕하세요. 저는%s입니다. 나이는 %d세입니다.\n", name, age);
		System.out.printf("저는 %s의 %s(%s)을(를) 가지고 있습니다",phone.getBrand(),phone.getName(),phone.getColor());
	}

}
