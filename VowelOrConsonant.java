//program to check vowel or consonant using switch case
package basicprogram;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {

		char ch;// Declare variable
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Character:");
		ch = sc.next().charAt(0);// Taking character input

		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(ch + " is Vowel!");
			break;
		default:
			System.out.println(ch + " is Consonant!");
		}
	}
}
