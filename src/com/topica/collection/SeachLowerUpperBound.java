package com.topica.collection;

public class SeachLowerUpperBound {

	public double upperBound(double[] a, int left, int right, double k) {
		int i = (left + right) / 2;
		while (left != i && i != right) {
			if (a[i] >= k)
				right = i;
			else
				left = i;
			i = (left + right) / 2;
		}
		double resurt = -1;
		for (int j = left; j <= right; j++) {
			if (a[j] >= k) {
				resurt = a[j];
				break;
			}
		}
		return resurt;
	}

	public double lowerBound(double[] a, int left, int right, double k) {
		int i = (left + right) / 2;
		while (left != i && i != right) {
			if (a[i] > k)
				right = i;
			else
				left = i;
			i = (left + right) / 2;
		}
		double resurt = -1;
		for (int j = right; j >= left; j--) {
			if (a[j] <= k) {
				resurt = a[j];
				break;
			}
		}
		return resurt;
	}
}
