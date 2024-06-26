package com.beyond.exception;

import java.io.IOException;

import com.beyond.exception.practice.B_Throws;
import com.beyond.exception.practice.C_RuntimeException;

public class Application {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		System.out.println("prog start");
		//		new A_TryCatch().method1();
//		try {
//			new B_Throws().method1();
//			
//		} catch (ClassNotFoundException e) {
//			System.out.println("Class err occur");
//		
//		} catch (IOException e) {
//			System.out.println("IO err occur");
//		}
//		new B_Throws().method1();
		new C_RuntimeException().method2();
		
		System.out.println("prog end");
	}

}
