package com;

public class CapitalFirstLetter {

	public static void main(String[] args) {
		// Convert first letter of each word to uppercase

		String headline = "Welcome To Zemoso";

		String updated = "";

		String[] headLineArray = headline.split(" ");

		for (int i = 0; i < headLineArray.length; i++) {
			char ch = headLineArray[i].charAt(0);
			char upperCaseCharacter = (char) (ch+32);

			String replace = headLineArray[i].replace(ch, upperCaseCharacter);

			updated += replace+" ";

		}

		System.out.println(updated);

	}

}
