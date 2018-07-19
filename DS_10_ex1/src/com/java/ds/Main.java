package com.java.ds;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	private static int size = 0;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cmd;
		Poly[] arr_pl = new Poly[100];
		
		while(true) {
			System.out.print("$ ");
			cmd = scan.next();
			
			if(cmd.equals("create")) {
				String name = scan.next();
				
				Poly newPoly = new Poly(name);
				arr_pl[size++] = newPoly;
				
			}else if(cmd.equals("add")) {
				String name = scan.next();
				int idx = indexOf(arr_pl, name);
				
				if(idx != -1) {
					double coef = scan.nextDouble();
					int exp = scan.nextInt();
					Term data = new Term(coef, exp);
					
					arr_pl[idx].add(data);
				}
			}else if(cmd.equals("calc")) {
				String name = scan.next();
				int idx = indexOf(arr_pl, name);
				
				if(idx != -1) {
					int value = scan.nextInt();
					System.out.println(arr_pl[idx].calc(value));
				}
			}else if(cmd.equals("print")) {
				String name = scan.next();
				int idx = indexOf(arr_pl, name);
				
				if(idx != -1) {
					arr_pl[idx].print();
				}
			}else if(cmd.equals("exit"))
				break;
		}
	}
	
	public static int indexOf(Poly[] arr_pl,String name) {
		for(int i = 0 ; i<size; i++) {
			if(arr_pl[i].getName().equals(name))
				return i;
		}
		return -1;
	}
}
