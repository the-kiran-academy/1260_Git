package com.gargade;

public class Odd_Numbers {

	public static void main(String[] args) {
		System.out.println("Odd numbers from 1 to 20:");
		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}
}
