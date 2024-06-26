package com.beyond.list.practice;

public interface List<T> {
	void addFirst(T data);  // 리스트의 첫 부분에 요소 추가
	void addLast(T data);   // 리스트의 마지막 부분에 요소 추가
	void add(int index, T data);  // 리스트의 특정 위치에 요소 추가
	int size();  // 리스트의 크기 반환
	T get(int index);
	void removeLast();
	void removeFirst();
	void remove(int index);
	void remove(T data);
}
