package com.java.ds;

public class Point {
	private double x;
	private double y;
	
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+x+", "+y+")";
	}
	
	
}
