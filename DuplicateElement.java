package arrayexamples;

public class DuplicateElement {

	public static void main(String[] args) {
		int count = 0;
		int arr[] = new int[] { 1, 2, 3, 4, 2, 7, 8, 8, 3 };

		System.out.println("Duplicate elements in given array are: ");
		// Searching for duplicate element
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					break;
				}

			}
		}
		System.out.println(count);
	}
}
