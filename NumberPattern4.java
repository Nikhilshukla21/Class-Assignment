//Program to print given pattern
/*
   		 1 
       1 2 3 
     1 2 3 4 5 
   1 2 3 4 5 6 7 
 1 2 3 4 5 6 7 8 9 
 */
package com.patternexample;

public class NumberPattern4 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i = i + 2) {// For row
			for (int j = 9; j >= i; j--) {// For Space
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {// For column
				System.out.print(k + " ");
			}
			System.out.println();// New line for next row

		}
	}
}
