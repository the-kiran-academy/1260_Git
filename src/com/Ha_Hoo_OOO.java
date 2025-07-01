package com;

public class Ha_Hoo_OOO {

	public static void main(String[] args) {
		
		for (int i = 1; i <=100; i++) {
			
			if(i%3==0 && i%5==0) {
				System.out.println(i +" : OOO");
			}else if(i%3==0) {
				System.out.println(i+" : Ha");
			}
			else if(i%5==0) {
				System.out.println(i+" : Hoo");
			}
			else {
				System.out.println(i);
			}
		}

	}

}
