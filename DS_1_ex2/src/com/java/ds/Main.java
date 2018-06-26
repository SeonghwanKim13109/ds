package com.java.ds;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrList = new ArrayList();
		Scanner scan = new Scanner(System.in);
		while(true) {
			int temp = scan.nextInt();
			if(temp <=0)
				break;
			arrList.add(temp);
		}
		Histogram.findNum(arrList);
	}

}
