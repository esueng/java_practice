package com.beyond.api.practice;

import java.text.SimpleDateFormat;

public class B_Date {
	/* 
	 * Date 클래스
	 * 	날짜를 표현하는 클래스이다.
	 * 	주로 객체 간에 날짜 정보를 주고 받을 때 사용한다.
	 */
	public void method1() {
		// 기본 생성자로 객체를 생성하면 현재 시스템의 시간에 대한 정보를 가지고 객체를 생성한다.
		Date today = new Date();
		// 1970년 1월 1일 00시를 기준으로 밀리세컨드 단위로 표시됨
		
		
		Date when = new Date(1);
		SimpleDateFormat sdf = new SimpleDateFormat()"yy년 MM월 dd일(E) a HH시 mm분 ss초");
		
		when = new Date((2024-1900),(6-1),13);
		
		System.out.println(today);
		System.out.println(when);
		
	}
}
