package com.beyond.assist.practice;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class D_ObjectStream {
	public void fileSave() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C_object.dat"))){


			Member member = (Member)ois.readObject();
			System.out.println(member);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void objectsSave() {
		List<Member> members = new ArrayList<>();
		members.add(new Member("hong123", "1234", "홍길동", 30, '남', 3537.456));
		members.add(new Member("kim123", "4567", "김철수", 24, '남', 1000.45));
		members.add(new Member("kim456", "1234", "김영희", 24, '여', 2000));

		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_object.dat"))){
			for (Member member : members) {
				oos.writeObject(member);
				System.out.println(member.getId() + "객체 저장 완료1");
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public void objectsRead() {
		
		List<Member> members = new ArrayList<>();
		try(ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("d_object.dat"))){
//			members.add((Member)ois.readObject());
//			members.add((Member)ois.readObject());
//			members.add((Member)ois.readObject());
			
			while(true) {
				members.add((Member)ois.readObject());
			}

			for (Member member : members) {
				System.out.println(member);
			}
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
