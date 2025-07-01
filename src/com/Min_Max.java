package com;

public class Min_Max {

	public static void main(String[] args) {
		
		int arr[]= {4,7,8,3,6};
		
		int min=arr[0];
		int max=arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		System.out.println("min "+ min);
		System.out.println("max "+ max);
		
	}
}
