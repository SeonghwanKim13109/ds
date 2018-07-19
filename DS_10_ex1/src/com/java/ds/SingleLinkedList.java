package com.java.ds;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SingleLinkedList<T> {
	protected Node<T> head;
	protected int size;
	
	public SingleLinkedList() {
		// TODO Auto-generated constructor stub
		head = null;
		size = 0;
	}

	public Node<T> getHead() {
		return head;
	}

	public int getSize() {
		return size;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}
	
	public void add(T data) {
		Node<T> new_node = Node.getInstance(data);
		if(head == null)
			head = new_node;
		else {
			Node<T> temp = head;
			while(temp.getNext()!=null)
				temp = temp.getNext();
			temp.setNext(new_node);
		}
		size++;
	}
	
	public void print() {
		Node<T> temp = head;
		while(temp!=null && temp.getNext()!=null) {
			System.out.print(temp.getData().toString()+"->");
			temp = temp.getNext();
		}
		System.out.println(temp.getData().toString());
	}
	
	public void remove(T data) {
		Node<T> temp = head;

		if (temp.getData().equals(data))
			head = temp.getNext();
		else {
			while (temp.getNext() != null && !temp.getNext().getData().equals(data))
				temp = temp.getNext();
			if (temp.getNext().getData().equals(data)) {
				Node<T> next = temp.getNext().getNext();
				temp.setNext(next);
			}
		}
		/*System.out.println(data.toString()+" is removed");
		print();*/
	}
	
	public Iterator<T> iterator(){
		
		return new MyIterator<T>();
	}
	
	private class MyIterator<T> implements Iterator<T>{
		private Node<T> nextNode;
		
		public MyIterator() {
			nextNode = (Node<T>)getHead();
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return nextNode!=null;
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
			if(nextNode==null)
				throw new NoSuchElementException();
			Node<T> temp = nextNode;
			nextNode = nextNode.getNext();
			return temp.getData();
		}
		
		public void remove() {
			
		}
	}
}
