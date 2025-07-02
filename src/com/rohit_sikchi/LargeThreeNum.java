package com.rohit_sikchi;

import java.util.Scanner;

public class LargeThreeNum {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Number : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int largest;

		if (a >= b) {
			if (a >= c) {
				largest = a;
			} else {
				largest = c;
			}
		} else {
			if (b >= c) {
				largest = b;
			} else {
				largest = c;
			}
		}

		System.out.println("Largest 3 Number : " + largest);

	}
}
