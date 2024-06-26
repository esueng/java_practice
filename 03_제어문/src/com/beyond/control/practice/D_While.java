package com.beyond.control.practice;

import java.util.Scanner;

public class D_While {
	/*
	 * 	while 문
	 * 		[표현법]
	 * 			while(조건식){
	 * 				실행 코드..
	 * 				
	 * 				[증감식,분기문]
	 * 			}
	 */
	public void method1() {
		int sum =0;
		int random = (int)(Math.random() * 10 +1);
		
		int i = 0;
		
		while(i <= random) {
			sum+=i;
			
			i++;
		}
		System.out.printf("1부터 %d까지의 합 : %d\n",random,sum);
	}
	// 사용자에게 문자열을 입력받고 그 문자열을 출력한다
	// 단, exit 문자열을 입력하면 프로그램을 종료한다.
	public void method2(){
		String str = new String();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Input : >");
			str=scanner.nextLine();
			System.out.println(str);
			if (str.equals("exit")){
				System.out.println("Program End");
				break;
			}
		}
	}
}
