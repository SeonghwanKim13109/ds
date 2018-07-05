package com.java.ds;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Point p1 = PointMake.point(scan.nextDouble(), scan.nextDouble());
		Point p2 = PointMake.point(scan.nextDouble(), scan.nextDouble(),scan.nextDouble());
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		System.out.println(p2.distance(PointMake.point(0, 0)));
		System.out.println(PointMake.point(0, 0).distance(PointMake.point(1, 1, 1)));
		System.out.println(PointMake.point(1, 1, 1).distance(PointMake.point(0,0)));
	}

}
