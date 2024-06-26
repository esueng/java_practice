package com.beyond.operator.practice;

import java.util.Scanner;

public class D_Comparison {
	public void method1() {
		/* 
		 * 비교 연산자
		 * 크기 비교 (>,<,>=,<=)
		 * 동등 비교 (==,!=)
		 */
		int number1 = 10;
		int number2 = 25;
		boolean result = false;

//		result = number1 == number2;
//		result = number1 != number2;
//		result = number1 > number2;
//		result = number1 < number2;
//		result = 3 == 3.0; // true
		
		// 부동 소수점 방식은 오차가 생길 수 있기 때문에 대ㅔ부분 비교 연산에서는 정수 타입을 사용
//		result = 3.0 == 3.0L; // false
//		result = number1 != number2;
		System.out.println("result: " + result);
	}
	public void method2() {
		int number = 0;
		boolean result = false;
		Scanner scanner = new Scanner(System.in);
		System.out.print("임의의 정수를 입력해 주세요. > ");
		number = scanner.nextInt();
		result = number%2 == 0;
		System.out.printf("%d는 짝수인가요? %b\n",number,result);
		scanner.close();
	}

}

