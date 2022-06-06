//Write a program to print given pattern
/*
      *
     * *
    * * *
   * * * *
  * * * * *
*/
package basicprogram;

public class StarPattern5 {

	public static void main(String[] args) {// For row
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {// For space
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {// For pattern
				System.out.print(" *");
			}
			System.out.println();// new line for next row
		}

	}

}
