package com;

import java.util.Scanner;

public class Sum_Even_Order {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("How Many Number");
		int howMany = scanner.nextInt();

		System.out.println("------ Enter below -----");

		int[] numbers = new int[howMany];

		for (int i = 0; i < howMany; i++) {
			numbers[i] = scanner.nextInt();
		}

		System.out.print("Given Numbers : ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}

		int[] even = new int[howMany / 2];
		int[] odd = new int[howMany / 2];

		int evenIndex = 0;
		int oddIndex = 0;

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] % 2 == 0) {
				even[evenIndex] = numbers[i];
				evenIndex++;
			} else {
				odd[oddIndex] = numbers[i];
				oddIndex++;
			}

		}

		for (int i = 0; i < howMany / 2 - 1; i++) {
			for (int j = 0; j < howMany / 2 - 1 - i; j++) {
				if (even[j] > even[j + 1]) {
					int temp = even[j];
					even[j] = even[j + 1];
					even[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < howMany / 2 - 1; i++) {
			for (int j = 0; j < howMany / 2 - 1 - i; j++) {
				if (odd[j] > odd[j + 1]) {
					int temp = odd[j];
					odd[j] = odd[j + 1];
					odd[j + 1] = temp;
				}
			}
		}

		System.out.println();
		System.out.println("After Sort :");
		for (int i = 0; i < howMany / 2; i++) {
			System.out.print(even[i] + " ");
		}

		for (int i = howMany / 2 - 1; i >= 0; i--) {
			System.out.print(odd[i] + " ");
		}

	}

}
