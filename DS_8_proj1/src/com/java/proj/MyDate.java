package com.java.proj;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public MyDate(int year,int month,int day) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  year+"/"+month+"/"+day;
	}
	
	
}
