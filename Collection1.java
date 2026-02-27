// 1.Write a Java program that calculates the sum of all even numbers present in an ArrayList of integers.

// Program:

import java.util.ArrayList;

public class Collection1 
{
	public static void main(String[] args) 
	{
		// Create a ArrayList Object
		ArrayList<Integer> num = new ArrayList<>();
		// Add all numbers from 1 to 9
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		num.add(8);
		num.add(9);
		
		// Variable initialize to store sum
		int sum = 0;
		
		// Using foreach loop to iterate all elements from ArrayList
		for (int i : num) 
		{
			// if statement to check number is even or not
			if (i % 2 == 0)
			{
				// Add all even numbers
				sum += i;
			}
		}
		System.out.println("Sum of all even number: " + sum);
	}
}

// Output:

/*
Sum of all even number: 20
*/