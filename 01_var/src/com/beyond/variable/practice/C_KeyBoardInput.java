package com.beyond.variable.practice;

import java.util.Scanner;

public class C_KeyBoardInput {
	public void inputByScanner() {
		/*
		 * Scanner 클래스
		 *  사용자로부터 입력되는 정수, 실수, 문자열을 처리하는 클래스이다.
		 */
		int age = 0;
		float height = 0;
		String name = null;
		char gender = '\u0000';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("당신의 이름은 무엇입니까? > ");
		name = scanner.nextLine();
		
		System.out.println("당신의 성별은 무엇입니까? > (남/여)");

		gender = scanner.nextLine().charAt(0);
		
		System.out.printf("당신의 나이는 몇살입니까? > \n");
		age = scanner.nextInt();
		
		System.out.printf("당신의 키는 얼마입니까? > \n");
		height = scanner.nextFloat();
		
		scanner.close();
		System.out.printf("당신의 이름은 %s이고 나이는 %d세, 키는 %.1fcm, 성별은 %c 입니다.\n",name,age,height,gender);
	}
}
