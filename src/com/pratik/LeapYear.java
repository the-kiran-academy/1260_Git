package com.pratik;

public class LeapYear {
	public static void main(String[] args) {
        int year = 2024; 
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }
    }

}
