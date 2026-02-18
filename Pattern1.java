//1. Write a Program to Display below pattern

//Program:

public class Pattern1 {

	public static void main(String[] args) 
	{
		// Loop for first pattern number of lines
		for (int i = 1; i <= 5; i++)
		{
			// Loop for first blank space in decreasing order
			for (int j = 4; j >= i; j--)
			{
				System.out.print(" ");
			}
			// Loop for star after blank space in increasing order in odd number
			for (int k = 1; k <= i*2-1; k++)
			{
				System.out.print("*");
			}
			System.out.println(); // To go on next line
		}
		// Loop for second pattern number of lines after first
		for (int x = 1; x <= 4; x++)
		{
			// Loop for blank space in increasing order
			for (int y = 1; y <= x; y++)
			{
				System.out.print(" ");
			}
			// Loop for star after blank space in decreasing order in odd number
			for (int z = 7; z >= x*2-1; z--)
			{
				System.out.print("*");
			}
			System.out.println(); // To go on next line

		}

	}

}

//Output:

/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/