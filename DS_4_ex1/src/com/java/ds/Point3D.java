package com.java.ds;

public class Point3D implements Point {
	private double x;
	private double y;
	private double z;
	
	private Point3D(){
		
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getZ() {
		return z;
	}
	private Point3D(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public static Point getInstance(double x, double y, double z) {
		Point pt = new Point3D(x, y, z);
		return pt;
	}
	@Override
	public void move(Point point) {
		// TODO Auto-generated method stub
		if(point instanceof Point3D) {
			this.x += ((Point3D) point).getX();
			this.y += ((Point3D) point).getY();
			this.z += ((Point3D) point).getZ();
		}else if(point instanceof Point2D){
			this.x += ((Point3D) point).getX();
			this.y += ((Point3D) point).getY();
		}
	}

	@Override
	public double distance(Point point) {
		// TODO Auto-generated method stub
		double dis = 0;
		if(point instanceof Point3D) {
			dis += Math.pow(this.x- ((Point3D)point).getX(), 2);
			dis += Math.pow(this.y- ((Point3D)point).getY(), 2);
			dis += Math.pow(this.z- ((Point3D)point).getZ(), 2);
		}else if(point instanceof Point2D){
			dis += Math.pow(this.x- ((Point2D)point).getX(), 2);
			dis += Math.pow(this.y- ((Point2D)point).getY(), 2);
		}
		dis = Math.pow(dis, 0.5);
		return dis;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "x : "+ x +"\ny : "+y +"\nz : "+z;
	}
	
}
