package sampleObjectInteraction;

public class CreateObjectDemo {
	public static void main(String[] args) {

		// Declare and create a point object and two rectangle objects.

		/*
		 * Cue:These instantiations indicate that CreateObjectDemo in wants to interact
		 * with Point and Rectangle objects to utilize their services in some way. The
		 * only way it can do this is by instantiating the classes (creating objects)
		 * using which it can invoke their choice methods. Remember, an object's methods
		 * are an interface to outside world that define the interaction with them
		 */
		Point originOne = new Point(23, 94); 
						/*Creating a new point object. Cue: CreateObjectDemo is trying to
						initialize the fields/ instance variables of
						Point object (besides instantiating the Point class itself) by
						passing arguments its constructor
						 */
		
		Rectangle rectOne = new Rectangle(originOne, 100,200); 
						/*
						 * Creating a new rectangle with particular dimensions - point, height and width by initializing its
						 * instance variables.
						 * Cue: Also indicates that Rectangle object has the BUILT-IN ABILITY to TALK to
						 * Point object. Cue: CreateObjectDemo is initializing the fields/ instance
						 * variables of Rectangle object, besides instantiating the Rectangle class
						 * itself
						 */
		Rectangle rectTwo = new Rectangle(50, 100); 
						/*
						 * Creating another new rectangle with particular dimensions - height and width
						 */
												
		// display rectOne's width, height, and area
		System.out.println("Width of rectOne: " + rectOne.width); // get the width using instance variable of Rectangle
																	// object rectOne
		System.out.println("Height of rectOne: " + rectOne.height); // get the height using instance variable of
																	// Rectangle object rectOne
		System.out.println("Area of rectOne: " + rectOne.getArea()); // get the area by invoking instance method of
																		// Rectangle object rectOne

		// set rectTwo's position
		rectTwo.origin = originOne; // origin is a field (instance variable) of Type Point declared in class
									// Rectangle that is being
									// accessed directly here.

		// display rectTwo's position
		/*
		 * Rectangle class instantiates Point class (creates a Point Object) internally
		 * - check the class-code It then stores Point object reference into its own
		 * field variable that it declares as "origin" (of type Point). Origin is now
		 * officially a member of Rectangle class But, after Rectangle class itself has
		 * been instantiated in here in this CreateObjectDemo class, it can be accessed
		 * using say, rectTwo.origin But rectTwo.origin itself is in turn, and
		 * essentially of type Point. So, you can then access member variables of class
		 * Point (such as x,y) using rectTwo.origin.x
		 *
		 */
		System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
		System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);

		// move rectTwo and display its new position
		rectTwo.move(40, 72);// move the Rectangle rectTwo ('s position) by invoking instance method of Rectangle object rectTwo
		System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
		System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);
	}

}
