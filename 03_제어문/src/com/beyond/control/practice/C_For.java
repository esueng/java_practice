package com.beyond.control.practice;

import java.util.Scanner;

public class C_For {
	// for문
	public void method1() {
		for(int i = 0 ; i < 10 ; i++ ) {
			System.out.println(i);
		}
	}
	public void method2() {
		// 0~ 0.9999999... 사이 랜덤값 생성
		int random = (int)(Math.random()*10);
		int sum = 0;
		System.out.printf("1~10 사이의 랜덤값 : %d\n",random);
		
		for (int i = 1; i <= random; i++) {
			sum += i;
		}
		System.out.printf("1부터 %d까지의 합 : %d\n",random,sum);
	}
	/* 실습 문제
	 * 1부터 사용자가 입력한 수까지의 합계를 구하시오
	 * 예시) 
	 * 정수 > 10
	 * 총 합계 : 55
	 */
	public void practice1() {
		Scanner scanner = new Scanner(System.in);
		int total;
		int number;
		total=0;
		System.out.println("정수 > ");
		number = scanner.nextInt();
		for(int i = 0 ; i<number+1 ; i++ ) {
			total+=i;
		}
		System.out.printf("총 합계 : %d",total);
	}
	// 2단에서 9단까지 출력하기
	// f11 : 
	public void method3() {
		for(int i=2 ; i<10 ; i++) {
			System.out.printf("%%%d단%%\n",i);
			for(int j=1 ; j<10 ; j++) {
				System.out.printf("%d × %d = %d\n",i,j,i*j);
			}
			System.out.println();
		}
	}
}
