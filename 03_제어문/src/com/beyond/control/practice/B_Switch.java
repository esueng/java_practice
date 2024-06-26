package com.beyond.control.practice;

import java.util.Scanner;

public class B_Switch {
	/*
	 * 	switch
	 * 		[표현법]
	 * 			switch(값){
	 * 				case 값1:
	 * 					실행 코드..
	 * 					break;
	 * 				case 값2:
	 * 					실행 코드..
	 * 				case 값3:
	 * 					실행 코드..
	 * 				[default:
	 * 					실행 코드..
	 * 				]
	 * 			}
	 */
	// 사용자로부터 과일 이름을 입력받고 입력한 과일의 가격을 출력한다.
	// 단, 지정한 과일이 없으면 "판매하지 않는 과일입니다."를 출력한다.
	public void method1() {
		int price=0;
		String fruit = new String();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Fruit ? : ");
		fruit = scanner.nextLine();
		
		switch(fruit){
		case "사과":
			price = 8000;
			break;
		case "포도":
			price = 10000;
			break;
		default:
			System.out.println("그런건 업서용");
			return;
		}
		System.out.printf("%s의 가격은 %d원 입니다.",fruit,price);
		scanner.close();
	}
	/*
	 * 1~12월까지 입력받아서 해당하는 달의 마지막 날짜를 출력한다.
	 * 
	 * 31일까지 존재하는 월 : 1,3,5,7,8,10,12
	 * 30일까지 존재하는 월 : 4,6,9,11
	 * 28일 또는 29일까지 존재하는 월: 
	 */
	public void method2() {
		int month=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Month ? (1~12) : ");
		month = scanner.nextInt();
		
		if (!(month >= 1 && month <=12)) {
			System.out.println("1~12월까지 입력하셔야 합니다.");
			scanner.close();
			return;
		}
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.printf("%d월은 31일까지 입니다",month);
			break;
		// jdk 14버전이후부터는 case 뒤 여러개 arguments 전달 가능
		case 4,6,9,11:
			System.out.printf("%d월은 30일까지 입니다",month);
			break;
		case 2:
			System.out.printf("%d월은 28일 혹은 29일까지 입니다",month);
		}
		
		
		scanner.close();
		
	}
	public void method3() {
		/*
		 * 실습 문제 
		 * 
		 * 두 정수를 입력받고 연산자 기호(+, -, *, /)를 입력받아서 계산을 출력하라
		 * 단, 연산자 기호를 잘못 입력하는 경우 "연산자를 잘못 입력하셨습니다." 출력
		 * 
		 * 예시)
		 *   첫 번째 수 > 3
		 *   두 번째 수 > 4
		 *   연산자 입력(+, -, *, /) > +
		 *   
		 *   3 + 4 = 7
		 *   
		 *   첫 번째 수 > 3
		 *   두 번째 수 > 4
		 *   연산자 입력(+, -, *, /) > a
		 *   
		 *   연산자를 잘못 입력하셨습니다.
		 */
		int number1;
		int number2;
		char op;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Number1 : > ");
		number1 = scanner.nextInt();
		System.out.println("Number2 : > ");
		number2 = scanner.nextInt();
		System.out.println("Operator : > ");
		scanner.nextLine();
		op = scanner.nextLine().charAt(0);
		
		switch(op) {
		case '+':
			System.out.printf("%d %c %d = %d",number1,op,number2,number1+number2);
			break;
		case '-':
			System.out.printf("%d %c %d = %d",number1,op,number2,number1-number2);
			break;
		case '*':
			System.out.printf("%d %c %d = %d",number1,op,number2,number1*number2);
			break;
		case '/':
			System.out.printf("%d %c %d = %.3f",number1,op,number2,(float)number1/number2);
			break;
		default:
			System.out.println("잘못 입력하셨는데용");
		}
		
	}
}
