package com.java.ds;

public class PointMake {
	public static Point point(double x, double y) {
		return Point2D.getInstance(x, y);
	}
	public static Point point(double x, double y, double z) {
		return Point3D.getInstance(x, y, z);
	}
}
