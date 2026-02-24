// 2.Write a Java program that demonstrates method overriding by creating a superclass called Animal and two subclasses called Dog and Cat. ● TheAnimal class should have a method called makeSound(), which simply prints "The animal makes a sound." ● TheDogandCatclasses should override this method to print "TheCat/The dog meows/barks" respectively. ● Theprogram should allow the user to create and display objects of each class. [Hint:Use multilevel inheritance]

// Program:

import java.util.Scanner;

class Animal // Superclass
{
	void makeSound() // Overridden by subclasses
	{
		System.out.println("The animal makes a sound.");
	}
}

class Dog extends Animal // Subclass 1
{
	void makeSound() // Overriding Animal method
	{
		System.out.println("The dog barks.");
	}
}

class Cat extends Dog // Subclass 2 (Multilevel Inheritance)
{
	void makeSound() // Overriding Dog method
	{
		System.out.println("The Cat meows.");
	}
}

public class Inheritance 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); // Capture user input
		
		System.out.println("Choose an animal to create:");
        System.out.println("1. Animal");
        System.out.println("2. Dog");
        System.out.println("3. Cat");
        
        int choice = input.nextInt(); // Store input
        
        Animal obj; // Reference of superclass
        
        switch (choice)
        {
	        case 1:
	        	obj = new Animal(); // Creating an Animal object
	        	obj.makeSound();
	        	break;
	        	
	        case 2:
	        	obj = new Dog(); // Creating a Dog object
	        	obj.makeSound();
	        	break;
	        	
	        case 3:
	        	obj = new Cat(); // Creating a Cat object
	        	obj.makeSound();
	        	break;
	        
	        default: // If case not found
	        	System.out.println("Invalid choice!");
        }
        input.close(); // Close capturing user input
	}

}

// Output:

// Scenario 1
/*
Choose an animal to create:
1. Animal
2. Dog
3. Cat
1
The animal makes a sound.
*/

// Scenario 2
/*
Choose an animal to create:
1. Animal
2. Dog
3. Cat
2
The dog barks.
*/

// Scenario 3
/*
Choose an animal to create:
1. Animal
2. Dog
3. Cat
3
The Cat meows.
*/

// Scenario 4
/*
Choose an animal to create:
1. Animal
2. Dog
3. Cat
4
Invalid choice!
*/