//Program to print given pattern
/*
    *****
    *****
    *****
    *****
    *****
*/
package basicprogram;

public class Pattern {

	public static void main(String[] args) {
		// Declaring variable
		int i, j;
		for (i = 1; i <= 5; i++) // row
		{
			for (j = 1; j <= 5; j++) // column
			{
				System.out.print("*");
			} // internal for loop

			System.out.println();
		} // External loop

	}

}
