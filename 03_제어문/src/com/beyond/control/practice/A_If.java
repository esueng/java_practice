package com.beyond.control.practice;

import java.util.Scanner;

public class A_If {
	/*
	 * if 문
	 * 	[표현법]
	 * 		if (조건식) {
	 * 			실행  코드..
	 * 		} else if(조건식) {
	 * 			실행 코드..
	 * 		}
	 * 		[else{
	 * 			실행 코드..
	 * 		}]
	 */
	public void method1() {
		// 사용자에게 입력받은 정수값이 홀수인지 짝수인지 판별하기
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("INT ? : ");
		number = scanner.nextInt();
		if (number % 2 == 1) {
			System.out.printf("%d : 홀수\n",number);
		} else {
			System.out.printf("%d : 짝수\n",number);
		}
		scanner.close();
	}
	// 사용자에게 이름을 받아서 홍길동이 맞는짛 확인하기
	public void method2() {
		String name = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Name? : ");
		name = scanner.nextLine();
		
		System.out.println("홍길동"=="홍길동");
		System.out.println("홍길동".equals("홍길동"));
		System.out.println("홍길동"==new String("홍길동"));
		System.out.println("홍길동".equals(new String("홍길동")));
		
		if(!(name.equals("홍길동") && name !=null)) {
			System.out.printf("%s님은 홍길동이 아니신데요?",name);
		} else {
			System.out.printf("%s님은 홍길동이시네용",name);
		}
		scanner.close();
	}
	// 사용자로부터 알파벳 하나를 입력받아 대문자인지 소문자인지 확인 후 출력
	public void method3() {
		char alphabet = '\u0000';
		System.out.println(alphabet);
		Scanner scanner = new Scanner(System.in);

		System.out.print("알파벳 입력 > ");
		alphabet = scanner.nextLine().charAt(0);

		System.out.println(alphabet);
		if((alphabet >= 'A') && (alphabet <= 'Z')) {
			System.out.printf("%c는 대문자다",alphabet);	
		} 		else if((alphabet >= 'a') && (alphabet <= 'z')) {
			System.out.printf("%c는 소문자다",alphabet);
		} 		else {
			System.out.println("알파벳이 아닌데용");
		}
	}
	/*
	 * 실습  문제
	 * 사용자에게 점수(0-100)를 입력받아서 점수별로 등급을 출력하라
	 * 	- 90 이상은 A
	 * 	- 80 이상은 B
	 * 	- 70 이상은 C
	 * 	- 60 이상은 D
	 * 	- 이외 F
	 * 
	 * 	ex)
	 * 	score > 90
	 * 	당신의 점수는 90점이고 등급은 A이다.
	 */
	public void practice() {
		Scanner scanner = new Scanner(System.in);
		int score;
		score = scanner.nextInt();
		if (score>=90) {
			System.out.printf("Score : %d, Grade : %c",score,'A');
		} else if (score>=80) {
			System.out.printf("Score : %d, Grade : %c",score,'B');
		} else if (score>=80) {
			System.out.printf("Score : %d, Grade : %c",score,'C');
		} else if (score>=80) {
			System.out.printf("Score : %d, Grade : %c",score,'D');
		} else {
			System.out.printf("Score : %d, Grade : %c",score,'F');
		}
		scanner.close();
	}
}
