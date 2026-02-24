// 1. Create one superclass HillStations and three subclasses Manali, Mussoorie, Gulmarg. Subclasses extend the superclass and override its location() and famousFor() method. i.call the location() and famousFor() method by the Parent class’, i.e. Hillstations class. As it refers to the base class object and the base class method overrides the superclass method; the base class method is invoked at runtime. ii.call the location() and famousFor() method by the all subclass’,and print accordingly.

// Program:

class HillStations // Superclass
{
	// Overridden by subclasses
	void location()
	{
		System.out.println("Location");
	}
	void famousFor()
	{
		System.out.println("Famous for");
	}
}

class Manali extends HillStations // Subclass 1
{
	// Overriding HillStations methods
	void location()
	{
		System.out.println("Himachal Pradesh");
	}
	void famousFor()
	{
		System.out.println("Snowfall & Adventure");
	}
}

class Mussoorie extends HillStations // Subclass 2
{
	// Overriding HillStations methods
	void location()
	{
		System.out.println("Uttarakhand");
	}
	void famousFor()
	{
		System.out.println("Scenic Beauty");
	}
}

class Gulmarg extends HillStations // Subclass 3
{
	// Overriding HillStations methods
	void location()
	{
		System.out.println("Jammu & Kashmir");
	}
	void famousFor()
	{
		System.out.println("Skiing");
	}
}

public class Polymorphism 
{
	public static void main(String[] args) 
	{
		// i. Calling methods using parent class reference (Runtime Polymorphism)
		HillStations hs;
		
		hs = new Manali();
		hs.location();
		hs.famousFor();
				
		hs = new Mussoorie();
		hs.location();
		hs.famousFor();
		
		hs = new Gulmarg();
		hs.location();
		hs.famousFor();
		
		// ii. Calling methods by all subclasses directly
		Manali hs1 = new Manali();
		hs1.location();
		hs1.famousFor();
		
		Mussoorie hs2 = new Mussoorie();
		hs2.location();
		hs2.famousFor();
		
		Gulmarg hs3 = new Gulmarg();
		hs3.location();
		hs3.famousFor();
	}

}

// Output:

/*
Himachal Pradesh
Snowfall & Adventure
Uttarakhand
Scenic Beauty
Jammu & Kashmir
Skiing
Himachal Pradesh
Snowfall & Adventure
Uttarakhand
Scenic Beauty
Jammu & Kashmir
Skiing
*/