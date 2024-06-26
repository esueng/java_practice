package com.beyond.list.practice;

import java.util.Comparator;

public class ArtistAccending implements Comparator<Music> {
	/*
	 * compareTo()
	 * 	- 메소드에서 반환되는 값을 가지고 정렬 기준을 잡는다.
	 *  - 비교해서 같으면 0을 리턴한다.
	 *  - 첫 번째 객체가 크다면 양의 정수를 리턴한다.
	 *  - 두 번째 객체가 크다면 음의 정수를 리턴한다.
	 */
	@Override
	public int compare(Music music1, Music music2) {
		// TODO Auto-generated method stub
		
//		music1.getArtist();
//		
//		music2.getArtist();
		return music1.getArtist().compareTo(music2.getArtist());
//		return 0;
	}

}
