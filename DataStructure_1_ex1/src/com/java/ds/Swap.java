package com.java.ds;

import java.util.ArrayList;

public class Swap {
	public static <T> void swap(ArrayList<T> arr,int i,int j) {
		T temp = arr.get(i);
		//System.out.println("temp : " +temp);
		arr.set(i, arr.get(j)) ;
		//System.out.println("i : " +arr.get(i));
		arr.set(j, temp);
		//System.out.println("j : "+ arr.get(j));
	}
}
