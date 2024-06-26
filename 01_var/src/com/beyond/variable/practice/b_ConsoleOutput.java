package com.beyond.variable.practice;

public class b_ConsoleOutput {
	public void valuePrint() {
		// print : 줄바꿈 x
		System.out.print("안녕하세요.");
		System.out.print(12345);
		System.out.print(false);
		System.out.println();
//		System.err.print("에러입니다");
		
		// println : 자동 줄바꿈 
		System.out.println("안녕하세요.");
		System.out.println(12345);
		System.out.println(false);
		
		/*
		 * print format : 
		 * 서식지정자
		 * %d : 정수형, %f : 실수형, %b : 논리형
		 * %c : 문자형, %s : 문자열
		 * escape 문자
		 *\n : 개행
		 *\t : 수평 탭
		 *\" : 큰따옴표 입력
		 *\' : 작은따옴표 입력
		 *\\ : 역슬래쉬 입력
		 * 
		 */
		System.out.printf("%d\n",10);
		System.out.printf("%d + %d = %d\n",10,20,(10+20));
		System.out.printf("%.2f\t%.3f\n",3.14,4.12345);
		System.out.printf("%c %s\n",'A',"\"Hello\"");
	}
}

