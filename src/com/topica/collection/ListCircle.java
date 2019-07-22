package com.topica.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ListCircle {

	private static Scanner scanner;
	private static final int LEFT = 0;
	private static final int RIGHT = 99;
	private static final int SIZE_RANDOM = 100;

	public static void main(String[] args) {

		List<Circle> listCircle = new ArrayList<Circle>();
		double[] acreageArray = new double[RIGHT + 1];
		Random random = new Random();
		Circle circle;

		for (int i = 0; i < RIGHT + 1; i++) {
			int radius = random.nextInt(SIZE_RANDOM) + 1;
			circle = new Circle(radius);
			acreageArray[i] = circle.acreageCircle();
			listCircle.add(circle);
		}
		Collections.sort(listCircle);
		printList(listCircle);
		Arrays.sort(acreageArray);
		int number = insert();
		double numUpperBound = new SeachLowerUpperBound().upperBound(acreageArray, LEFT, RIGHT, number);
		double numLowerBound = new SeachLowerUpperBound().lowerBound(acreageArray, LEFT, RIGHT, number);
		new HandlerResult().result(numUpperBound, numLowerBound, number, listCircle);

	}

	public static void printList(List<Circle> listCircle) {
		System.out.println("List Circles: ");
		for (int i = 0; i < listCircle.size(); i++) {
			System.out.println(
					"Index: " + i + ", " + listCircle.get(i).getRadius() + ", " + listCircle.get(i).acreageCircle());
		}
	}

	public static int insert() {
		scanner = new Scanner(System.in);
		System.out.println("Number: ");
		int number;
		while (true) {
			try {
				number = scanner.nextInt();
				if (number >= 0)
					break;
				else {
					System.out.println("Retype number: ");
				}
			} catch (Exception e) {
				System.out.println("Requires entering natural number: ");
				scanner.nextLine();
			}
		}
		return number;
	}

}
