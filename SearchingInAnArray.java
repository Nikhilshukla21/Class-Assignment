package arrayexamples;

import java.util.Scanner;

public class SearchingInAnArray {

	public static void main(String[] args) {
		int size, i, search, arr[], position = -1;
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
			if (search == arr[i]) {// if (arr[i]==search)
				position = i;// getting position
				break;

			}
		}
		if (position != -1) {
			System.out.println("Element found at " + (position + 1) + " position");
		} else {
			System.out.println("data not found");
		}

	}

}
