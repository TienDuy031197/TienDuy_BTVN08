package com.topica.collection;

public class Circle implements Comparable<Circle> {

	private int radius;

	public Circle(int radius) {
		super();
		if (radius > 0) {
			this.radius = radius;
		} else {
			System.out.println("Not satisfied!");
		}
	}

	@Override
	public int compareTo(Circle circle) {
		if (this.radius == circle.radius) {
			return 0;
		} else if (this.radius > circle.radius) {
			return 1;
		}
		return -1;
	}

	public double acreageCircle() {
		return Math.PI * this.radius * this.radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		if (radius > 0) {
			this.radius = radius;
		} else {
			System.out.println("Not satisfied!");
		}
	}

}
