package com.vishal;

import java.util.Scanner;

public class Check_String_Palindrome {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String.");
		String str = in.nextLine();

		String reversed = new StringBuilder(str).reverse().toString();

		if (str.equals(reversed)) {
			System.out.println(str + " is a palindrome.");
		} else {
			System.out.println(str + " is not a palindrome.");
		}
	}

}
