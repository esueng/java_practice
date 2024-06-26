package com.beyond.lambda.practice;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class F_Operator {
	public void method1() {
		IntBinaryOperator intBinaryOperator = (a,b) -> a*b;
		System.out.println(intBinaryOperator.applyAsInt(10, 20));
		
		IntUnaryOperator intUnaryOperator = a -> a*a*a;
		
		
		System.out.println(intUnaryOperator.applyAsInt(22));
		
		BinaryOperator<String> binaryOperator = (String str1, String str2) -> {
			return (str1.length()>=str2.length()) ? str1 : str2;
		};
		
		System.out.println(binaryOperator.apply("hi its hong", "nmty"));
	}
}
