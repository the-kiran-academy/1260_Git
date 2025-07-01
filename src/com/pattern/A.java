package com.pattern;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character (uppercase letter, e.g., A): ");
        char ch = scanner.next().toUpperCase().charAt(0);

        // Check if the character is supported (for now, only 'A')
        if (ch == 'A') {
            printA();
        } else {
            System.out.println("Sorry, only 'A' is supported in this example. Try 'A' or ask for another letter!");
        }

        scanner.close();
    }

    // Method to print 'A' using stars in a 5x5 grid
    private static void printA() {
        String[][] pattern = new String[5][5];
        // Initialize grid with spaces
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                pattern[i][j] = " ";
            }
        }

        // Define the shape of 'A'
        // Top of A
        pattern[0][2] = "*";
        // Slanting sides
        pattern[1][1] = "*"; pattern[1][3] = "*";
        // Middle bar and sides
        pattern[2][0] = "*"; pattern[2][1] = "*"; pattern[2][2] = "*"; pattern[2][3] = "*"; pattern[2][4] = "*";
        // Lower sides
        pattern[3][0] = "*"; pattern[3][4] = "*";
        pattern[4][0] = "*"; pattern[4][4] = "*";

        // Print the pattern
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(pattern[i][j] + " ");
            }
            System.out.println();
        }
    }
}