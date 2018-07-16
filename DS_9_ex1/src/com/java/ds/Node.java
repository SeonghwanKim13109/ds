package com.java.ds;

public class Node<T>{
	private T data;
	private Node<T> next;
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public Node(T data) {
		this.data = data;
		this.next = null;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.data.toString();
	}
}