package com.beyond.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A_Array {
	// 배열의 선언 및 생성, 초기화 ( new 연산자 사용 )
	public void method1() {
		int[] iArray1 = new int[5];
		int iArray2[];

		iArray2 = new int[10];

		System.out.println(iArray1);
		System.out.println(iArray2);

		iArray1[0]=2;
		iArray1[1]=4;
		iArray1[2]=6;
		iArray1[3]=8;
		iArray1[4]=10;

		//		System.out.println(iArray1[0]);
		//		System.out.println(iArray1[1]);
		//		System.out.println(iArray1[2]);
		//		System.out.println(iArray1[3]);
		//		System.out.println(iArray1[4]);

		//		for(int i = 0; i<5 ; i++)
		//			System.out.println(iArray1[i]);
		//		for (int value : iArray1) {
		//			System.out.println(value);
		//		}

		System.out.println(Arrays.toString(iArray1));
		/*
		 *  배열을 생성하고 초기화하지 않는다면, jvm이 지정한 기본 값으로 배열이 초기화 된다.
		 *  (정수형 : 0, 실수형 : 0, 문자형 : \u0000, 논리형 : false, 참조형 : null)
		 */
		System.out.println(Arrays.toString(iArray2));
	}
	// 배열의 선언 및 생성, 초기화 (값의 목록 사용)
	public void method2() {
		int[] iArray = new int[] {1,2,3,4,5};
		double[] dArray = new double[] {1.1,2.2,3.3,4.4,5.5};

		System.out.println(iArray.length);
		System.out.println(Arrays.toString(iArray));
		System.out.println();

		System.out.println(dArray.length);
		System.out.println(Arrays.toString(dArray));
		System.out.println();

		//		dArray = {5.5, 6.6, 7.7, 8.8 }; error
		dArray = new double[]{5.5, 6.6, 7.7, 8.8 }; 

		System.out.println(Arrays.toString(dArray));
		System.out.println(dArray.length);
		System.out.println();


	}
	// 문자열 배열
	// 사용자로부터 과일 이름을 입력받아서 배열에 저장
	public void method3() {
		String[] fruits = new String[3];
		Scanner scanner = new Scanner(System.in);

		//		System.out.println(fruits);

		for(int i = 0 ; i < fruits.length ; i++) {
			System.out.print("과일 입력 > ");
			fruits[i] = scanner.nextLine();
		}
		System.out.println(Arrays.toString(fruits));
	}
	// 배열의 정렬
	public void method4() {
		int[] iArray= {2,7,5,1,3};
		String[] sArray = {"메론", "orange", "apeach", "banana", "apple", "레몬"};

		// 오름차순 정렬
		Arrays.sort(iArray);
		Arrays.sort(sArray);

		System.out.println(Arrays.toString(iArray));
		System.out.println(Arrays.toString(sArray));
		
		// 내림차순 정렬
		// 원본 배열을 오름차순으로 정렬한 다음 값을 반대로 새로운 배열에 대입한다.
		int[] copy = new int[iArray.length];
		for( int i = 0 ; i<iArray.length ; i++) {
			copy[4-i] = iArray[i];
		}
		for(int value : copy) {
			System.out.println(value);
		}
		
		Arrays.sort(sArray, Collections.reverseOrder());
		for(String value : sArray) {
			System.out.println(value);
		}
	}
}
