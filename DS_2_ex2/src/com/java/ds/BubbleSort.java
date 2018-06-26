package com.java.ds;

import java.util.ArrayList;

public class BubbleSort {
	public static void bubSort(ArrayList<String> arr_s, ArrayList<Integer> arr_n) {
		for (int i = arr_s.size()-1; i >0 ; i--) {
			for (int j = 0; j < i; j++) {
				String temp1, temp2;

				temp1 = arr_s.get(j);
				temp2 = arr_s.get(j + 1);

				if ((temp1).compareToIgnoreCase(temp2) > 0) {
					int temp_n1 = (Integer) arr_n.get(j);
					int temp_n2 = (Integer) arr_n.get(j + 1);

					arr_s.set(j, temp2);
					arr_s.set(j + 1, temp1);

					arr_n.set(j, temp_n2);
					arr_n.set(j + 1, temp_n1);
				}
			}
		}
	}
}
