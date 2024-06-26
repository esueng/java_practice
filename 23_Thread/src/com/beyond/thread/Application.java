package com.beyond.thread;

import com.beyond.thread.practice.MyRunnable;
import com.beyond.thread.practice.MyThread;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메인 스레드 실행");
		MyThread thread = new MyThread();
		
		thread.setName("thread1");
//		thread.run();
		thread.start();
		
		
		Thread thread2 = new Thread(new MyRunnable());
//		thread2.run();
		thread2.start();
		
		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i= 1; i <= 100 ; i++) {
					System.out.println(Thread.currentThread().getName()+"["+i+"]");
				}
			}
		});
		
		 Thread thread4 = new Thread(() -> {
			 for (int i=1; i<=100 ; i++) {
				 System.out.println(Thread.currentThread().getName()+"["+i+"]");
			 }
		 });
		 /*
		  * 데몬 스레드
		  *  - 보조적인 역할을 수행하는 스레드이다.
		  *  - 다른 스레드가 종료되면 데몬 스레드는 강제로 종료된다.
		  */
		 thread4.setDaemon(true);
		 thread4.start();
		
		try {
		thread.join();
		thread2.join();
		thread3.join();
		thread4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("메인 스레드 종료");
	}

}
