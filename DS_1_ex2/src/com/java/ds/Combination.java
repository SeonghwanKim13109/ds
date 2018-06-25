package com.java.ds;

public class Combination{
	public static int combination(int first, int second) {
		
		int up,down;
		up = down =1;
		
		if(first<=0 || second<=0 || first<second) {
			System.out.println("Cannot calculate");
			return 0;
		}
		
		for(int i = first ; i<=first-second ; i--) {
			up *= i;
		}
		
		for(int i = 1 ; i<=second; i++) {
			down *= i;
		}
		
		return up/down;
	}
}
