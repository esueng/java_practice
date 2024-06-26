package com.beyond.thread.practice;
/*
 * 스레드 랜덤 생성
 * 1. thread 클래스 상속 받음
 * 
 */
public class MyThread extends Thread{
	@Override
	public void run() {
		for(int i = 1 ; i<100 ; i++) {
			System.out.println(Thread.currentThread().getName()+"[" + i + "]");
		}
	}
}
