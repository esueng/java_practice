package com.beyond.control.practice;

public class F_Continue {
	/*
	 * continue 문
	 * 	[표현법]
	 * 
	 */
	public void method1() {
		for (int i=2 ; i<10 ; i++) {
			System.out.printf("====%d단====\n",i);
			for (int j =1 ; j<10 ; j++) {
				System.out.printf("%d X %d = %d\n",i,j,i*j);
			}
		}
	}
}
