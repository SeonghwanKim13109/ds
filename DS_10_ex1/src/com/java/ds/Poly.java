package com.java.ds;

public class Poly extends SingleLinkedList<Term> {
	public void add(Term data) {

		Node<Term> new_node = Node.getInstance(data);
		if (head == null)
			head = new_node;
		else if (head.getData().getExp() < data.getExp()) {
				Node temp = head;
				head = new_node;
				new_node.setNext(temp);
		} else {
			Node<Term> temp = head;
			while(temp!=null && temp.getData().getExp() > data.getExp()&&temp.getNext()!=null)
				temp = temp.getNext();
			if(temp.getNext() == null &&temp.getData().getExp() != data.getExp())
				temp.setNext(new_node);
			else if(temp.getData().getExp() == data.getExp()) {
				double coef = temp.getData().getCoef() + data.getCoef();
				/*System.out.println(temp.getData().getCoef());
				System.out.println(data.toString());
				System.out.println(coef);*/
				if(coef == 0.0) {
					remove(temp.getData());
					return;
				}
				else
					temp.getData().setCoef(coef);
			}
			else {
				Node<Term> next = temp.getNext();
				new_node.setNext(next);
				temp.setNext(new_node);
				
			}
		}
	}
	

	public void print() {
		Node<Term> temp = head;
		while(temp!=null && temp.getNext()!=null) {
			System.out.print(temp.getData().toString());
			temp = temp.getNext();
		}
		System.out.println(temp.getData().toString());
	}
}
