package com.java.ds;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(new File("in.txt"));
			ArrayList<String> arr_s = new ArrayList();
			ArrayList<Integer> arr_i = new ArrayList();
		
			while(scan.hasNext()) {
				String name = scan.next();
				int num = scan.nextInt();
				arr_s.add(name);
				arr_i.add(num);
			}
			System.out.println(arr_s.toString());
			System.out.println(arr_i.toString());
			
			BubbleSort.bubSort(arr_s, arr_i);
			
			System.out.println(arr_s.toString());
			System.out.println(arr_i.toString());
			scan.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
