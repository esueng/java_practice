package com.beyond.inherit;

import com.beyond.inherit.practice.Book;
import com.beyond.inherit.practice.Desktop;
import com.beyond.inherit.practice.SmartPhone;
import com.beyond.inherit.practice.Television;

public class Application {


	public static void main(String[] args) {
		// Desktop 객체 생성
		//			Desktop desktop = new Desktop();
		Desktop desktop = new Desktop("애플", "a1111", "아이맥 24인치", 1800000, true);

		// SmartPhone 객체 생성
		SmartPhone smartPhone = new SmartPhone("애플", "a2222", "아이폰12 미니", 1000000, "KT");
 
		// Television 객체 생성
		Television television = new Television("엘지", "l3333", "벽걸이 TV", 2000000, 60);

		System.out.println(desktop.information());
		System.out.println(smartPhone.information());
		System.out.println(television.information());
		
		Book book1 = new Book("자바의 정석", "남궁성", 30000);
		Book book2 = new Book("자바의 정석", "남궁성", 30000);
		Book book3 = new Book("파이썬의 정석", "북궁성", 20000);
		
		// toSting 테스트
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3.toString());
		
		//	equals 테스트
		System.out.println(book1.equals(book1));
		System.out.println(book2.equals(book1));
		System.out.println(book3.equals(book1));
		
		// hashCode() 테스트
		System.out.println(book1.hashCode());
		System.out.println(book2.hashCode());
		System.out.println(book3.hashCode());

	}

}
