package com.beyond.operator.practice;

import java.util.Scanner;

public class H1_ClassWork {
	/*
	 * 실습 문제 1
	 * 
	 * 사용자한테 두 개의 정수값을 입력받아서
	 * 두 정수의 곱셈 결과 100보다 큰 경우 "결과가 100 이상입니다." 
	 * 아닌 경우 "결과가 100 보다 작습니다." 출력
	 */
	public void practice1() {
		Scanner scanner = new Scanner(System.in);
		int a;
		int b;
		System.out.println("a = ? : ");
		a=scanner.nextInt();
		System.out.println("b = ? : ");
		b=scanner.nextInt();
		System.out.println("결과가 100 " + (a*b>=100 ? "이상" : "미만") + "입니다");
	}
	
	/*
	 * 실습 문제 2
	 * 
	 * 사용자한테 문자를 하나 입력받아서
	 * 입력한 문자가 대문자이면 "알파벳 대문자이다." 
	 * 아닌 경우 "알파벳 대문자가 아니다." 출력
	 */
	public void practice2() {
		Scanner scanner = new Scanner(System.in);
		char a;
		System.out.println("알파벳 입력 : ");
		a = scanner.nextLine().charAt(0);
		System.out.println("알파벳 대문자" + ((int)a<91 && (int)a>64 ? "이다" : "가 아니다"));
	}
	
	/*
	 * 실습 문제 3
	 * 
	 * 두 정수를 입력받고 + 또는 - 를 입력받아서 계산을 출력하라
	 * 단, + 또는 - 외의 문자를 입력하는 경우 "잘못 입력했습니다." 출력
	 * 
	 * 예시)
	 *   첫 번째 수 > 3
	 *   두 번째 수 > 4
	 *   연산자 입력(+ 또는 -) > +
	 *   
	 *   3 + 4 = 7
	 */
	public void practice3() {
		Scanner scanner = new Scanner(System.in);
		int a;
		int b;
		char op;
		System.out.println("a : ?");
		a = scanner.nextInt();
		System.out.println("b : ?");
		b = scanner.nextInt();
		System.out.println("op : ?");
		scanner.nextLine();
		op = scanner.nextLine().charAt(0);
		System.out.print((op=='+' || op=='-') ? (a + op + b + (op=='+' ? a+b : a-b)) : "잘못 입력했습니다");
		
	}
}
