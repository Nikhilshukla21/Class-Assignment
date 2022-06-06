//Program to print given pattern
/*
   * * * * * 
    * * * * 
     * * * 
      * * 
       * 
 */
package basicprogram;

public class StarPattern6 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {// For row
			for (int j = 1; j <= i; j++) {// For Space
				System.out.print(" ");
			}
			for (int k = 5; k >= i; k--) {// For pattern
				System.out.print(" *");
			}
			System.out.println();// new line for next row
		}

	}

}
