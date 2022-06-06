//Program to print given pattern
/*  1 
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5 
 1 2 3 4 
  1 2 3 
   1 2 
    1 */
package com.patternexample;

public class NumberPattern3 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {// For row
			for (int j = 5; j >= i; j--) {// For space
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {// For Pattern
				System.out.print(k + " ");
			}
			System.out.println();// new line for next row

		}
		// Next part
		for (int i = 4; i >= 1; i--) // For row
		{
			for (int j = 5; j >= i; j--) {// For space
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {// For Pattern
				System.out.print(k + " ");
			}
			System.out.println();// new line for next row
		}
	}
}
