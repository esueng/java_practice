package com.beyond.file;

import com.beyond.file.practice.A_File;

public class Application {
/* 
 * File 클래스
 * 	- 파링ㄹ 크기, 속성, 이름 등의 정보를 얻어내는 기능과 파일 생성, 삭제 기능을 제공한다.
 * 	- 파일의 데이터를 읽고 쓰는 기능은 지원하지 않는다.
 * 	- 파일의 데이터를 읽고 쓰기 위해서는 파일 관련 입출력 스트림을 사용해야 한다.
 */
	public static void main(String[] args) {
		A_File a_File = new A_File();
		
		System.out.println("프로그램 실행");
		a_File.method2();
		System.out.println("프로그램 종료");
	}

}
