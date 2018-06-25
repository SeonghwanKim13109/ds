package com.java.ds;

import java.util.ArrayList;

public class ArrayShift extends Swap{

	public static<T> void shift(ArrayList<T> arr) {
		for(int i =1; i<arr.size(); i++) {
				swap(arr, 0, i);
		}
	}
}
