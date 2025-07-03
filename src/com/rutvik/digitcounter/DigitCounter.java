package com.rutvik.digitcounter;

import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = 0;
        for (int n = number; n != 0; n = n / 10) {
            count++;
        }

        System.out.println("Number of digits: " + count);
        sc.close();
    }
}