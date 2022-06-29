package arrayexamples;

import java.util.Scanner;

public class MergeTwoArray2 {

	public static void main(String[] args) {
		// Declaring variable
		int i, j, size1, size2, arr1[], arr2[], arr3[], count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of first array");
		size1 = sc.nextInt();// taking innput
		System.out.println("Enter size of second array");
		size2 = sc.nextInt();

		// inistantiate array
		arr1 = new int[size1];
		arr2 = new int[size2];
		arr3 = new int[arr1.length + arr2.length];

		System.out.println("Enter " + size1 + " elements in first array");
		for (i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();// taking first array elements from user
			arr3[i] = arr1[i];// copying the first array to the third array
			count++;

		}

		System.out.println("Enter " + size2 + " elements in second array");
		for (i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();// taking second array elements from user
			arr3[count++] = arr2[i];// copying the second array to the third array

		}

		System.out.println("After merge both of array elements are:");
		for (i = 0; i < arr3.length; i++) {

			// print the element
			System.out.println(arr3[i]);
		}

	}

}
