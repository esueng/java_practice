package com.beyond.operator.practice;

import java.util.Scanner;

public class G_Triple {
	/*
	 * 삼항 연산자
	 * 	[표현법]
	 * 		조건식 ? 식1 : 식2;
	 */
	/*
	 * 사용자에게 입력받은 정수가 양수인지, 음수인지 판별 후 출력하기
	 */
	public void method1() {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		System.out.println("정수값 입력 > ");
		number = sc.nextInt();
		System.out.println(number<0 ? "음수" : "양수");
		sc.close();
	}
	public static void heapify(int arr[], int n, int i){
		int largest = i;
		int l = i*2+1;
		int r = i*2+2;
		if(l<n) {
			if(arr[l]>arr[largest])
				largest = l;
		}
		if(r<n) {
			if(arr[r]>arr[largest])
				largest = r;
		}
		if(largest!=i){
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			heapify(arr, n, largest);
		}

	}
	public static void main1(){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i = 0 ; i<N ; i++){
			arr[i] = sc.nextInt();
		}
		for(int i = (int)(N/2 -1)  ; i>=0 ; i-- ){
			heapify(arr,N,i);
		}
		for(int i = N-1 ; i>0 ; i-- ){
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
            heapify(arr,i,0);
		}
		for (int v : arr)
			System.out.println(v);
	}
}
