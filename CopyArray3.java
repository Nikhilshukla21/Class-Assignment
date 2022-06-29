package arrayexamples;

import java.util.Scanner;

public class CopyArray3 {

	public static void main(String[] args) {
		int size, i, arr1[], arr2[];// declaring variable

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of an array");
		size = sc.nextInt();

		// inistantiate array
		arr1 = new int[size];
		arr2 = new int[arr1.length];
		arr2 = arr1;
		arr2[0]++;

		// getting array elements from user
		System.out.println("Enter " + size + " elements in an array");
		for (i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}

		System.out.println("Copy of Array elements are:");
		// for printing copy of array elements
		for (i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

	}

}
