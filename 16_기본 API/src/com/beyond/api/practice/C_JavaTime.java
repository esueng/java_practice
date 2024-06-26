package com.beyond.api.practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class C_JavaTime {
	/*
	 *  java.time 패키지
	 *   - 자바 1.8부터는 날짜와 시간을 나타내는 java.time 패키지를 제공한다.
	 */
	public void method1() {
		
		// 날짜와 시간 정보를 모두 저장할 수 있다.
		// 현재 날짜와 시간 정보를 저장한 객체를 생성한다.
		LocalDateTime now = LocalDateTime.now();
		// 매개값으로 주어진 날짜와 시간 정보를 저장한 객체를 생성한다.
		LocalDateTime when = LocalDateTime.of(2024, 6,13, 18, 00, 00);
		
		LocalDateTime now2 = now;
		System.out.println(now2);
		System.out.println(when);
		System.out.println(ZonedDateTime.now());
		
		
		System.out.println(now2.isAfter(when));
		System.out.println(now2.isBefore(when));
		System.out.println(now2.isEqual(when));
		System.out.println();
		
		LocalDate localDate = LocalDate.of(2022, 5, 25);
		System.out.println(localDate);
		
		now2.toLocalTime();
		
		System.out.println(localDate);
		System.out.println(when);
		System.out.println();
		
		// DateTimeFormatter 클래스 사용
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		System.out.println(now);
		System.out.println(now.format(formatter));
		System.out.println();
		
		System.out.println(DateTimeFormatter.ISO_WEEK_DATE);
		System.out.println(DateTimeFormatter.BASIC_ISO_DATE);
		
		System.out.println(LocalDate.parse("2024-W30-1",DateTimeFormatter.ISO_WEEK_DATE));
		
	}

}
