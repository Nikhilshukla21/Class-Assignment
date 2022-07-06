package arrayexamples;

import java.util.Scanner;

public class AdditionOfTwoMatrix {

	public static void main(String[] args) {
		int i, j;
		int first[][] = new int[3][3];
		int second[][] = new int[3][3];
		int result[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);

		// input elements in first matrix
		System.out.println("Input elements in first matrix ");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				first[i][j] = sc.nextInt();
			}
		}

		// input elements in second matrix
		System.out.println("Input elements in second matrix ");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				second[i][j] = sc.nextInt();
			}
		}

		// print first matrix
		System.out.println("first matrix:");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(first[i][j] + " ");
			}
			System.out.println();
		}

		// print second matrix
		System.out.println("second matrix:");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(second[i][j] + " ");
			}
			System.out.println();
		}

		// addition both matrices

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				result[i][j] = first[i][j] + second[i][j];

			}

		}

		// print result
		System.out.println("After addition,the result matrix:");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}

	}

}
