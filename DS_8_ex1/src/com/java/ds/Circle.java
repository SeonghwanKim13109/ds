package com.java.ds;

public class Circle implements Shape {
	private final static double PI = 3.141592;
	private double radius;
	
	
	public static double getPi() {
		return PI;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return PI*Math.pow(radius, 2);
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*PI*radius;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Circle : radius is "+radius);
	}

	@Override
	public void showdetail() {
		// TODO Auto-generated method stub
		show();
		System.out.printf("\t- The area is %.2f\n",area());
		System.out.printf("\t- The perimeter is %.2f\n",perimeter());
	}
	
}
