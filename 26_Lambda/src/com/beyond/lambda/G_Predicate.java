package com.beyond.lambda;

import java.util.function.Predicate;

public class G_Predicate {
	public void method1() {
		Predicate<String> predicate = (s) -> {
			return s.equals("hi");

		};
	}
}
