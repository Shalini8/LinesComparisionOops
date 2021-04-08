package com.lc;

public class Main {
	public static void main(String[] args) {
		Point p1 = new Point(4, 5);
		Point p2 = new Point(10, 2);

	Line l1 = new Line(p1, p2);
	System.out.println (l1.getLength());	
	}
	}

