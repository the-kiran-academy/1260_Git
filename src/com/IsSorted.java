package com;

public class IsSorted {

	public static void main(String[] args) {

		// int arr[] = { 8, 6, 5, 3, 1 };
		int arr[] = { 1, 4, 5, 8, 10 };
		boolean isAssending = true;
		boolean isDesending = true;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				isAssending = false;
			}
			if (arr[i] < arr[i + 1]) {
				isDesending = false;
			}
		}

		System.out.println(isAssending);
		System.out.println(isDesending);

		if (isAssending || isDesending) {
			System.out.println("Sorted");
		}

	}

}
