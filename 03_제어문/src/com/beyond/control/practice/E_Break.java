package com.beyond.control.practice;

import java.util.Scanner;

public class E_Break {
	/*
	 * break 문
	 * 	[표현법]
	 * 		반복문/switch(조건식){
	 * 			...
	 * 			[break;]
	 * 		}
	 */
	/*
	 * 1부터 랜덤값(1~10)까지의 합계를 반복문을 통해서 계속 출력한다.
	 * 단, 랜덤값이 숫자 5가 나오면 프로그램을 종료한다.
	 */
	public void method1() {
//		Scanner scanner = new Scanner(System.in);
		int number;
		while(true) {
			int total=0;
			number = (int)(10*Math.random()+1);
			if (number==5) {
				System.out.println("랜덤값이 5이므로 프로그램을 종료합니다");
				break;
			}
			for(int i=0 ; i<number+1 ; i++) {
				total+=i;
			}
			System.out.printf("1부터 %d까지의 합게 : %d\n",number,total);
		}
	}
}
