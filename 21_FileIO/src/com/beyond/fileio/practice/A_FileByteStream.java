package com.beyond.fileio.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class A_FileByteStream {
	public void fileSave() {
		FileOutputStream fos =null;
		byte[] array = {99,100,101,102};
		try{
			fos = new FileOutputStream("a_byte.dat",true);
			//			fos = new FileOutputStream("a_byte.dat");

			fos.write(97);
			fos.write('b');
			fos.write(10);
			fos.write(array);

			fos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
	public void fileRead() {
		FileInputStream fis = null;
		byte[] array = new byte[50];
		try  {
			// 파일이 존재하지 않으면 FileNotFoundException 예외가 발생한다.
			fis = new FileInputStream("a_byte.dat");
//			System.out.println((char)fis.read());
//			System.out.println((char)fis.read());
//			System.out.println((char)fis.read());
//			System.out.println(fis.read(array,10,10));
//			System.out.println(Arrays.toString(array));
			int value=0;
			while((value=fis.read())!=-1) {
				System.out.print((char)value);
			}
			System.out.println();
//			fis.read();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
