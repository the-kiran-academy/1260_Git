package com.PrachiPatil;

public class reverseString {
	static void reverse(String str) {
		int left=0;
		int right=str.length()-1;
		char ch[]=str.toCharArray();
		while(left<=right) {
			char temp=ch[left];
			ch[left]=ch[right];
			ch[right]=temp;
			
			left++;
			right--;
		}
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
	}
	public static void main(String[] args) {
		String str="abcd";
		reverse(str);
	}
	
}
