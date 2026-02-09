//2. Write program for Parameterized Constructor.

//Program:

public class ParameterizedConstructor 
{
	
	ParameterizedConstructor(int x, int y) // Parameterized Constructor
	{
		System.out.println("Performing Subtraction");
		int z = x - y;
		System.out.println(x+" + "+y+" = "+z);
	}

	public static void main(String[] args) 
	{
		ParameterizedConstructor obj = new ParameterizedConstructor(6,4);
	}

}

//Output:

/*
Performing Subtraction
6 + 4 = 2
*/