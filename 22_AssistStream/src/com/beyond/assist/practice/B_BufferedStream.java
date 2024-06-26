package com.beyond.assist.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class B_BufferedStream {
	public void fileSave() {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("a_buffer.txt"))) {
			bw.write("안녕하세요");
			bw.newLine();
			bw.write("줄바꿈이 적용되었나요?");
			bw.newLine();
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileRead() {
		try (BufferedReader br = new BufferedReader(new FileReader("a_buffer.txt"))) {

			String line = null;

			//			line=br.readLine();
			//			System.out.println(line);
			//			
			//			line=br.readLine();
			//			System.out.println(line);

			while((line = br.readLine())!=null) {
				System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}