package com.java.ds;

public class Point2D implements Point {
	private double x;
	private double y;
	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	private Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public static Point getInstance(double x, double y) {
		Point pt = new Point2D(x, y);
		return pt;
	}
	@Override
	public void move(Point point) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double distance(Point point) {
		// TODO Auto-generated method stub
		double dis = 0;
		if(point instanceof Point3D) {
			dis += Math.pow(this.x- ((Point3D)point).getX(), 2);
			dis += Math.pow(this.y- ((Point3D)point).getY(), 2);
		}else if(point instanceof Point2D){
			dis += Math.pow(this.x- ((Point2D)point).getX(), 2);
			dis += Math.pow(this.y- ((Point2D)point).getY(), 2);
		}
		return dis;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "x : "+ x +"\ny : "+y +"\n";
	}
	
}
