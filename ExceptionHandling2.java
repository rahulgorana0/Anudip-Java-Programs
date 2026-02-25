// 2.Create program for Custom Exception.

// Program:

class CustomException extends Exception // Custom Exception Class
{
	CustomException(String str) // Constructor
	{
		// Call the constructor of the parent Exception class
		super(str);
	}
}

public class ExceptionHandling
{
	static void checkNumber(int num) throws CustomException // Declares that it may throw CustomException
	{
		if (num < 0) // If the number is less than 0, throw a custom exception
		{
			throw new CustomException("Number cannot be negative");
		}
		else // If the number is valid
		{
			System.out.println("Number is: " + num);
		}
    	}
	
	public static void main(String[] args)
	{
		try // Try to execute
		{
            checkNumber(-5); // Call the method
        }
		catch (CustomException e) // Handle Exception
		{
            System.out.println("Caught Exception: " + e.getMessage());
        }
		
	}

}

// Output:

/*
Caught Exception: Number cannot be negative
*/