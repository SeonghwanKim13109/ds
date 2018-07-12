package com.java.proj;

public class Deadline extends Event{
	private MyDate expire;

	public MyDate getExpire() {
		return expire;
	}

	public Deadline(MyDate expire,String title) {
		super(title);
		this.expire = expire;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return title+" "+expire.toString();
	}
	
	
}
