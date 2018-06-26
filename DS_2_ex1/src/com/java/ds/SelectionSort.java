package com.java.ds;

public class SelectionSort {
	public static void s_sort(int[] arr , int last_index , int data) {
		int j = last_index-1;
		while(j>=0&& arr[j]>data) {
			arr[j+1] = arr[j];
			j--;
		}
		arr[j+1] = data;
	}
}
