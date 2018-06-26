package com.java.ds;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		Scanner scan = new Scanner(System.in);
		size = scan.nextInt();
		int[] arr = new int[size];
		
		for(int i =0; i<arr.length; i++) {
			int data = scan.nextInt();
			
			SelectionSort.s_sort(arr, i, data);
			
			for(int j = 0 ; j<=i ; j++)
				System.out.print(arr[j]+" ");
			System.out.println();
		}
	}

}
