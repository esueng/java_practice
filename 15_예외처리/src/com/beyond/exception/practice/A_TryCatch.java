package com.beyond.exception.practice;

public class A_TryCatch {
	public void method1() {
		try {
			int result = 10/0;
			throw new NullPointerException();
			// 다중캐치
		} catch (NullPointerException e) {
			System.out.println("Null err occur");
			e.printStackTrace();
		}
		// 하나에서 여러개 : 멀티 캐치
		catch (ArithmeticException | ClassCastException e) {
			System.out.println("Arith or ClassCast err occur");
			e.printStackTrace();
		}finally {
			System.out.println("final 시랭");
		}
	}

}
