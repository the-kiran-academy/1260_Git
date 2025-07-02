package com.adityadeshmukhe;

public class Invertedt {
	    public static void main(String[] args) {
	        int rows = 5; // You can change the number of rows

	        for (int i = 0; i < rows; i++) {
	            // Print leading spaces
	            for (int j = 0; j < i; j++) {
	                System.out.print(" ");
	            }

	            // Print stars
	            for (int k = 0; k < (2 * (rows - i) - 1); k++) {
	                System.out.print("*");
	            }

	            // Move to next line
	            System.out.println();
	        }
	    }
	}


