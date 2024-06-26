package com.beyond.io.model.Dao;

import java.util.Scanner;

public class FileDao {
	Scanner sc= new Scanner(System.in);
	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		String str;
		while(true) {
			System.out.println("파일에 저장할 내용을 입력하시오(\"exit\"를 입력하면 내용 입력 끝)");
			str=sc.nextLine();
			if(str=="exit") 
				break;
			else
				sb.append(str);
		System.out.println("저장하시겠습니까? (Y/N)");
		str=sc.nextLine();
		if (str=="y" || str=="Y") {
			System.out.println("파일명을 입력하세요");
			
		}
		else if (str=="n" || str=="N") {
			System.out.println("다시 메뉴로 돌아갑니다.");
		}
		}
	}
	
	public void fileOpen() {
		
	}
	
	public void fileEdit() {
	
	}
}
015b