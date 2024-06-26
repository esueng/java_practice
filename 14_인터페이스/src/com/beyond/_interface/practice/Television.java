package com.beyond._interface.practice;

public class Television extends Product{
	private String brand;

	private String code;

	private String name;

	private int price;

	private int inch; // 인치

	public Television() {
	}

	public Television(String brand, String code, String name, int price, int inch) {
		this.brand = brand;
		this.code = code;
		this.name = name;
		this.price = price;
		this.inch = inch;
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

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	
	@Override
	public void turnOn() {
		System.out.println("텔레비전을 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("텔레비전을 끕니다.");
		
	@Override
	public String toString() {
		return "Television [brand=" + brand + ", code=" + code + ", name=" + name + ", price=" + price + ", inch="
				+ inch + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	

	

}
