//Program to count number of vowels from String
package stringexample;

import java.util.Scanner;

public class CountingVowels {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String str = sc.nextLine();// taking string input

		// To count number of vowel
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((ch == 'a' || ch == 'A') || (ch == 'e' || ch == 'E') || (ch == 'i' || ch == 'I')
					|| (ch == 'o' || ch == 'O') || (ch == 'u' || ch == 'U')) {
				count++;
			}
		}
		System.out.println("Number of vowels is:: " + count);
	}

}
