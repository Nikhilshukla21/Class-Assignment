package arrayexamples;

import java.util.Scanner;

public class SearchingInAnArray2 {
	public void searchingInAnArray2() {
		int size, arr[], i, search, position = -1;

		Scanner sc = new Scanner(System.in);

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
		// getting search element from user to search
		System.out.println("Enter element to search");
		search = sc.nextInt();

		// logic for search
		for (i = 0; i < arr.length; i++) {
			if (search == arr[i]) {
				position = i;// getting position
				break;

			}
		}
		if (position != -1) {
			System.out.println("Element found at position: " + (position + 1));
		} else {
			System.out.println("Sorry! data not found!");
		}
		/*
		 * if (position == -1) { System.out.println("Sorry! data not found!"); } else {
		 * System.out.println("Element found at position: " + (position + 1)); }
		 */

	}

	public static void main(String[] args) {

		SearchingInAnArray2 search = new SearchingInAnArray2();
		search.searchingInAnArray2();// invoking
	}

}
