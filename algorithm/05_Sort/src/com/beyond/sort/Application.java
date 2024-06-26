package com.beyond.sort;

import java.util.Arrays;

import com.beyond.sort.practice.ArraySort;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {3, 1, 5, 4, 9, 2};
//		System.out.println(Arrays.toString(array));
//		
//		ArraySort.insertionSort(array);
//		System.out.println(Arrays.toString(array));
//		System.out.println();
		
//		System.out.println(Arrays.toString(array));
//		
//		ArraySort.insertionSort(array);
//		System.out.println(Arrays.toString(array));
//		System.out.println();
		
//		ArraySort.mergeSort(array,0,array.length-1);
//		System.out.println(Arrays.toString(array));
//		System.out.println();
		
		ArraySort.quickSort(array,0,array.length-1);
		System.out.println(Arrays.toString(array));
		System.out.println();
	}

}
