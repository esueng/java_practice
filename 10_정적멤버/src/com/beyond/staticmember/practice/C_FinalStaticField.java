package com.beyond.staticmember.practice;

public class C_FinalStaticField {
	// final 필드를 초기화하는 방법
	// 1) 선언 시 명시'적으로 지정하는 방법
	public static final int MAX_LEVEL=30;
	private final String gender;
	// 2) 생성자를 통해서 지정하는 방법
	public C_FinalStaticField(String gender) {
		super();
		this.gender = gender;
	}
	// final 필드에 초기값이 저장되면 프로그램 실행 도중에 수정할 수 없다.
	public String getGender() {
		return this.gender;
	}
    public static void main(String[] args) {
        System.out.println(C_FinalStaticField.MAX_LEVEL);  // 출력: 30
    }

}
