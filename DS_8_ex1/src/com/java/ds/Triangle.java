package com.java.ds;

public class Triangle implements Shape {
	private double width;
	private double height;
	
	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0.5*height*width;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*Math.pow(Math.pow(width/2, 0.5)+Math.pow(height, 2), 0.5)+width;
	}

	public Triangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Triangle : width is "+width+", height is "+height);

	}

	@Override
	public void showdetail() {
		// TODO Auto-generated method stub
		show();
		System.out.printf("\t- The area is %.2f\n",area());
		System.out.printf("\t- The perimeter is %.2f\n",perimeter());
	}
	
}
