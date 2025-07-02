package com.nikhil;
import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number here : ");
		int num = sc.nextInt();
		
		int first = 0;
		int second = 1;
		
		for(int i = 0; i <= num ; i++) {
			System.out.print(first + " ");
			int next = first + second;
			first = second;
			second = next;
		}
		
		sc.close();
	}

}
