package com.java.ds;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import jdk.nashorn.internal.runtime.arrays.IteratorAction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String cmd;
		boolean isNotExit = true;
		ArrayList<String> s_ArrList = new ArrayList();
		ArrayList<ArrayList> a_ArrayList = new ArrayList();

		while (isNotExit) {
			System.out.print("$");
			cmd = scan.next();
			if (cmd.equals("create")) {
				String name = scan.next();
				if (s_ArrList.contains(name)) {
					System.out.println("Function " + name + "already exist");
					break;
				}
				s_ArrList.add(name);
			} else if (cmd.equals("add")) {
				String name = scan.next();
				double coef = scan.nextDouble();
				int exp = scan.nextInt();
				Polynomial py = new Polynomial(coef, exp);
				int idx;

				if (!s_ArrList.contains(name)) {
					ArrayList<Polynomial> p_ArrList = new ArrayList();
					p_ArrList.add(py);
					a_ArrayList.add(p_ArrList);
					continue;
				}
				idx = s_ArrList.indexOf(name);
				if(a_ArrayList.size()<=idx) {
					ArrayList<Polynomial> p_ArrList = new ArrayList();
					p_ArrList.add(py);
					a_ArrayList.add(p_ArrList);
					continue;
				}
				for (int i = 0; i < a_ArrayList.get(idx).size(); i++) {
					Polynomial temp = (Polynomial) a_ArrayList.get(idx).get(i);
					if (temp.getExp() == exp) {
						temp.setCoef(temp.getCoef() + coef);
						if (temp.getCoef() == 0) {
							a_ArrayList.get(idx).remove(i);
						}
						break;
					} else if (temp.getExp() < exp) {
						a_ArrayList.get(idx).add(i, py);
						break;
					} else if (i == a_ArrayList.get(idx).size() - 1) {
						a_ArrayList.get(idx).add(py);
						break;
					}
				}
			} else if (cmd.equals("calc")) {
				String name = scan.next();
				double value = scan.nextDouble();
				int idx;
				if (s_ArrList.contains(name))
					idx = s_ArrList.indexOf(name);
				else {
					System.out.println("Function " + name + "not exist");
					break;
				}
				Iterator<Polynomial> iterator = a_ArrayList.get(idx).iterator();
				double sum = 0;
				while (iterator.hasNext()) {
					Polynomial temp = iterator.next();
					sum += temp.getCoef() * Math.pow(value, temp.getExp());
				}
				System.out.println(sum);
			} else if (cmd.equals("print")) {
				String name = scan.next();
				int idx;
				if (s_ArrList.contains(name))
					idx = s_ArrList.indexOf(name);
				else {
					System.out.println("Function " + name + "not exist");
					break;
				}
				Iterator<Polynomial> iterator = a_ArrayList.get(idx).iterator();

				while (iterator.hasNext()) {
					Polynomial temp = iterator.next();
					System.out.print(temp.getCoef()+"x^"+temp.getExp()+"+");
				}
				System.out.println();
			}
			else if(cmd.equals("exit")) {
				isNotExit = false;
			}
		}
		scan.close();
	}

}
