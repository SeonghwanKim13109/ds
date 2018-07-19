package com.java.ds;

public class Node<T> {
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
	private Node(T data) {
		super();
		this.data = data;
		this.next = null;
	}
	
	public static<T> Node<T> getInstance(T data) {
		return new Node<T>(data);
	}
	

}
