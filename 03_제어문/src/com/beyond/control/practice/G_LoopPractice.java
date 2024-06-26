package com.beyond.control.practice;

import java.util.Scanner;

public class G_LoopPractice {
	/*
	 * 실습 문제 1
	 * 사용자가 입력한 단을 출력하시오. 
	 * 
	 * 예시 1)
	 *    단 수(2 ~ 9)를 입력해 주세요. > 3
	 *    3 X 1 = 3
	 *    ...
	 *    3 X 9 = 27
	 *    
	 * 예시 2)
	 *    단 수(2 ~ 9)를 입력해 주세요. > 12
	 *    2 ~ 9 사이의 양수를 입력하여야 합니다.
	 */
	public void practice1() {
		Scanner scanner = new Scanner(System.in);
		int number;
		System.out.println("단 수(2~9)를 입력해주세요. >");
		number = scanner.nextInt();
		if(number>=2 && number<=9) {
			for(int i = 1 ; i<10 ; i++) {
				System.out.printf("%d X %d = %d\n",number,i,number*i);
			}
		} else {
			System.out.println("2~9 사이의 양수를 입력하여야 합니다.");
		}
	}
	/*
	 * 실습 문제 2
	 * 아래와 같이 출력 되도록 중첩 for 문을 작성하시오.
	 * 
	 * 예시)
	 *   1***
	 *   *2**
	 *   **3*
	 *   ***4
	 */
	public void practice2() {
		int number;
		number=4;
		for(int i = 1 ; i < number+1 ; i++) {
			for (int j = 1 ; j< number+1 ; j++) {
				System.out.print(i==j ? i : "*");
			}
			System.out.println();
		}
	}
	/*
	 * 실습 문제 3
	 * 아래와 같이 출력 되도록 중첩 for 문을 작성하시오.
	 * 
	 * 예시)
	 *   *
	 *   **
	 *   ***
	 *   ****
	 *   *****
	 */
	public void practice3() {
		int number;
		number=5;
		for(int i = 1 ; i<number+1 ; i++) {
			for(int j=1 ; j<number+1 ; j++) {
				if (j<=i)
					System.out.printf("*");
			}
			System.out.println();
		}
	}
	/*
	 * 실습 문제 4
	 * 
	 * 반복적으로 두 정수를 입력받고 연산자 기호(+, -, *, /)를 입력 받아서 계산을 출력하라
	 * 단, 연산자 기호를 잘못 입력하는 경우 "연산자를 잘못 입력하셨습니다." 출력하고 프로그램을 종료한다.
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
	public void practice4() {
		Scanner scanner = new Scanner(System.in);
		int number1;
		int number2;
		char op;
		int result;
		System.out.println("첫 번째 수 > ");
		number1 = scanner.nextInt();
		System.out.println("두 번째 수 > ");
		number2 = scanner.nextInt();
		System.out.println("연산자 입력(+, -, *, /) > ");
		scanner.nextLine();
		op=scanner.nextLine().charAt(0);
		scanner.close();
		switch(op) {
		case '+':
			result = number1 + number2;
			break;
		case '-':
			result = number1 - number2;
			break;
		case '*':
			result = number1 * number2;
			break;
		case '/':
			result = number1 / number2;
			break;
		default:
			System.out.println("연산자를 잘못 입력하셨습니다");
			return;
		}
		System.out.printf("%d %c %d = %d",number1,op,number2,result);
	}
	/*
	 * 실습 문제 5
	 * 사용자가 "안녕하세요."라고 입력을 하면 아래와 같이 출력 되도록 코드를 작성하라.
	 * '안'
	 * '녕'
	 * '하'
	 * '세'
	 * '요'
	 * '.'
	 */
	public void practice5() {
		Scanner scanner = new Scanner(System.in);
		String string = new String();
		System.out.printf("입력 > ");
		string = scanner.nextLine();
		int length=string.length();
		for(int i = 0 ; i<length ; i++) {
			System.out.printf("%c\n",string.charAt(i));
		}
		scanner.close();
	}
}
