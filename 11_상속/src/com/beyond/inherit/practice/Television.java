package com.beyond.inherit.practice;

public class Television {
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

	public String information() {

		return String.format("brand : %s, code : %s, price : %d, name : %s, inch : %d\n",
				this.brand, this.code, this.price, this.name, this.inch);
	}
}
