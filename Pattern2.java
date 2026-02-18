//2. Write a Program to Display below pattern

//Program:

public class Pattern2 {

	public static void main(String[] args) 
	{
		// Loop for number of lines
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

	}

}

//Output:

/*
    *
   ***
  *****
 *******
*********
*/