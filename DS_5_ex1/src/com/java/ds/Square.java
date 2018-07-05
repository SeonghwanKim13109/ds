package com.java.ds;

public class Square implements Comparable<Square> {
	private double up_x;
	private double up_y;
	private double down_x;
	private double down_y;
	private double area;
	
	public int getUp_x() {
		return (int)up_x;
	}
	public int getUp_y() {
		return (int)up_y;
	}
	public int getDown_x() {
		return (int)down_x;
	}
	public int getDown_y() {
		return (int)down_y;
	}
	
	public double getArea() {
		return area;
	}
	public Square(double up_x, double up_y, double down_x, double down_y) {
		super();
		this.up_x = up_x;
		this.up_y = up_y;
		this.down_x = down_x;
		this.down_y = down_y;
		this.area =Math.abs(up_x-down_x)*Math.abs(up_y-down_y);
	}
	@Override
	public int compareTo(Square next_square) {
		// TODO Auto-generated method stub
		return (int)(getArea()-next_square.getArea());
	}
	
}
