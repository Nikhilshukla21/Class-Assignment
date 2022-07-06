package arrayexamples;

import java.util.Scanner;

public class SearchingElementUsingMethod {
	static Scanner sc = new Scanner(System.in);

	public static int[] insertArrayElements() {
		int size, i, arr[];

		// receive size of an array from user
		System.out.println("Enter size of an array");
		size = sc.nextInt();

		// inistantiate array
		arr = new int[size];

		// getting array elements from user
		System.out.println("Enter " + size + " elements in an array");
		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static void searchElement(int arr[], int search) {
		int i;
		boolean f = false;
		for (i = 0; i < arr.length; i++) {
			if (search == arr[i]) {
				f = true;

				break;
			}
		}

		// need to check that we got any position or not
		if (f != false) {
			System.out.println("Element found at " + (i + 1) + " position");
		} else {
			System.out.println("Data not found");
		}

	}

	public static void main(String[] args) {
		int arr[] = SearchingElementUsingMethod.insertArrayElements();
		// getting search element from user to search
		System.out.println("Enter element to search");
		int search = sc.nextInt();

		SearchingElementUsingMethod.searchElement(arr, search);

	}

}
