package com;

public class Diplicate_Num {

	public static void main(String[] args) {

		int arr[] = { 1, 6, 2, 4, 1, 7, 8,6 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}

			}
		}
	}

}
