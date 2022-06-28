//write a program to print negative number from an array
package arrayexamples;

import java.util.Scanner;

public class NegativeArray {

	public static void main(String[] args) {

		int arr[] = new int[5];// length of array

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements: ");
		for (int i = 0; i < arr.length; i++) {// for inerting array elements
			arr[i] = sc.nextInt();// taking array input
		}

		System.out.println("Negative Array elements are: ");
		// traversal array
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {// checking values are negative
				System.out.println(arr[i]);
			}
		}

	}

}
