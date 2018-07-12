package com.java.ds;

public interface Shape extends Comparable<Shape>{
	
	public double area();
	
	public double perimeter();
	
	public void show();
	
	public void showdetail();
	
	public default int compareTo(Shape o) {
		// TODO Auto-generated method stub
		if (area() - o.area() > 0)
			return 1;
		else if (area() - o.area() == 0)
			return 0;
		else
			return -1;
	}
}
