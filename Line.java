package com.lc;

public class Line {
	Point p1;
	Point p2;
	Double length;

	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;

	}

	double getLength() {
		double distance;
		distance = Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
		this.length = distance;
		return distance;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Line other = (Line) obj;
		if (other.length == null)
			return false;
		if (this.length == null)
			return false;
		if (!this.length.equals(other.length))
			return false;
//		if (p1 == null) {
//			if (other.p1 != null)
//				return false;
//		} else if (!p1.equals(other.p1))
//			return false;
//		if (p2 == null) {
//			if (other.p2 != null)
//				return false;
//		} else if (!p2.equals(other.p2))
		// return false;
		return true;
	}
	
	

}
