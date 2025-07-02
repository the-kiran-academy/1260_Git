package com.pranitashinde;

import java.util.Scanner;

public class Marks_To_Percentage {
	public static void main(String[] args) {
		double outOf=500;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Name of Student : ");
		String name =sc.next();
		
		System.out.print("Enter the Marks of Marathi : ");
		int marathi = sc.nextInt();
		
		System.out.print("Enter the Marks of Hindi : ");
		int hindi = sc.nextInt();
		
		System.out.print("Enter the Marks of English : ");
		int english = sc.nextInt();
		
		System.out.print("Enter the Marks of Maths : ");
		int maths = sc.nextInt();
		
		System.out.print("Enter the Marks of History : ");
		int history = sc.nextInt();
		
		int sumOfMarks = marathi+hindi+english+maths+history;
		System.out.println("Total Marks = " + sumOfMarks);
		
		//(Total Marks / Maximum Marks) × 100
		
	    double percentage = ((double)sumOfMarks / outOf)*100;
		System.out.printf("Total percentage of "+name+" is "+"Percentage = %.2f%%\n", percentage);

	}

}


