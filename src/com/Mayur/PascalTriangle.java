package com.Mayur;

public class PascalTriangle {
	
	public static void printPascalTriangle(int rows) {
		
        for (int i = 0; i < rows; i++) {
            
            for (int space = 0; space < rows - i; space++) {
                System.out.print(" ");
            }

            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1); 
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        int totalRows = 5; 
        printPascalTriangle(totalRows);
    }
}


