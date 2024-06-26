package com.beyond.lambda.practice;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class E_Function {
	/*
	 * Function
	 * 	- Function 표준함수적 인터페이스는 매개값과 리턴값이 있는 
	 */
	 public void method1() {
		 Function<String,Integer> function = (String str) -> {
			 return Integer.parseInt(str);
		 };
		 //function : 타입변환역할
		 System.out.println(function.apply("23456"));
		 
		 BiFunction<Integer, Double, String> biFunction = (Integer i, Double d) -> {
			 return String.format("%d + %.1f = %.1f\n", i,d,i+d);
		 };
		 System.out.println(biFunction.apply(3,0.2));
	 }
}
