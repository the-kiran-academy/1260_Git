package com.akhileshsonwani;

public class PrimeInRange {

	 public static void main(String[] args) {
	        int start = 1;
	        int end = 100;

	        System.out.println("Prime numbers between " + start + " and " + end + " are:");

	        for (int num = start; num <= end; num++) {
	            if (isPrime(num)) {
	                System.out.print(num + " ");
	            }
	        }
	    }

	 
	    public static boolean isPrime(int n) {
	        if (n <= 1)
	            return false;

	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0)
	                return false;
	        }
	        return true;
	    }
	
	
}
