package com.java.ds;

public class Rectangle implements Shape{
	private double width;
	private double height;

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return width * height;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2 * (width + height);
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle : width is " + width + ", height is " + height);
	}

	@Override
	public void showdetail() {
		// TODO Auto-generated method stub
		show();
		System.out.printf("\t- The area is %.2f\n", area());
		System.out.printf("\t- The perimeter is %.2f\n", perimeter());
	}

}
