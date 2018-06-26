package com.java.ds;

public class Combination{
	public static int combination(int n, int r) {
		
		int up,down;
		up = down =1;
		
		if(n<=0 || r<=0 || n<r) {
	/*		System.out.println("first : " + first +" second : "+second);
			System.out.println("Cannot calculate");*/
			return 0;
		}

		up = Factorial.factorial(n);
		down = Factorial.factorial(r) * Factorial.factorial(n-r);
		
		return up/down;
	}
}
