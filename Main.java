public class Main{
	public static void main(String[] args) {
		Moose steve = new Moose(2, "Steve", 750);
		Moose marvin = new Moose ();
		steve.speak();
		steve.eat(marvin);
		
		System.out.println(steve.weight);
	}
}