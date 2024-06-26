package com.beyond.exception.practice;

import java.util.Scanner;

public class C_RuntimeException {
	public void method2() {
		int size=0;
		int numbers[] = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("배열의 길이 >");
		size=scanner.nextInt();
		
		numbers = new int[size];
		try {
			for (int i=0 ; i < numbers.length ; i++) {
				System.out.println(numbers[i]+" ");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("err occur");
		}
		System.out.println(size);
		
		scanner.close();
	}

}
