package com.beyond.field;

import com.beyond.field.practice.User;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
		
		// 접근 제한자 테스트
		// public : 어디서든 필드에 직접 접근이 가능하다.
		System.out.println(user.id);
		user.id = "kim1231";
		System.out.println(user.id);
		
		//	default : 같은 패키지 내에서만 직접 접근이 가능하다.
//		System.out.println(user.name);
		
//		System.out.println(user.password);
	}

}
