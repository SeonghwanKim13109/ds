package com.java.ds;

public class SingleLinkedList<T> {
	protected Node head;
	protected int size = 0;

	public Node getHead() {
		return head;
	}

	public SingleLinkedList() {
		super();
		this.head = null;
	}

	public void add(T data) {
		Node temp;
		if (head == null) {
			temp = new Node(data);
			head = temp;
		} else {
			temp = head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			Node new_node = new Node(data);
			temp.setNext(new_node);
		}
		size++;
	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.toString());
			temp = temp.getNext();
		}
		System.out.println();
	}

	public void invert() {
		Node middle = head;
		if (middle == null)
			return;
		Node lead = middle.getNext();
		Node trail = null;
		if (lead == null)
			return;
		while (lead != null && lead.getNext() != null) {
			middle.setNext(trail);
			trail = middle;
			middle = lead;
			lead = lead.getNext();
		}
		middle.setNext(trail);
		lead.setNext(middle);
		head = lead;
	}
}