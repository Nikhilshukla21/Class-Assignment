package arrayexamples;

import java.util.Scanner;

public class MatrixMultiplication {
	public static void main(String[] args) {
		// instantiate array
		int first[][] = new int[3][3];
		int second[][] = new int[3][3];
		int result[][] = new int[3][3];

		// declare variable
		int i, j, k, sum;
		Scanner sc = new Scanner(System.in);

		// input elements in first matrix from user
		System.out.println("Enter elements in an first matrix:");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				first[i][j] = sc.nextInt();
			}
		}

		// input elements in second matrix from user
		System.out.println("Enter elements in an second matrix:");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				second[i][j] = sc.nextInt();
			}
		}

		// Multiply both matrices first*second

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				sum = 0;
				for (k = 0; k < 3; k++) {
					sum += first[i][k] * second[k][j];
				}
				result[i][j] = sum;
			}
		}

		// print matrix
		System.out.println("After multiplication,the result are:");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}
