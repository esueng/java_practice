package com.beyond.inherit.practice;

public class Desktop extends Product{
	private boolean allInOne; // 일체 여부

	public Desktop() { 		
		//		super(); // 생략 가능

		System.out.println("자식 클래스의 기본 생성자 호출");

		//		super(); // 에러 발생
	}

	public Desktop(String brand, String code, String name, int price, boolean allInOne) {
		// 부모의 생성자를 호출해서 초기화
		//		super(brand, code, name, price);

		// 부모의 Setter 메소드를 호출해서 초기화
		//		this.setBrand(brand);
		//		setName(name);
		//		super.setCode(code);
		//		super.setPrice(price);

		// 부모의 필드에 직접 접근해서 초기화(protected 접근 제한자 사용)
		
		this.brand = brand;
		this.code = code;
		super.name = name;
		super.price = price;

		this.allInOne = allInOne;
	}

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

	@Override
	public String information() {
		// TODO Auto-generated method stub
		return String.format("brand : %s, code : %s, name : %s, price : %d, allinone : %b"
				,brand,code,name,price,allInOne);
	}
	
}
