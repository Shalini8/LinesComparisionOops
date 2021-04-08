package com.lc;

public class Main {
	public static void main(String[] args) {
		Point p1 = new Point(4, 5);
		Point p2 = new Point(10, 2);
		Point p3 = new Point(4, 5);
		Point p4 = new Point(10, 2);

		Line l1 = new Line(p1, p2);
		Line l2 = new Line(p3, p4);

		l1.getLength();
		l2.getLength();

		if (l1.equals(l2)) {
			System.out.println("both lines are equal");
		} else {
			System.out.println("both lines are unequal");
			
		}
	}
}
