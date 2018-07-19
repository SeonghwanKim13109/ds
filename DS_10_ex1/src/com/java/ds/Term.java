package com.java.ds;

public class Term {
	private double coef;
	private int exp;
	private boolean isPositive;
	
	public double getCoef() {
		return coef;
	}
	public int getExp() {
		return exp;
	}
	public void setCoef(double coef) {
		this.coef = coef;
	}
	
	public boolean isPositive() {
		return isPositive;
	}
	public Term(double coef, int exp) {
		super();
		this.exp = exp;
		this.coef = coef;
		if(coef > 0) 
			isPositive = true;
		else 
			isPositive = false;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if(isPositive) {
			if(exp == 1)
				return "+ "+coef+"x"+" ";
			if(exp == 0)
				return "+ "+coef+" ";
			return "+ "+coef+"x^"+exp+" ";
		}
		else {
			if(exp == 1)
				return "- "+(coef*-1)+"x ";
			if(exp == 0)
				return "- " +(coef*-1)+" ";
			return "- "+(coef*-1)+"x^"+exp+" ";
		}
	}
	
}
