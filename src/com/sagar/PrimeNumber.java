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

	public static void main(String[] args) {
		int number = 29; // Example number to check
		if (isPrime(number)) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}
	}
}
