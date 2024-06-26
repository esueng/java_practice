package com.beyond.abstractclass.practice;

public abstract class Sports {
	protected int numberOfPlayers;

	public Sports(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}
	// 추상 메소드
	// 각각의 스포츠마다 그에 따른 룰 지정해야함
	
	public abstract void rule();
}
