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
		int count = 0;
		Node temp = head;
		while (temp != null) {
			if (temp.getNext() != null)
				System.out.print(temp.toString() + "->");
			else
				System.out.print(temp.toString());
			count++;
			if (count != 0 && count % 5 == 0 && temp.getNext() != null)
				System.out.println();
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
		
		print();
	}

	public void indexOf(T data) {
		int position = contain(data);
		if (position == 0)
			System.out.println(data + " is at " + (position + 1) + "st node");
		else if (position == 1)
			System.out.println(data + " is at " + (position + 1) + "nd node");
		else if (position == 2)
			System.out.println(data + " is at " + (position + 1) + "rd node");
		else if (position == -1)
			System.out.println(data + " isn't in list");
		else
			System.out.println(data + " is at " + (position + 1) + "th node");
	}

	public void remove(T data) {
		Node temp = head;

		if (temp.getData().equals(data))
			head = temp.getNext();
		else {
			while (temp.getNext() != null && !temp.getNext().getData().equals(data))
				temp = temp.getNext();
			if (temp.getNext().getData().equals(data)) {
				Node next = temp.getNext().getNext();
				temp.setNext(next);
			}
		}
		System.out.printf("%2d is removed : ", data);
		print();
	}

	public int contain(T data) {
		int count = 0;
		Node temp = head;
		while (temp != null) {
			if (temp.getData().equals(data))
				return count;
			else {
				temp = temp.getNext();
				count++;
			}
		}
		return -1;
	}
}