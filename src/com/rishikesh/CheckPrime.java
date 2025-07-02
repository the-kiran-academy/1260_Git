package com.rishikesh;

import java.util.Scanner;

public class CheckPrime {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number: ");
	 int num = sc.nextInt();
	 boolean isPrime = true;
	 
	 if(num <=1) {
		isPrime = false;
		
		 
	 }
	 else {
		   for (int i=2; i<num; i++ ) {
			   if (num% i ==0) {
				   isPrime = false;
				   break;
				   
			   }
		   }
	 }
	 
 if (isPrime)
	 System.out.println( num + " is a Prime number .");
 else System.out.println( num + " is not prime number.");
 
	 
			
}
 
}
