package lab1Week1;

public class CircleMain {

	// save as "TestCircle.java"
	public static void main(String[] args) {
		// Declare and allocate an instance of class Circle called c1
		// with default radius and color
		Circle c1 = new Circle();
		// Use the dot operator to invoke methods of instance c1.
		System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());

		// Declare and allocate an instance of class circle called c2
		// with the given radius and default color
		Circle c2 = new Circle(2.0);
		// Use the dot operator to invoke methods of instance c2.
		System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());

		Circle c3 = new Circle(12, "blue");
		System.out.println("The circle has radius of " + c2.getRadius() + " and color of " + c2.getColor());

		c3.setRadious(14.0);// change radius
		c3.setColor("Brown");// change color

		System.out.println("The circle has radius of " + c3.getRadius() + " and color of " + c3.getColor());
	
		System.out.println();
		Circle cOne = new Circle(15.0);
		System.out.println("Circle has radius of" +cOne.toString());
	
	
		Circle cTwo = new Circle(1.2);
		System.out.println(cTwo.toString()); // explicit call
		System.out.println(cTwo); // println() calls toString() implicitly, same as above
	
		System.out.println("Operator '+' invokes toString() too: " + cTwo); // '+' invokes toString() too
	
	}

}
