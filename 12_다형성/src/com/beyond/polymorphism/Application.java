package com.beyond.polymorphism;

import com.beyond.polymorphism.practice.Desktop;
import com.beyond.polymorphism.practice.Product;
import com.beyond.polymorphism.practice.SmartPhone;
import com.beyond.polymorphism.practice.Television;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test");
		
		Product product = new Product();
		
		System.out.println(product);
		System.out.println();
		
		// 2. 자식 타입의 참조 변수로 자식 인스턴스를 다루는 경우
		//desktop 참조변수로 Product, Desktop 클래스의 멤버에 접근
		Desktop desktop = new Desktop();
		System.out.println(desktop);
		System.out.println(desktop.isAllInOne());
		
		// 3. 부모 타입의 참조 변수로 자식 인스턴스를 다루는 경우
		Product television = /* (Product) */ new Television(); // 업캐스팅
		
		System.out.println(television);
		System.out.println(((Television)television).getInch()); // 다운 캐스팅
		
		// 4. 배열과 다형성
		// 1) 다형성을 적용하기 전
		Desktop[] array1 = new Desktop[2];
		
		array1[0] = new Desktop();
		array1[1] = new Desktop();
		
		SmartPhone[] array2 = {
				new SmartPhone(),
				new SmartPhone()
		};
		// 2) 다형성을 적용한 후
		Product[] array3 = new Product[4];
		
		array3[0] = /* (Product) */ new Desktop("애플","a1111", "아이맥 24인치", 150000, true);
		array3[1] = new Desktop("삼성","s1111","매직스테이션",2000000, false);
		array3[2] = new SmartPhone("애플","a1111","아이폰12 미니", 100000, "KT");
		array3[3] = new Television("엘지","l1111", "벽걸이 TV", 2000000 , 60);
		
		for (Product p : array3) {
			System.out.println(p);
			if  (p instanceof Desktop) {
				System.out.println("AllInOne : "+((Desktop)p).isAllInOne());
				
			} else if ( p instanceof SmartPhone) {
				System.out.println("AllInOne : "+((SmartPhone)p).getMobileAgency());
				
			} else if ( p instanceof Television) {
				System.out.println("inch : "+((Television)p).getInch());
			}
		}
		

		
	}
//	public static void productInfo(Desktop d) {
//		System.out.println(d);
//	}
//	
//	public static void productInfo(Television t) {
//		System.out.println(t);
//	}
//	
//	public static void productInfo(SmartPhone s) {
//		System.out.println(s);
//	}
	public static void productInfo(Product p) {
		System.out.println(p);
	}
}
