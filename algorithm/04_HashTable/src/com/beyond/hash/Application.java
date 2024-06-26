package com.beyond.hash;

import com.beyond.hash.practice.HashTable;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashTable<String, String> hashTable = new HashTable<>(5);
		
		hashTable.put("strawberry","딸기");                                                                                                                  
		hashTable.put("melon","메롱");
		hashTable.put("sorry","사과");
		hashTable.put("banana","나나바");
		
//		hashTable.put("strawberry","딸기");
//		hashTable.put("strawberry","딸기");
		
		
		System.out.println(hashTable);
		
		//get 테스트
		System.out.println(hashTable.get("banana"));
		System.out.println(hashTable.get("melon"));
		System.out.println();
		
		//remove 테스트
		System.out.println("banana");
		System.out.println("strong very");
		System.out.println("melon");
		System.out.println();
		
		//contains 테스트
		
		// size 테스트
		
		// isEmpty 테스트
	}
	private static class HashNode<K,V>{
		private K key;
		private V value;
	}
}