package com;

public class Prime {

	public static boolean isPrime(int num) {
		int counter = 0;
		for (int i = 2; i < num; i++) {
			if (counter > 1) {
				return false;
			} else {
				if (num % i == 0) {
					counter = counter + 1;
				}
			}
		}

		return true;

	}

	public static void main(String[] args) {
		boolean isPrime = Prime.isPrime(17);
		System.out.println(isPrime);
	}

}
