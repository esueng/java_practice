package com.beyond.fileio.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class B_FileCharStream {
	public void fileSave() {
		char array[] = {'a','p','p','l','e'};
		// try-with-resource 문을 통해서 사용한 리소스를 자동으로 close() 시킨다.
		try (FileWriter fw = new FileWriter("b_cahr.txt")){
			fw.write('A');
			fw.write('\n');
			fw.write('홍');
			fw.write('\n');
			fw.write(array);
			fw.write('\n');
			fw.write(array,2,3);
			fw.write('\n');
			fw.write("IO 재미있으신가요....???\n");
			fw.write("IO 재미있으신가요....???\n",10,7);
			fw.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void fileRead() {
		try (FileReader fr = new FileReader("b_cahr.txt")){

			int value=0;
			while((value=fr.read())!=-1) {
				System.out.print((char)value);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
