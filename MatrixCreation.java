//program to create matrix of array element
package arrayexamples;

import java.util.Scanner;

public class MatrixCreation {

	public static void main(String[] args) {
		// declare variable
		int i, j, row, col, arr[][];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row and column");
		row = sc.nextInt();// taking row input
		col = sc.nextInt();// taking column input
		arr = new int[row][col];

		// input elements for matrix
		System.out.println("Enter " + row + "x" + col + " array elements");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		// print the value
		System.out.println("Matrix of array element");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
