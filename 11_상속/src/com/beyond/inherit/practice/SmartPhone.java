package com.beyond.inherit.practice;

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
	
	public String information() {

		return String.format("%s, %s",
				super.information(), this.mobileAgency);
	}
}
