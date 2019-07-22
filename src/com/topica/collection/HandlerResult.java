package com.topica.collection;

import java.util.List;

public class HandlerResult {

	public void result(double numUpperBound, double numLowerBound, int number, List<Circle> listCircle) {
		System.out.println("=====RESULT=====");
		if (numLowerBound == numUpperBound) {
			lowerEqualUpper(numLowerBound, listCircle);
		} else if (numLowerBound != numUpperBound && (numUpperBound - number) == (number - numLowerBound)) {
			minusEqual(numUpperBound, numLowerBound, listCircle);
		} else if (numLowerBound < 0) {
			lowerBoundNegative(numUpperBound, listCircle);
		} else if (numUpperBound < 0) {
			upperBoundNegative(numLowerBound, listCircle);
		} else {
			minusOther(numUpperBound, numLowerBound, number, listCircle);
		}
	}

	public void lowerEqualUpper(double numLowerBound, List<Circle> listCircle) {
		for (int i = 0; i < listCircle.size(); i++) {
			if (listCircle.get(i).acreageCircle() == numLowerBound) {
				double check = numLowerBound;
				System.out.println("Index: " + i + ", Acreage Circle: " + listCircle.get(i).acreageCircle());
				if (check != listCircle.get(i + 1).acreageCircle())
					break;
			}
		}
	}

	public void minusEqual(double numUpperBound, double numLowerBound, List<Circle> listCircle) {
		for (int i = 0; i < listCircle.size(); i++) {
			if (listCircle.get(i).acreageCircle() == numLowerBound) {
				System.out.println("Index: " + i + ", Acreage Circle: " + listCircle.get(i).acreageCircle());
			}
			if (listCircle.get(i).acreageCircle() == numUpperBound) {
				double check = numLowerBound;
				System.out.println("Index: " + i + ", Acreage Circle: " + listCircle.get(i).acreageCircle());
				if (check != listCircle.get(i + 1).acreageCircle())
					break;
			}
		}
	}

	public void minusOther(double numUpperBound, double numLowerBound, int number, List<Circle> listCircle) {
		double num;
		double num1 = numUpperBound - number;
		double num2 = number - numLowerBound;
		if (num1 < num2)
			num = numUpperBound;
		else
			num = numLowerBound;
		for (int i = 0; i < listCircle.size(); i++) {
			if (listCircle.get(i).acreageCircle() == num) {
				double check = num;
				System.out.println("Index: " + i + ", Acreage Circle: " + listCircle.get(i).acreageCircle());
				if (check != listCircle.get(i + 1).acreageCircle())
					break;
			}
		}
	}

	public void lowerBoundNegative(double numUpperBound, List<Circle> listCircle) {
		for (int i = 0; i < listCircle.size(); i++) {
			if (listCircle.get(i).acreageCircle() == numUpperBound) {
				double check = numUpperBound;
				System.out.println("Index: " + i + ", Acreage Circle: " + listCircle.get(i).acreageCircle());
				if (check != listCircle.get(i + 1).acreageCircle())
					break;
			}
		}
	}

	public static void upperBoundNegative(double numLowerBound, List<Circle> listCircle) {
		for (int i = listCircle.size() - 1; i >= 0; i--) {
			if (listCircle.get(i).acreageCircle() == numLowerBound) {
				double check = numLowerBound;
				System.out.println("Index: " + i + ", Acreage Circle: " + listCircle.get(i).acreageCircle());
				if (check != listCircle.get(i - 1).acreageCircle())
					break;
			}
		}
	}
}
