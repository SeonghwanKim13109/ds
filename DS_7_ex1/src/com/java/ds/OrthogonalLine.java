package com.java.ds;

public class OrthogonalLine {
	private Point p1;
	private Point p2;
	private boolean horizontal;
	private boolean vertical;
	
	
	public boolean isHorizontal() {
		return horizontal;
	}

	public boolean isVertical() {
		return vertical;
	}

	public Point getP1() {
		return p1;
	}

	public Point getP2() {
		return p2;
	}

	public OrthogonalLine(Point p1, Point p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		if(p1.getX() == p2.getX()) {
			horizontal = false;
			vertical = true;
		}else if(p1.getY() == p2.getY()) {
			horizontal = true;
			vertical = false;
		}
		if(p1.getX() > p2.getX() || p1.getX() == p2.getX() && p1.getY()>p2.getY())
			swap();
	}
	
	public OrthogonalLine(double x1,double y1, double x2, double y2) {
		p1 = new Point(x1,y1);
		p2 = new Point(x2,y2);
		if(x1 == x2) {
			horizontal = false;
			vertical = true;
		}else if(y1 == y2) {
			horizontal = true;
			vertical = false;
		}
			
	}
	private void swap() {
		Point temp = p1;
		p1 = p2;
		p2 = temp;
	}
	public boolean isIntersect(OrthogonalLine o) {
		if(horizontal && o.isHorizontal() || vertical&&o.isVertical())
			return false;
		else if(horizontal && o.isVertical() && 
				(p1.getX()==o.getP1().getX()||p1.getX() == o.getP2().getX() || p2.getX() == o.getP1().getX() || p2.getX() == o.getP2().getX()) 
				) return true;
		else if(vertical && o.isHorizontal() &&
				(p1.getX()==o.getP1().getX()||p1.getX() == o.getP2().getX() || p2.getX() == o.getP1().getX() || p2.getX() == o.getP2().getX())
				) return true;
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "x1 : " +p1.getX()+" y1 : " + p1.getY() + " x2 : " +p2.getX()+" y2 : " + p2.getY();
	}
	
}
