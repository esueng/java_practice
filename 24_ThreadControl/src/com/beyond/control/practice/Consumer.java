package com.beyond.control.practice;

public class Consumer implements Runnable {
	private Storage storage;
	
	public Consumer(Storage storage) {
		this.storage=storage;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for ( int i = 1 ; i <= 10 ; i++) {
			
			try {
				storage.getProduct();
				
				// 스레드를 재움
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
