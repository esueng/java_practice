package com.beyond.assist.practice;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Member implements Serializable{
	private static final long serialVersionUID = -4795058672379803983L;
	
	@Getter
	private String id;
	
	private String password;
	
	private int age;
	
	private char gender;
	
	private double point;
}
