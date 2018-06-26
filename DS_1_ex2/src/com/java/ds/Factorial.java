package com.java.ds;

public class Factorial {
	public static int factorial(int num) {
		if(num == 0 || num==1)
			return 1;
		return num*factorial(num-1);
	}
}
