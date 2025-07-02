package com.tanuja;

import java.util.Scanner;

public class ReplaceS {
	
	    public static void main(String[] args) {
	        // Create Scanner object to take input
	        Scanner sc = new Scanner(System.in);

	        // Input original string
	        System.out.print("Enter the original string: ");
	        String original = sc.nextLine();

	        // Input word to be replaced
	        System.out.print("Enter the word to replace: ");
	        String toReplace = sc.nextLine();

	        // Input new word
	        System.out.print("Enter the new word: ");
	        String newWord = sc.nextLine();

	        // Replace word
	        String result = original.replace(toReplace, newWord);

	        // Output result
	        System.out.println("Updated : " + result);

	        // Close Scanner
	        sc.close();
	    }
	}


