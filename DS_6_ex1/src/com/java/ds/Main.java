package com.java.ds;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean isNotExit = true;
		Polynomial[] polys = new Polynomial[100];
		int polyNum = 0;
		
		while (isNotExit) {
			String cmd;
			System.out.print("$ ");
			cmd = scan.next();

			if (cmd.equals("create")) {
				String name = scan.next();
				for (int i = 0; i < polyNum; i++) {
					if (polys[i].getName().equals(name)) {
						System.out.println("Poly " + polys[i].getName() + " already exist");
						break;
					}
				}
				polys[polyNum] = new Polynomial(name);
				polyNum++;
			} else if (cmd.equals("add")) {
				String name = scan.next();
				double coef = scan.nextDouble();
				int exp = scan.nextInt();
				int idx = -1;

				for (int i = 0; i < polyNum; i++) {
					if (polys[i].getName().equals(name)) {
						idx = i;
						break;
					}
				}

				if (idx == -1) {
					System.out.println("Poly " + name + " not exist");
					break;
				}
				Polynomial temp = polys[idx];
				temp.add(coef, exp);

			} else if (cmd.equals("calc")) {
				String name = scan.next();
				double value = scan.nextDouble();
				int idx = -1;

				for (int i = 0; i < polyNum; i++) {
					if (polys[i].getName().equals(name)) {
						idx = i;
						break;
					}
				}

				if (idx == -1) {
					System.out.println("Poly " + name + "not exist");
					break;
				}
				Polynomial temp = polys[idx];
				System.out.println(temp.calc(value));

			} else if (cmd.equals("print")) {
				String name = scan.next();
				int idx = -1;

				for (int i = 0; i < polyNum; i++) {
					if (polys[i].getName().equals(name)) {
						idx = i;
						break;
					}
				}

				if (idx == -1) {
					System.out.println("Poly " + name + "not exist");
					break;
				}
				Polynomial temp = polys[idx];
				temp.print();
				
			} else if (cmd.equals("exit")) {
				isNotExit = false;
			} else {
				System.out.println("No such command");
			}
		}
		scan.close();
	}

}
