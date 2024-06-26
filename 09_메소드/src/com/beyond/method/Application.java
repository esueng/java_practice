package com.beyond.method;

import com.beyond.method.practice.A_Method;
import com.beyond.method.practice.Member;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 매개변수와 반환값이 없는 메소드 호출
		A_Method methodTest = new A_Method();
		methodTest.method1();
		
		// 2. 매개변수가 없고 반환값이 있는 메소드 호출
		String str = methodTest.method2();
		System.out.println(str);
		
		// 3. 매개변수가 있고 반환값은 없는 메소드 호출
		methodTest.method3(1, 2);
		
		// 4. 매개변수가 있고 반환값은 없는 메소드 호출
		System.out.printf("10 X 20 = %d입니다.\n",methodTest.method4(10, 20));
		System.out.println();
		
		// 5. 매개변수로 객체를 전달받는 메소드 호출
		Member member = new Member("홍길동",24);
		methodTest.method5(member);
		System.out.println(member.information());
		
		// 6. 매개변수로 가변인자를 전달받는 메소드 호출
		// 1) 배열을 사용하는 메소드 호출
		// 2) 가변 인자를 사용하는 방법
		// - 자바 1.5부터 지원
		// - 메ㅗㅅ드 호출 시 넘겨준 값의 수에 따라 자동으로 배열이 생성되고 매개값으로 사용 int... numbers
		int array[] = {1, 2, 3, 4, 5};
		System.out.println(methodTest.method6(array));
		
	}

}
