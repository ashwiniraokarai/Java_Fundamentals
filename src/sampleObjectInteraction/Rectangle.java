package sampleObjectInteraction;

public class Rectangle {
	public int width = 0;
	public int height = 0;
	public Point origin;

	// four constructors
	public Rectangle() {
		/*
		 * Control flows from CreateObjectDemo program to this constructor if it
		 * instantiated Rectangle class without passing any arguments. Meaning,
		 * CreateObjectDemo program is not worried about specific values (dimensions)
		 * while interacting with the Rectangle object to use its services/ behavior
		 * (calculate the area of a rectangle)
		 */

		origin = new Point(0, 0);
	}

	public Rectangle(Point p) {

		/*
		 * Control flows from CreateObjectDemo program to this constructor if it
		 * instantiated Rectangle class without passing the height and width arguments.
		 * Meaning, CreateObjectDemo program is not worried about specific height and
		 * width of the rectangle while interacting with the Rectangle object to use its
		 * services/ behavior. CreateObjectDemo
		 * program is only particular about the "point". It wants to use its own Point
		 * and therefore it bothered to pass a pre-instantiated Point object as an
		 * argument
		 */
		origin = p;
	}

	public Rectangle(int w, int h) {
		/*
		 * Control from CreateObjectDemo program flows here when it instantiates this,
		 * Rectangle class via statement Rectangle rectTwo = new Rectangle(50, 100);
		 * The Point object is instantiated here to create a Point object here because CreateObjectDemo program did
		 * not want to pass a Point type object. CreateObjectDemo program is particular about the dimensions of the
		 * Rectangle but not about the Point
		 */

		origin = new Point(0, 0);
		width = w;
		height = h;
	}

	public Rectangle(Point p, int w, int h) {
		/*
		 * Control from CreateObjectDemo program flows here when it instantiates this,
		 * Rectangle class via statement Rectangle rectOne = new Rectangle(originOne,
		 * 100, 200); The Point class need not be instantiated here because
		 * CreateObjectDemo program has passed a pre-instantiated Point type object
		 * as an argument to the first parameter (Point p) of this constructor.
		 * CreateObjectDemo program is very particular about the dimensions of the
		 * Rectangle as well as the Point value 
		 */

		origin = p;
		width = w;
		height = h;
	}

	// a method for moving the rectangle (cue: point the rectangle to a new position. Equated to moving the rectangle!)
	public void move(int x, int y) { //Using one of the Point Objects stored in "origin", set the values of instance variables
									//of Point object (viz. variable x and variable y declared in Point class)
									//Cue:CreateObjectDemo program is able to alter the state of Point class either on its own
									//or via this Rectangle class!
		origin.x = x;
		origin.y = y;
	}

	// a method for computing the area of the rectangle
	public int getArea() {  //area computation does not need point values. Height and width are sufficient
		return width * height;
	}
}
