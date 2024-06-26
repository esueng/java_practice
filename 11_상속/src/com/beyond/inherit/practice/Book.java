package com.beyond.inherit.practice;
/*
 * 모든 클래스는 Object 클래스를 상속한다.
 */
public class Book {
	private String title;
	
	private String author;
	
	private int price;
	
	public Book() {
		
	}

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public String information() {
		return String.format("title : %s, author : %s, price : %d\n", 
				title, author, price);
	}
	
	/*
	 *  1. Object 클래스의 toString() 메소드
	 *   - toString() 메소드는 객체의 문자 정보를 리턴한다.
	 *   - 기본적으로 Object 클래스에서는 "클래스명@16진수 해시코드"를 리턴한다.
	 */
	
	/*
	 * 2. Object 클래스의 equals() 메소드
	 * -equals 메소드는 매개값으로 전달받은 객체와 자신ㅇ ㅣ동일한 객체라면 true를 리턴하고 아니면 false를 리턶나다
	 * - 기본적으로 Object 클래스는 주소값을 비교하는데 자식 클래스에서 객체들이 가지고 있는 필드의 값들을 비교하도록 재정의할 수 있음.
	 */
	
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		Book target = (Book)obj;
		result = this.title.equals(target.title) &&
				this.author.equals(target.author) &&
				this.price == target.price;
		return result;
	}
	/*
	 * 3. Obejct 클래스의 hashCode() 메소드
	 * -객체의 해시 코드란 객체를 식별할 수 있는 하나의 정수값을 의미한다.
	 * 	- 기본적으로 Object 클래스의 hashCode()메소드는 객체의 메모리 번지를 이용해서 만들어주기 때문에 객체마다 다른 값을 갖고 있다.
	 * 	
	 */
	@Override
	public int hashCode() {
		return (this.title + this.author + this.price).hashCode();
	}
}
