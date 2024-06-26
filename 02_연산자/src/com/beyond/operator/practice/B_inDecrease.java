package com.beyond.operator.practice;

import java.util.Scanner;

public class B_inDecrease {
	/*
	 * 증강 연산자
	 * 	[표현법]
	 * 		(증감 연산자)피연산자; 또는 피연산자(증감 연산자);
	 * 
	 * ++ : 피연산자의 값을 1 증가시키는 연산자
	 * -- : 피연산자의 값을 1 감소시키는 연산자
	 */
	public void method1() {
		int number = 10;
		System.out.println("전위 연산 적용 전 number의 값 : " + number);
		System.out.println("1회 수행 후 값 : " + ++number);
		System.out.println("2회 수행 후 값 : " + ++number);
		System.out.println("3회 수행 후 값 : " + ++number);
		System.out.println("전위 연산 적용 전 number의 값 : " + number);
		
		System.out.println("후위 연산 적용 전 number의 값 : " + number);
		System.out.println("1회 수행 후 값 : " + number--);
		System.out.println("2회 수행 후 값 : " + number--);
		System.out.println("3회 수행 후 값 : " + number--);
		System.out.println("후위 연산 적용 전 number의 값 : " + number--);
	}
	public void method2() {
		int number1 = 10;
		int number2 = 20;
		int number3 = 30;
		System.out.println(number1++);
		System.out.println(number1++ + number2++);
		System.out.println(number1++ + --number2 + --number3 + "\n");
		
		System.out.println("number1 : " + number1);
		System.out.println("number2 : " + number2);
		System.out.println("number3 : " + number3);
	}
	public void Main() {

		Scanner sc = new Scanner(System.in);
		int[] a = new int[2];
		String[] input = sc.nextLine().split("\\s");
		a[0] = Integer.parseInt(input[0]);
		a[1] = Integer.parseInt(input[1]);
		boolean[] array = new boolean[a[1]+1];
		array[0]=true;
		array[1]=true;
		int j=2;
		for(int i = 2;i<(int)Math.pow(a[1],0.5)+1;i++){
			j=i*i;
					while(j<a[1]){
						array[j]=true;
						j+=i;
					}
		}
		for(int i=a[0];i<a[1]+1;i++) {
			if (!array[i]){
				System.out.println(i);
			}
		}
		sc.close();
	}
}
