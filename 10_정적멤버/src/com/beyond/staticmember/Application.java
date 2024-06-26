package com.beyond.staticmember;

import com.beyond.staticmember.practice.A_StaticField;
import com.beyond.staticmember.practice.C_FinalStaticField;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정적 필드 테스트
		A_StaticField a_StaticField1 = new A_StaticField();
		A_StaticField a_StaticField2 = new A_StaticField();
		
		System.out.println(a_StaticField1.number);
		System.out.println(a_StaticField2.number);
		
		A_StaticField.number++;
		System.out.println(a_StaticField1.number);
		System.out.println(a_StaticField2.number);
		
		System.out.println(A_StaticField.getMessage());
		A_StaticField.setMessage("메시지 변경");
		System.out.println(A_StaticField.getMessage());
		System.out.println();
		
		// 정적 메소드 테스트
		// 1. 매개변수와 반환값이 없는 정적 메소드 호출
		B_StaticMethod.method1();
		B_StaticMethod.method1();
		System.out.println();
		
		// 4. 매개변수와 반환값이 있는 정적 메소드 호출
		System.out.println(B_StaticMethod.method4());
		System.out.println(B_StaticMethod.method4(8,9));
		System.out.println(B_StaticMethod.method4(1,2,3,4));
		System.out.println();
		
		//  final 필드 테스트
		C_FinalStaticField c_FinalStaticField1 = new C_FinalStaticField("남자");
		C_FinalStaticField c_FinalStaticField2 = new C_FinalStaticField("여자");
		
		System.out.println(c_FinalStaticField1);
		System.out.println(c_FinalStaticField2);
		System.out.println();
		
		System.out.println(c_FinalStaticField1.getGender());
		System.out.println(c_FinalStaticField2.getGender());
		System.out.println();
		
		// 상수(static final) 테스트
		System.out.println(C_FinalStaticField.MAX_LEVEL);
		System.out.println(Math.PI);
		System.out.printf("byte의 표현 범위는 %d ~ %d 입니다.\n", Byte.SIZE,Byte.SIZE);
		System.out.printf("int의 표현 범위는 %d ~ %d 입니다.\n",Integer.MIN_VALUE,Integer.MAX_VALUE);
		System.out.printf("char의 표현 범위는 %d ~ %d 입니다.\n", (int)Character.MIN_VALUE, (int)Character.MAX_VALUE);
	}

}
