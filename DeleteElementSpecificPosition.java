package arrayexamples;

import java.util.Scanner;

public class DeleteElementSpecificPosition {

	public static void main(String[] args) {
		int size, pos, i, num = 0;
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many elements you want in array!");
		size = sc.nextInt();
		System.out.println("Enter " + size + " elements in an array");
		for (i = 0; i < size; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println("Enter position to delete:");
		pos = sc.nextInt();

		// check position is valid or not
		if (pos > size + 1 || pos < 0) {
			System.out.println("Our size is :" + size + " please choose position according to size");

		} else {

			// shifting the elements
			for (i = pos - 1; i < size - 1; i++) {
				arr[i] = arr[i + 1];
			}
			// delet in position
			arr[pos + 1] = num;
			size--;// decreasing the size

			// new array
			System.out.println("After deleting new value,new array will be: ");
			for (i = 0; i < size; i++) {
				System.out.println(arr[i]);
			}
		}

	}

}
