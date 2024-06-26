package com.beyond.control.practice;

public class Storage {
	private int product;

	private boolean empty = true;

	public synchronized void getProduct() {
		while(empty) {
			try{
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.printf("소비자가 %d번 상품을 소비하였습니다. \n",this.product);
		this.empty = true;
		notify();
	}

	public synchronized void setProduc( int product ) {
		while(!empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.product = product;

		this.empty=false;

		System.out.printf("생산자가 %d번 상품을 갱신하였습니다. \n", this.product);
		notify(); // wait()에 의해서 일시 정지된 스레드 중 한 개를 실행 대기 상태로 만든다.
		
	}
}
