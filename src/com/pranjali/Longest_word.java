package com.pranjali;
import java.util.Scanner;

public class Longest_word {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get input from user
	        System.out.print("Enter a sentence: ");
	        String input = scanner.nextLine();

	        String[] words = input.split(" ");
	        String longestWord = "";

	        for (String word : words) {
	            if (word.length() > longestWord.length()) {
	                longestWord = word;
	            }
	        }

	        System.out.println("Longest word: " + longestWord);
	        System.out.println("Length: " + longestWord.length());
	        
	        scanner.close();
	    }
	}




