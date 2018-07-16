package com.java.ds;

public class DescendList<Integer> extends SingleLinkedList<Integer>{
	
	public void add(int data) {

		Node new_node = new Node(data);
		if (head == null)
			head = new_node;
		else if ((int)head.getData() < data) {
				Node temp = head;
				head = new_node;
				new_node.setNext(temp);
		} else {
			Node temp = head;
			while (temp.getNext()!=null &&(int)temp.getNext().getData() > data )
				temp = temp.getNext();
			Node next = temp.getNext();
			temp.setNext(new_node);
			new_node.setNext(next);
		}
		size++;
	}
	
	public void print() {
		System.out.println("Descend");
		super.print();
	}
}
