package com.java.ds;

public class Term {
	private double coef;
	private int exp;

	public void setCoef(double coef) {
		this.coef = coef;
	}

	public double getCoef() {
		return coef;
	}

	public int getExp() {
		return exp;
	}

	public double calc(double value) {
		return coef * Math.pow(value, exp);
	}

	public Term(double coef, int exp) {
		super();
		this.coef = coef;
		this.exp = exp;
	}

	public void print() {
		if (exp == 0)
			System.out.print(coef);
		else if(exp == 1)
			System.out.print(coef + "x");
		else
			System.out.print(coef + "x^" + exp);
	}
}
