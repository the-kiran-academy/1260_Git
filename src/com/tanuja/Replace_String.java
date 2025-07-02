package com.tanuja;

import java.util.Scanner;

public class Replace_String {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter the original string: ");
        String original = sc.nextLine();

       
        System.out.print("Enter the word to replace: ");
        String toReplace = sc.nextLine();

        
        System.out.print("Enter the new word: ");
        String newWord = sc.nextLine();

       
        String result = original.replace(toReplace, newWord);

       
        System.out.println("Updated string: " + result);

       
        sc.close();

	}

}
