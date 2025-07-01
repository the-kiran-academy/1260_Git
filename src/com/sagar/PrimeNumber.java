package com.sagar;

public class PrimeNumber {

	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false; // 0 and 1 are not prime numbers
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false; // Found a divisor, hence not prime
			}
		}
		return true; // No divisors found, hence prime
	}

	void factorial() {
		for (int i = 1; i <= 10; i++) {
			int fact = 1;
			for (int j = 1; j <= i; j++) {
				fact *= j; // Calculate factorial
			}
			System.out.println("Factorial of " + i + " is " + fact);
		}

	}

	public static void main(String[] args) {
		int number = 29; // Example number to check
		if (isPrime(number)) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}
	}
}
