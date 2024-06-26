package com.beyond.operator.practice;

import java.util.Scanner;

public class E_logical {
	public void method() {
		/*
		 * 논리 연산자
		 * 	&&(AND, 논리곱)
		 * 		-왼쪽, 오른쪽 피연산자 모두 true 경우 참(true)
		 * 
		 * 	||(OR, 논리합)
		 * 	-- 피연산자중 하나라도 true인 경우 true
		 */
		int number = 0;
		boolean result = false;
		Scanner scanner = new Scanner(Sysytem.in);
		number = scanner.nextInt();
		
		System.out.printf("%d는 1부터 100 사이의 값인가요? %b\n", number,result);
	}
	public void method2() {
		//Short Cut 연산 테스트
		int number = 10;
		boolean result = false;
		System.out.println("&& 연산 전의 number의 값 : " + number);
		System.out.println("result : "+ result);
	}
	public void method3() {
		/*
		 * 실습 문제
		 * 사용자가 입력한 문자 값이 알파벳 대문자인지 확인하기
		 * 'a'~'z'까지 코드값으로 65~90숫자로 나열되어 있음
		 */
		Scanner scanner = new Scanner(System.in);
		char character;
		character = scanner.next().charAt(0);
		System.out.printf("입력한 문자는 대문자가 맞나? : %b", character>64 && character<91);
		scanner.close();
	}
}
