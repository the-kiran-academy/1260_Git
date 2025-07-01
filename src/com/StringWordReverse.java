package com;

public class StringWordReverse {

	public static String reverseWord(String str) {

		String[] strArray = str.split(" ");
		String reversed = "";

		for (int i = 0; i < strArray.length; i++) {
			String word = strArray[i];

			String revWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				System.out.print(word.charAt(j));
				revWord += word.charAt(j);

			}
			revWord = " " + revWord;
			reversed += revWord;
			System.out.print(" ");

		}

		return reversed;
	}

	public static void main(String[] args) {
		String reverseWord = reverseWord("hello ram");
		System.out.println(reverseWord);

	}

}
