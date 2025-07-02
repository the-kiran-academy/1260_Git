package com.Mehul;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class StringFrequency {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        // Convert to lowercase to count characters case-insensitively (optional)
	        input = input.toLowerCase();

	        // Use HashMap to store character frequencies
	        Map<Character, Integer> frequencyMap = new HashMap<>();

	        for (char ch : input.toCharArray()) {
	            if (Character.isLetterOrDigit(ch)) {  // Optionally skip spaces/punctuation
	                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
	            }
	        }

	        // Print character frequencies
	        System.out.println("Character Frequencies:");
	        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }

	        scanner.close();
	    }
	
}