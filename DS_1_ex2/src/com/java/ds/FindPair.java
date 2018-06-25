package com.java.ds;

import java.util.ArrayList;

public class FindPair {
	private int number;
	private int count;
	private int comb_num;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getComb_num() {
		return comb_num;
	}
	public void setComb_num() {
		comb_num = Combination.combination(count, 2);
	}
	public FindPair(int number, int count) {
		super();
		this.number = number;
		this.count = count;
	}
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		int temp = (Integer)arg0;
		if(this.number == temp)
			return true;
		else
			return false;
	}
	
	
}
