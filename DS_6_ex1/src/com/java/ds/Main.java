package com.java.ds;

import java.io.File;
import java.io.FileNotFoundException;
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
				System.out.printf("%.2f\n", temp.calc(value));

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
			} else if (cmd.equals("help")) {
				boolean continue_help = true;
				while (continue_help) {
					System.out.println("create/add/calc/print/exit");
					String fileName = scan.next();
					if (fileName.equals("exit"))
						break;
					else {
						try {
							fileName = fileName.concat(".txt");
							Scanner scan_txt = new Scanner(new File(fileName));
							while (scan_txt.hasNext()) {
								String temp = scan_txt.next();
								if (temp.equals("\\n"))
									System.out.println();
								else
									System.out.print(temp + " ");
							}
							System.out.println();
							scan_txt.close();

						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			} else {
				System.out.println("No such command");
			}
		}
		scan.close();
		/*
		 * try { Scanner scan = new Scanner(new File("add.txt")); while(scan.hasNext())
		 * { String temp = scan.next(); if(temp.equals("\\n")) System.out.println();
		 * else System.out.print(temp + " "); } } catch (FileNotFoundException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); }
		 */

	}

}
