package com.java.ds;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try {

			Scanner scan = new Scanner(System.in);
			SingleLinkedList<Integer> sll = new SingleLinkedList<>();
			String cmd;
			while (true) {
				System.out.print("$ ");
				cmd = scan.next();
				if (cmd.equals("add")) {
					int data = Integer.parseInt(scan.next());
					sll.add(data);
				} else if (cmd.equals("inverse")) {
					sll.invert();
				} else if (cmd.equals("index")) {
					int data = Integer.parseInt(scan.next());
					sll.indexOf(data);
				} else if (cmd.equals("remove")) {
					int data = Integer.parseInt(scan.next());
					sll.remove(data);
				} else if (cmd.equals("print")) {
					sll.print();
				} else if (cmd.equals("exit"))
					break;
			}
			/*
			 * AscendList<Integer> sl = new AscendList<>(); DescendList<Integer> dl = new
			 * DescendList<>(); Scanner scan = new Scanner(new File("in.txt"));
			 * 
			 * while(scan.hasNext()) { int temp = scan.nextInt(); sll.add(temp);
			 * sl.add(temp); dl.add(temp); // System.out.println(temp); } sll.print();
			 * sll.invert(); sll.print();
			 * 
			 * sll.indexOf(10); sll.indexOf(7); sll.indexOf(3); sll.indexOf(4);
			 * sll.indexOf(5); sll.indexOf(1);
			 * 
			 * sll.remove(10); sll.remove(3); sll.remove(4); sll.remove(5); sll.remove(7);
			 * 
			 * sl.print(); dl.print();
			 */
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
