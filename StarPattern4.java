//Program to print given pattern
/*    *
     * *
    * * *
   * * * *
  * * * * *
   * * * *
    * * *
     * *
      *  */
package basicprogram;

public class StarPattern4 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {// For row
			for (int j = 5; j >= i; j--) {// For space
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {// For Pattern
				System.out.print(" *");
			}
			System.out.println();// new line for next row

		}
		for (int i = 4; i >= 1; i--) // For row
		{
			for (int j = 5; j >= i; j--) {// For space
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {// For Pattern
				System.out.print(" *");
			}
			System.out.println();// new line for next row
		}
	}

}
