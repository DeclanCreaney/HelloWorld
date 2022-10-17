//A class is a user-defined data type
/*
Every class has:
1. Constructor
2. Fields
3. Methods
*/
public class Moose { //< ----- Class declaration
	/*
	Fields go at the top of the class
	A field is data that is owned by the class
	(or an instance of the class)
	*/
	
	/** The number of points on a Moose's antlers */
	int antlerSize;
	
	/** The color of the Moose's hair */
	Color hairColor;
	
	/** The Moose's given first name */
	String name;
	
	/*
	Constructors go after the fields
	
	Constructor creates an instance of a class
	That is, it creates a particular Moose object
	Initializes all of the fields
	*/
	
	public Moose(int as, Color hc, String name) {
		antlerSize = as;
		hairColor = hc;
		this.name = name + "The Moose";
	}
	
	public Moose() {
		this.antlerSize = 0;
		this.hairColor = Color.BLACK;
		this.name = "Marvin the Moose";
		this.weight = 500;
	}
	
	/*
	After the constructors come the methods
	*/
	public void speak() {
		System.out.println("Weeerrrgh");
	}
	
	public void eat(Moose that) {
		this.weight += that.weight;
		// Dot "." operator references a field or method
		// of the corresponding instance
		System.out.println("Oh no! " this.name + " has eaten " + that.name);
		
		System.out.println(this.name + " now weighs " this.weight);
	}
}
	
	