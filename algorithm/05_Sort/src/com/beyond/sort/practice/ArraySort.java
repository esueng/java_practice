package com.beyond.sort.practice;

public class ArraySort {
	public static void insertionSort(int[] array) {
		for(int i=0; i< array.length; i++) {
			int key = array[i];
			int j = i-1;
			for (; j>=0 && array[j]>key ; j--) {
				array[j+1] = array[j];
			}
			array[j+1] = key;
		}

	}
	public static void bubbleSort(int[] array) {
		for(int i=0 ; i < array.length-1 ;i++) {
			for (int j = 0 ; i<array.length-1-i;j++) {
				if (array[j]>array[j+1]) {
					int temp = array[j];

					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}
	public static void mergeSort(int[] array,int left,int right) {
		if (left<right) {
			int mid = (left+right)/2;

			mergeSort(array,left,mid);

			mergeSort(array, mid+1, right);

			merge(array,left,mid,right);


		}
	}
	private static void merge(int[] array, int left, int mid, int right) {
		int[] temp = new int[right-left+1];
		int i = left;
		int j = mid+1;
		int k = 0;
		while(i<=mid && j <=right) {
			if (array[i] <= array[j]) {
				temp[k++] = array[i++];
			} else {
				temp[k++] = array[j++];
			}
		}
		//				 temp[k++] = array[array[i]<=array[j] ? i++ : j++];
		while (i<=mid) {
			temp[k++] = array[i++];
		}
		while(j<=right) {
			temp[k++]=array[j++];
		}
		for(k=0 ; k<temp.length ; k++) {
			array[left+k] = temp[k];
		}



	}
	public static void quickSort(int[] array,int left, int right) {
		if(left<right) {
			int pivotIndex = partition(array,left,right);
			
			quickSort(array,left,pivotIndex-1);
			
			quickSort(array,pivotIndex+1,right);
			
		}
	}
	private static int partition(int[] array, int left, int right) {
		int pivot = array[right];
		int i = left-1;
		int temp = 0;
		
		for(int j = left ; j < right ; j++) {
			if (array[j] < pivot) {
				i++;
				
				temp = array[i];
				
				array[i] = array[j];
				array[j] = temp;
			}
		}
		
		temp = array[i+1];
		
		array[i+1] = array[right];
		array[right] = temp;
		
		return i+1;
	}
}
