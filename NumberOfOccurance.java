//write a program to find number of occurance of given character
package stringexample;

import java.util.Scanner;

public class NumberOfOccurance {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String str = sc.nextLine();// taking string input
		System.out.print("Enter a character you want to see number of occurance :");
		char ch = sc.next().charAt(0);// taking character input

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch)
				count++;
		}
		System.out.println("Number of occurance is:: " + count);

	}

}
