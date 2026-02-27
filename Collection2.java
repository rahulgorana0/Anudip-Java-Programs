// 2. Write a Java program  to implement Stack.

// Program:

import java.util.Stack;

public class Collection2
{
	public static void main(String[] args) 
	{
		// Create a Stack Object
		Stack<String> fruits = new Stack<>();
		
		// is.Empty() is checking that stack is empty or not
		System.out.println("Fruits List: " + fruits.isEmpty());
		
		// .push() is adding elements in stack
		fruits.push("Apple");
		fruits.push("Banana");
		fruits.push("Mango");
		System.out.println("Fruits list: " + fruits);
		
		System.out.println("Fruits list: " + fruits.isEmpty());
		
		// .peek() is gives top element in the stack
		System.out.println("Top fruit in list: " + fruits.peek());
		
		// .pop() is removing last element
		fruits.pop();
		System.out.println("Fruits list: " + fruits);
		
		// .search() is to search element position in stack and give index value
		System.out.println("Fruit search in list: " + fruits.search("Banana"));
	}
}

// Output:

/*
Fruits List: true
Fruits list: [Apple, Banana, Mango]
Fruits list: false
Top fruit in list: Mango
Fruits list: [Apple, Banana]
Fruit search in list: 1
*/