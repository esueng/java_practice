package com.beyond.constructur;

import com.beyond.constructur.practice.User;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user;
		
		user = new User();
		
		System.out.println(user);
		
		System.out.println(user.information());
		
		user = new User("hong", "1234", "홍길동", 30, '남');
		
		System.out.println(user.information());
		
	}

}
