package com.java.ds;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Histogram {
	private static int sum;
	
	public static <T> void findNum(ArrayList<T> arrList) {
		HashSet<T> set = new HashSet();

		Iterator<T> iterator_arr = arrList.iterator();
		while (iterator_arr.hasNext()) {
			set.add(iterator_arr.next());
		}
//		System.out.println(set);
		
		FindPair[] fpArr = new FindPair[set.size()];
		Iterator iterator_set = set.iterator();
		int i = 0;
		while (iterator_set.hasNext()) {

			int temp = (Integer) iterator_set.next();
//			System.out.println(temp);
			fpArr[i] = new FindPair(temp, 0);
			i++;
		}
		
		iterator_arr = arrList.iterator();
		while (iterator_arr.hasNext()) {
			int temp = (Integer)iterator_arr.next();
			
			for(int j = 0; j<fpArr.length;j++) {
				if(fpArr[j].equals(temp)) {
					fpArr[j].setCount(fpArr[j].getCount()+1);
					continue;
				}
			}
		}
		
		for(int j = 0; j<fpArr.length;j++) {
			fpArr[j].setComb_num();
			setSum(getSum() + fpArr[j].getComb_num());
		}
		System.out.println("모든 조합쌍의 갯수는 : "+getSum());

	}

	public static int getSum() {
		return sum;
	}

	public static void setSum(int sum_p) {
		sum = sum_p;
	}

}
