//1. Write program for Default Constructor.

//Program:

public class DefaultConstructor 
{
	
	int a = 3;
	int b = 5;
	
	DefaultConstructor() // Default Constructor
	{
		System.out.println("Performing Addition");
	}
	
	void add()
	{
		int c = a + b;
		System.out.println(a+" + "+b+" = "+c);
	}

	public static void main(String[] args) 
	{
		DefaultConstructor obj = new DefaultConstructor();
		obj.add();

	}

}

//Output:

/*
Performing Addition
3 + 5 = 8
*/