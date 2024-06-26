package com.beyond.hash.practice;

import java.util.LinkedList;

public class HashTable<K, V> {
	private int maxSize;

	private LinkedList<HashNode<K, V>>[] buckets;


	//	retrun ㅇㄷ?

	@Override
	public void toString() {
		StringBuilder sb = new StringBuilder();

		for (int i = 0 ; i <this.buckets.length; i ++) {
			LinkedList<HashNode<K,V>> bucket = this.buckets[i];

			sb.append(i).append(":").append(bucket).append(",").append("\n");
		}
		sb.replace(sb.lastIndexOf(",",sb.length()), maxSize, null);
	}

	//	@Override
	//	public String toString() {
	//		return Arrays.toString(buckets);
	//	}

	@SuppressWarnings("unchecked")
	public HashTable(int maxSize) {
		this.maxSize = maxSize;
		this.buckets = new LinkedList[this.maxSize];

		for(int i = 0; i < this.buckets.length; i++) {
			this.buckets[i] = new LinkedList<>();
		}
	}	

	public void put(K key, V value) {
		int index = this.hash(key);

		for (HashNode<K,V> node : buckets[index]) {
			if (node.key.equals(key)){
				node.value = value;

				return;
			}

		}

		buckets[index].add(new HashNode<>(key,value));

	}

	public V get(K key) {
		int index = this.hash(key);

		for(HashNode<K,V> node:buckets[index]) {
			if(node.key == key) {
				return node.value;
			}

		}


		return null;
	}

	public V remove(K key) {
		V value = null;
		int index = this.hash(key);

		for(HashNode<K, V> node:buckets[index]) {
			if(node.key.equals(key)) {

				value = node.value;

				//노드 제거
				buckets[index].remove();

				break;
			}
		}

		return null;
	}

	public boolean contains(K key) {
		boolean result = false;
		
		int index = this.hash(key);
		
		for (HashNode<K, V> node : buckets[index]) {
			if (node.key.equals(key)) {
				return true;
			}
		}
		
		return result;

	}

//	public int size(V value) {
//		return this.size(value);
//	}
	
	public int size() {{
			this.buckets[i].size();
		}
	}

	public boolean isEmpty(K key) {
		int size=0;
		return this.size(null)==0;
	}

	private int hash(K key) {

		return Math.abs(key.hashCode() % this.maxSize);
	}

	private static class HashNode<K, V> {
		private K key;

		private V value;

		private HashNode(K key, V value) {
			this.key = key;
			this.value = value;
		}

		@Override
		public String toString() {
			return "{key=" + key + ", value=" + value + "}";
		}
	}
}