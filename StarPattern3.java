//Program to print given pattern
/*
   *****
   ****
   ***
   **
   *
*/
package basicprogram;

public class StarPattern3 {
	public static void main(String[] args) {
		// Declaring variable
		int i, j;
		for (i = 5; i >= 1; i--) // row
		{
			for (j = 1; j <= i; j++) // column
			{
				System.out.print("*");
			} // internal for loop

			System.out.println();
		} // External loop

	}
}
