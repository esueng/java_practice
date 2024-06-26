package com.beyond.variable.practice;

public class A_variable {
	/*
	 * 변수의 선언
	 * 	[표현법]
	 * 		자료형 변수형;
	 */
	
	public void variableTest() {
		// 논리형
		boolean isTrue;
		
		// 정수형
		byte bNum;
		short sNum;
		int iNum;
		long lNum;
		
		// 실수형
		float fNum;
		double dNum;
		
		// 문자형
		char ch;
		ch='A';
		ch='\u0010';
		ch=183;
		System.out.println(ch);
		// 문자열
		String name="김수한무";
		
		System.out.println("name : "+ name);
		System.out.println();
		
//		지역 변수를 생성 후 초기화가 되지 않은 경우 에러가 발생한다.
//		System.out.println(isTrue);
		isTrue=true; // 선언 후 초기화
//		isTrue=1 // 에러 발생
//		System.out.println(isTrue);
		System.out.println("isTrue" + isTrue);
		bNum=12;
		fNum=3.141592f;
		dNum=3.14;
		System.out.println("fNum : " + fNum);
		System.out.println("bNum : " + bNum);
		System.out.println("dNum : " + dNum);
		
//		변수 명명 규칙
//		1) 대소문자 구분
//		2) 숫자로 시작하면 안된다
//		3) 특수문자는 _,$만 가능 
//		4) 예약어 사용 불가
		
		
		
	}
	public void autoCasting() {
		byte bNum=10;
		short sNum=12;
		int iNum=sNum; // short > int 자동 형 변환
		long lNum=iNum; // int > long 자동 형 변환
		float fNum=lNum; // long  > float 자동 형 변환
//		float 이 long 보다 표현 가능한 수의 크기가 더 크기 때문에 자동 형 변환이 가능
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(fNum);
		char ch='홍';
		iNum=ch;
		System.out.println(iNum);
		
		double result =12+3.3;
//		byte,short 타입의 데이터는 연산시 int로 형변환
		int result2=bNum+sNum;
		long result3=30+30;
		long result4=30+30L;
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
	}
	public void casting() {
		double dNum=4.12312313123123;
		float fNum=(float)dNum;
		System.out.println(fNum);
		System.out.println(dNum);
		int iNum=(int)fNum;
		System.out.println(iNum);
		System.out.println((byte)290);
		
		int sum= (int)(iNum+dNum);
		System.out.println(sum);
	}
	public void practice() {
		/*
		 * 홍길동 국어 60 영어 70 수학 66
		 * 총점과 평균 출력
		 */
		int kor = 60;
		int eng = 70;
		int mat = 66;
		System.out.printf("국어 : %d\n",kor);
		System.out.printf("영어 : %d\n",eng);
		System.out.printf("수학 : %d\n",mat);
		
		System.out.printf("총점 : %d\n",kor+eng+mat);
		System.out.printf("평균 : %.3f",((float)(kor+eng+mat))/3);
	}
}
