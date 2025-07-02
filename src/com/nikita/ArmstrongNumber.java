package com.nikita;

public class ArmstrongNumber {
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			int num=153,sum=0,original=0;
			while(num!=0) {
				int digit=num%10;
				num/=10;
				sum+=Math.pow(digit, 3);
			}
			if(original==sum)
				System.out.println("armstrong :"+original);
			else
				System.out.println("not armstrong :" + original);
//			System.out.println(original==sum ? " armstrong ": "not armstrong"); 
		}
	}



