package arrayexamples;

import java.util.Scanner;

public class IncertElementSpecificPosition {

	public static void main(String[] args) {
		int size, pos, i, num;
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many elements you want in array!");
		size = sc.nextInt();
		System.out.println("Enter " + size + " elements in an array");
		for (i = 0; i < size; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println("Enter position:");
		pos = sc.nextInt();

		// check position is valid or not
		if (pos > size + 1 || pos < 0) {
			System.out.println("Our size is :" + size + " please choose position according to size");

		} else {
			System.out.println("Enter value:");
			num = sc.nextInt();

			// shifting the elements
			for (i = size; i >= pos; i--) {
				arr[i] = arr[i - 1];
			}
			// insert in position
			arr[pos - 1] = num;
			size++;// increasing the size

			// new array
			System.out.println("After adding new value,new array will be: ");
			for (i = 0; i < size; i++) {
				System.out.println(arr[i]);
			}
		}

	}

}
