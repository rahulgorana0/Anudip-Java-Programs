// 1.Create a program with a logic that throws the ArrayIndexOutOfBoundsException while accessing elements in an array.[Hint: Use array and loop and try to access the element beyond the last index.]

// Program:

public class ExceptionHandling 
{
	public static void main(String[] args) 
	{
		String[] fruits = {"Apple", "Banana", "Mango"}; // Array
		
		try // Try to execute
		{
			for (int i = 0; i <= fruits.length; i++) // Loop from 0 to 3
			{
				System.out.println(fruits[i]);
			}
		}
		catch (ArrayIndexOutOfBoundsException e) // Handle Exception
		{
			System.out.println(e);
		}
	}

}

// Output:

/*
Apple
Banana
Mango
java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
*/