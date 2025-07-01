package com;

public class Even_Sum_Order {

	public static void main(String[] args) {

		int upto = 10;
		int[] even = new int[upto / 2];
		int[] odd = new int[upto / 2];

		int evenIndex = 0;
		int oddIndex = 0;
		for (int i = 1; i <= upto; i++) {

			if (i % 2 == 0) {
				even[evenIndex] = i;
				evenIndex++;
			} else {
				odd[oddIndex] = i;
				oddIndex++;
			}
		}

//		for (int i = 0, j = upto / 2 - 1; i < upto / 2; i++,j--) {
//			System.out.print(even[i] + " ");
//			System.out.print(odd[j] + " ");
//
//		}

		for (int i = 0; i < upto / 2; i++) {
			System.out.print(even[i] + " ");
		}

		for (int i = upto / 2 - 1; i >= 0; i--) {
			System.out.print(odd[i] + " ");
		}
	}

}
