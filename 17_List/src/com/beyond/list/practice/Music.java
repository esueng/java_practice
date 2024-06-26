package com.beyond.list.practice;


public class Music implements Comparable<Music>{
	private String title;

	private String artist;

	private int ranking;

	public Music(String title, String artist, int ranking) {
		super();
		this.title = title;
		this.artist = artist;
		this.ranking = ranking;
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", artist=" + artist + ", ranking=" + ranking + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
/*
 *  compareTo()
 *  	- 메소드에서 반환되는 값을 가지고 정렬 기준을 잡는다.
 *  	- 비교해서 같으면 0을 리턴한다
 *  	- 비교해서 자신이 크면 양의 정수를 리턴
 *  	- 비교해서 자신이 작으면 음의 정수를 리턴
 */
	
	@Override
	public int compareTo(Music music) {
		// TODO Auto-generated method stub
		// 랭킹 순서대로 정렬하는 코드
		System.out.println(this.title);
		System.out.println(music.title);
		System.out.println();
//		return music.ranking - this.ranking;
		return this.ranking - music.ranking;
	}

	
	}

