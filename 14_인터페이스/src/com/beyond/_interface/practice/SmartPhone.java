package com.beyond._interface.practice;

public class SmartPhone extends Product{
private String brand;
	
	private String code;
	
	private String name;
	
	private int price;
	
	private String mobileAgency; // 통신사
	
	public SmartPhone() {
	}

	public SmartPhone(String brand, String code, String name, int price, String mobileAgency) {
		this.brand = brand;
		this.code = code;
		this.name = name;
		this.price = price;
		this.mobileAgency = mobileAgency;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMobileAgency() {
		return mobileAgency;
	}

	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	
	@Override
	public void turnOn() {
		System.out.println("스마티폰을 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("스마트폰을 끕니다.");
	
	public String information() {

		return String.format(" ");
	}
}
