package com;

public class Fibonacci {

	public static void main(String[] args) {
	   // a  b  n
		//0, 1, 1, 2, 3, 5, 8, 13, 21, ...
		
		int a=0;
		int b=1;
		
		System.out.print(a+" ");
		System.out.print(b +" ");
		
		int next;
		
		for(int i=2;i<=10;i++) {
			 next=a+b;
			System.out.print(next +" ");
			a=b;
			b=next;
			
		}

	}
}
