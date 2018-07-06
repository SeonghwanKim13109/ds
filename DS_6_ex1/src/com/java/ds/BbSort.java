package com.java.ds;

public class BbSort {
	public static void bubbleSort(Term[] terms,int nTerm) {
		for(int i = 0; i<nTerm;i++) {
			for(int j = nTerm-1-i ; j>0; j--) {
				if(terms[j].getExp() > terms[j-1].getExp()) {
					Term temp = terms[j];
					terms[j] = terms[j-1];
					terms[j-1] = temp;
				}
			}
		}
	}
}
