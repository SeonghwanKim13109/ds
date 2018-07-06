package com.java.ds;

public class Polynomial {
	private String name;
	private Term[] terms = new Term[100];
	private int nTerm = 0;
	
	
	public String getName() {
		return name;
	}
	public void add(double coef, int exp) {
		
		for(int i = 0; i<nTerm ; i++) {
			double result;
			if(terms[i].getExp() == exp) {
				result = terms[i].getCoef() + coef;
				if(result == 0) {
					for(int j = i+1; j<nTerm;j++) {
						terms[j-1] = terms[j];
					}
					nTerm--;
				}
				terms[i].setCoef(result);
				break;
			}
		}
		terms[nTerm] = new Term(coef,exp);
		nTerm++;
		BbSort.bubbleSort(terms,nTerm);
	}
	public void print() {
		for(int i = 0; i<nTerm ; i++) {
			terms[i].print();
			if(i==nTerm-1)
				break;
			System.out.print(" + ");
		}
		System.out.println();
	}
	
	public double calc(double value) {
		double sum = 0;
		for(int i = 0 ; i<nTerm;i++) {
			sum+= terms[i].calc(value);
		}
		return sum;
	}

	public Polynomial(String name) {
		super();
		this.name = name;
	}
	
}
