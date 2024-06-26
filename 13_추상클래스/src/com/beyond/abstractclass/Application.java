package com.beyond.abstractclass;

import com.beyond.abstractclass.practice.BasketBall;
import com.beyond.abstractclass.practice.FootBall;
import com.beyond.abstractclass.practice.Sports;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 추상 클래스는 미완성 클래스이기 때문에 객체 생성이 불가능하다.
		Sports basketBall = new BasketBall(5);
		Sports football = new FootBall(11);

		Sports[] sports = {
				basketBall,
				football
		};
		
		for (int i = 0; i < sports.length; i++) {
			sports[i].rule();
		}

	}

}
