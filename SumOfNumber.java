//program to find sum of natural numbers from 1 to n
package basicprogram;

import java.util.Scanner;

public class SumOfNumber {
	public static void main(String args[]) {
		int sum = 0;// Variable to calculate the sum
		System.out.print("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();// Taking input from user

		for (int i = 0; i < num; i++) {
			sum = sum + i;
		}
		System.out.println("Sum of numbers is: " + sum);
	}
}