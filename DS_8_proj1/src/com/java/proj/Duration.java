package com.java.proj;

public class Duration extends Event{
	
	private MyDate begin;
	private MyDate end;
	
	public MyDate getBegin() {
		return begin;
	}
	public MyDate getEnd() {
		return end;
	}
	
	public Duration(MyDate begin, MyDate end,String title) {
		super(title);
		this.begin = begin;
		this.end = end;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return title +" "+begin.toString() +" ~" + end.toString();
	}
	
	
}
