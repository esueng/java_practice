package com.beyond.assist.practice;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class A_ByteToCharStream {
	public void inputStreamReader() {
		try {
			char[] array = new char[10];
			InputStreamReader isr = new InputStreamReader(System.in);
			
			System.out.println("문자열 입력 > ");
			isr.read(array);
			
			for(char c : array) {
				System.out.print(c);
			}
			
			System.out.println(Arrays.toString(array));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void outputStreamWriter() {
//		try {
//			OutputStreamWriter osw = new OutputStreamWriter(System.out);
//			
//			osw.write("안녕하세요. 저는 홍길동입니다.\n");
//			osw.write("힘내세요~^^\n");
//			osw.flush();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		// 보조 스트림 다중 연결
		try {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			bw.write("머시기");
			bw.flush();
			
		} catch (IOException e){
			e.printStackTrace();
			
		}
	}
}

