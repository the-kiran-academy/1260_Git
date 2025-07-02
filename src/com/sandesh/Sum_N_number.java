package com.sandesh;

import java.util.Scanner;

public class Sum_N_number {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of N:");
		int n =sc.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println("sum of 1 to "+n+" Number is :"+sum);
		sc.close();
	}
}
