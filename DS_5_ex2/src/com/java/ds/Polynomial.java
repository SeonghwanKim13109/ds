package com.java.ds;

public class Polynomial implements Comparable<Polynomial>{
	private double coef;
	private int exp;
	
	public double getCoef() {
		return coef;
	}
	public void setCoef(double coef) {
		this.coef = coef;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	
	public Polynomial(double coef, int exp) {
		super();
		this.coef = coef;
		this.exp = exp;
	}
	@Override
	public int compareTo(Polynomial next) {
		// TODO Auto-generated method stub
		return exp - next.getExp();
	}
	
}
