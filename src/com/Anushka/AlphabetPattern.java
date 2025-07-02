package com.Anushka;

public class AlphabetPattern {
	 public static void main(String[] args) {
	        int rows = 5;  // You can change the number of rows here

	        for (int i = 1; i <= rows; i++) {
	            for (char ch = 'A'; ch < 'A' + i; ch++) {
	                System.out.print(ch);
	            }
	            System.out.println();
	        }
	    }
}
