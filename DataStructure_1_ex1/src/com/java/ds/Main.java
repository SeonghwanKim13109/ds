package com.java.ds;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList();
		Scanner scan = new Scanner(System.in);
		boolean while_flag = true;
		while(while_flag) {
			int temp = scan.nextInt();
			if(temp < 0)
				while_flag = false;
			else
				arr.add(temp);
		}
		Iterator<Integer> iterator = arr.iterator();
		/*while(iterator.hasNext()) {
			System.out.print(iterator.next()+ " ");
		}
		System.out.println();*/
		
		ArrayShift.shift(arr);
		
//		iterator = arr.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+ " ");
		}
		System.out.println();
	}

}
