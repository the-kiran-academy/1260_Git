package com;

import java.util.Iterator;

public class ArmStrong {

	public static boolean isArmstrong(int num) {
		int original=num;

		int length = String.valueOf(num).length();

		int sum = 0;

		while (num > 0) {
			int number = num % 10;
			System.out.print(number +" : ");

			int numberPower = 1;
			for (int i = 0; i < length; i++) {
				numberPower *= number;
			}
			System.out.println(numberPower);
			num=num/10;;

			sum = sum + numberPower;

		}

		if (sum == original) {
			return true;
		}

		return false;

	}

	public static void main(String[] args) {

		int num = 1634;
		boolean armstrong = isArmstrong(num);
		System.out.println(armstrong);

	}

}
