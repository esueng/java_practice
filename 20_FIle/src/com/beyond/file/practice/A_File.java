package com.beyond.file.practice;

import java.io.File;
import java.io.IOException;

public class A_File {
	public void method1() {
		try{
			File file = new File("test.txt"); // 메모리상에만 존재하는 객체
			//			File file = new File("C:\\Users\\Playdata\\test.txt");
			System.out.println("파일명 : "+ file.getName());
			System.out.println("파일 경로 : "+file.getAbsolutePath());
			System.out.println("파일 용량 : " + file.length());
			System.out.println("파일 존재 여부 : "+file.exists());
			if (file.exists()) {
				file.delete();
			}else
				file.createNewFile();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void method2() {
		try {
			boolean result = false;
			File temp = new File("C:/Users/Playdata/develop/temp/demo/test");
			File file = new File("C:/Users/Playdata/develop/temp/demo/test/test.txt");
			
			if(!temp.exists()) {
				result = temp.mkdirs();
				System.out.println("폴더 생성 여부 : " + result);
			}
			if (!file.exists()) {
				result=file.createNewFile();
				file.createNewFile();
				
				System.out.println("파일 생성 여부 : "+result);
			}
			
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
