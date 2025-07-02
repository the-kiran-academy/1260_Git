package com.Dhanashree;
import java.util.Scanner;

public class WordCounter {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        int wordCount = 0;
	        boolean inWord = false;

	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            
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
