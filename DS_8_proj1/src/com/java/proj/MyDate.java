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

	public MyDate(int year, int month, int day) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return year + "/" + month + "/" + day;
	}

	@Override
	public boolean equals(Object mydate) {
		// TODO Auto-generated method stub
		MyDate temp = (MyDate) mydate;

		if (this.year == temp.getYear() && this.month == temp.getMonth() && this.day == temp.getDay())
			return true;
		return false;
	}

	public boolean isIn(MyDate begin, MyDate end) {
		if (this.year > end.getYear() || this.year<begin.getYear())
			return false;
		else {
			if (this.month > begin.getMonth() && this.month < end.getMonth())
				return true;
			else if (this.month == begin.getMonth() && this.day > begin.getDay())
				return true;
			else if (this.month == end.getMonth() && this.day < end.getDay())
				return true;
		}
		return false;
	}

	public boolean isIn(MyDate expire) {
		if (this.month < expire.getMonth())
			return true;
		else if (this.month == expire.getMonth() && this.day < expire.getDay())
			return true;
		return false;
	}
}
