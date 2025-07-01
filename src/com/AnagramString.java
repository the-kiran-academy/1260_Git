package com;

public class AnagramString {

	public static String sortString(String str) {

		char[] charArray = new char[str.length()];

		for (int i = 0; i < str.length() ; i++) {
			charArray[i] = str.charAt(i);
		}

		for (int i = 0; i < charArray.length - 1; i++) {

			for (int j = 0; j < charArray.length - i - 1; j++) {

				if (charArray[j] > charArray[j + 1]) {
					char temp = charArray[j];
					charArray[j] = charArray[j + 1];
					charArray[j + 1] = temp;
				}

			}

		}
		String sortedString = "";
		for (int i = 0; i < charArray.length; i++) {
			sortedString += charArray[i];
		}

		return sortedString;

	}

	public static void main(String[] args) {

		String first = "listen";
		String second = "silent";

		String firstSortedString = sortString(first);
		String secondSortedString = sortString(second);

		System.out.println(firstSortedString);
		System.out.println(secondSortedString);

		if (firstSortedString.equals(secondSortedString)) {
			System.out.println("Are anagrams ");
		}

	}

}
