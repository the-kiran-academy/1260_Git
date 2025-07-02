package com.Dhanashree;
import java.util.Scanner;

public class WordCounter {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the string
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        int wordCount = 0;
	        boolean inWord = false;

	        // Loop through each character
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);

	            // Check if the character is a space or not
	            if (ch != ' ' && ch != '\t' && ch != '\n') {
	                if (!inWord) {
	                    wordCount++;
	                    inWord = true;
	                }
	            } else {
	                inWord = false;
	            }
	        }

	        System.out.println("Number of words: " + wordCount);
	    }
	}
