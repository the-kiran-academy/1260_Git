package com.kiran;

public class Vowel {

	public static void main(String[] args) {
		String input = "Hello World";
		String result = input.replaceAll("[AEIOUaeiou]", "");
		System.out.println("String after removing vowels: " + result);
	}

}
