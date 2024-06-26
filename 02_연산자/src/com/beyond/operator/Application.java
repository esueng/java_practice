package com.beyond.operator;

import com.beyond.operator.practice.A_logicalNegation;
import com.beyond.operator.practice.B_inDecrease;
import com.beyond.operator.practice.C_Arithmetic;
import com.beyond.operator.practice.D_Comparison;
import com.beyond.operator.practice.E_logical;
import com.beyond.operator.practice.F_Assignment;
import com.beyond.operator.practice.G_Triple;
import com.beyond.operator.practice.H1_ClassWork;

public class Application{
	public static void main(String[] args) {
		A_logicalNegation logicalNegation= new A_logicalNegation();
//		logicalNegation.method1();
		B_inDecrease inDecrease = new B_inDecrease();
//		inDecrease.Main();
		C_Arithmetic Arithmetic = new C_Arithmetic();
//		Arithmetic.method1();
		D_Comparison Comparison = new D_Comparison();
//		Comparison.method2();
		E_logical logical = new E_logical();
//		logical.method3();
		F_Assignment Assignment = new F_Assignment();
//		Assignment.method1();
		G_Triple g_Triple = new G_Triple();
		g_Triple.main1();
		H1_ClassWork h1_ClassWork = new H1_ClassWork();
//		h1_ClassWork.practice3();
	}
	
}