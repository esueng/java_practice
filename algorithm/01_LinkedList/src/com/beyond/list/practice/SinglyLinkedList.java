package com.beyond.list.practice;

public class SinglyLinkedList<T> implements List<T> {
	private Node<T> head; // 첫 번째 노드를 가리키는 참조

	private int size;

	public SinglyLinkedList() {
		this.head = null;
		this.size = 0;
	}

	@Override
	public void addFirst(T data) {
		Node<T> newNode = new Node<>(data);

		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}

		size++;
	}

	public void remove(T data) {
		Node<T> current = head;
		if (current==null) {
			return;
		}
		if(current.data.equals(data)) {
			this.removeFirst();
			return;
		}
		for (int i=0 ; i<size-1 ;i++) {
			this.removeFirst();
			return;
		}
	}
	public boolean contains(T data) {
		Node<T> current = head;

		while(current != null) {
			if (current.data == data) {
				return true;

			}
			current = current.next;
		}
		return false;
	}
	@Override
	public void removeFirst() {
		if (head == null) {
			throw new IndexOutOfBoundsException();
		} else {
			head = head.next;
			size--;

			if (size == 0) {
				head = null;
			}
		}
	}



	@Override
	public void removeLast() {
		if (head == null) {
			return;
		}else {
			Node<T> lastPrevNode = this.search(size - 2);

			lastPrevNode.next.data=null;
			lastPrevNode.next=null;
			size--;
		}
	}

	@Override
	public void remove(int index) {
		if (index<0||index >=size) {
			throw new IndexOutOfBoundsException();
		}
		if(index==0) {
			this.removeFirst();
			return;
		}
		if(index==(size-1)) {
			this.removeLast();
			return;
		}
	}

	@Override

	public void addLast(T data) {
		Node<T> newNode = new Node<>(data);

		if (head == null) {
			head = newNode;
		} else {
			Node<T> lastNode = this.search(size-1);

			lastNode.next = newNode;
		}

		size++;
	}

	@Override
	public void add(int index, T data) {
		// TODO Auto-generated method stub
		if (index <0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		if (index==0) {
			this.addFirst(data);

			return;
		}
		if (index == size) {
			this.addLast(data);

			return;
		}

		Node<T> newNode = new Node<>(data);
		Node<T> prevNode = head;

		for (int i=0; i< index-1 ; i++) {
			prevNode = prevNode.next;
		}
		newNode.next = prevNode.next;
		prevNode.next = newNode;
		size++;

	}

	@Override
	public int size() {

		return this.size;
	}

	@Override
	public T get(int index) {
		if( index<0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		if (index ==0) {
			return head.data;
		}

		Node<T> searchNode = this.search(index);
		return searchNode.data;
	}

	@Override
	public String toString() {
		Node<T> current = head;
		StringBuilder sb = new StringBuilder();

		sb.append("[");

		while(current != null) {
			sb.append(current.data + ", ");

			current = current.next;
		}
		if (sb.lastIndexOf(",")!=-1) {
			sb.replace(sb.lastIndexOf(","), sb.length(), "]");
		} else {
			sb.append("]");
		}
		return sb.toString();
	}


	private Node<T> search(int index){
		Node<T> node = head;

		for (int i=0 ; i<index; i++) {
			node = node.next;
		}

		return node;
	}

	private static class Node<T> {
		private T data; // 노드가 저장하는 데이터

		private Node<T> next; // 다음 노드를 가리키는 참조

		public Node(T data) {
			this.data = data;
			this.next = null;
		}
	}
}