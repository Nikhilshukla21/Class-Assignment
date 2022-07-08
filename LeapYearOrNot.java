package stringexample;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Year :: ");
		year = sc.nextInt();// taking year input

		// Check if the year is divisible by 4
		if (year % 4 == 0) {
			System.out.println(year + " is a leap year!");

		} else {
			System.out.println(year + " is not a leap year.");
		}

	}

}
