package com.Shubham;

public class Find_LCM {
    public static void main(String[] args) {
        int num1 = 12, num2 = 18;
        int lcm = (num1 * num2) / gcd(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }

    static int gcd(int a, int b) {
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }
}
