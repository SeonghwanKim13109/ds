package com.java.proj;

public class Oneday extends Event{
	private MyDate date;
	
	public MyDate getDate() {
		return date;
	}
	
	public Oneday(MyDate date, String title) {
		super(title);
		this.date = date;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return title+" "+date.toString();
	}
	
	
}
