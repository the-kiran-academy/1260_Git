package com;

public class PalindromString {

	public static boolean isPalindromString(String str) {

		int start = 0;
		int end = str.length()-1;

		for (int i = 0; i < str.length() / 2; i++) {

			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;

		}
		return true;

	}

	public static void main(String[] args) {

		String str = "madams";
		System.out.println(isPalindromString(str));

	}

}
