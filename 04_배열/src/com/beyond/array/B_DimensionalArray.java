package com.beyond.array;

import java.util.Arrays;

public class B_DimensionalArray {
	// 2차원 배열의 선언, 생성, 초기화 ( new 연산자 사용 )
	public void method1() {
		int[][] iArray;
		//		int iArray[][];
		//		int[] iArray[];

		iArray = new int[3][5];

		/*
		 * 1	2	3	4	5	
		 * 6	7	8	9	10
		 * 11	12	13	14	15
		 */
		for ( int i = 0 ; i< iArray.length ; i++ ) {
			for (int j = 0 ; j<iArray[i].length ; j++)
				iArray[i][j]=i*iArray.length+j+1;
		}
		for(int k = 0 ; k<iArray.length ; k++) {
			System.out.println(Arrays.toString(iArray[k]));
		}
		for ( int i = 0 ; i< iArray.length ; i++ ) {
			for (int j = 0 ; j<iArray[i].length ; j++) {
				System.out.printf("%2d ",iArray[i][j]);
			}
			System.out.println();

		}
	}
	// 2차원 배열의 선언, 생성, 초기화 (값의 목록 사용)
	public void method2() {
		//		String[][] sArray = new String[][] {{"Linux","MariaDB"},{"Java","Spring"}};
		String[][] sArray = {
				{"Linux", "MariaDB"},
				{"Java", "Spring"},
				{"HTML5", "CSS3", "Vue.js"}
		};
		for ( int i = 0 ; i< sArray.length ; i++ ) {
			for (int j = 0 ; j<sArray[i].length ; j++) {
				System.out.printf("%s\t",sArray[i][j]);
			}
			System.out.println();
		}
		int arr[][] = {{1,2,3},{1,2}};
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
	}

}
