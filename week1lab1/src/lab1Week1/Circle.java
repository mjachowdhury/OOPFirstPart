package lab1Week1;

public class Circle {
	// save as "Circle.java"
	// private instance variable, not accessible from outside this class
	private double radius;
	private String color;

	// 1st constructor, which sets both radius and color to default
	public Circle() {
		radius = 1.0;
		color = "red";
	}

	// 2nd constructor with given radius, but color default
	public Circle(double r) {
		radius = r;
		color = "red";
	}
	
	//3rd constructor
	public Circle(double radious, String color){
		this.radius = radious;
		this.color = color;
	}

	// A public method for retrieving the radius
	public double getRadius() {
		return radius;
	}

	public void setRadious(double r){
		this.radius = r;
	}
	// A public method for computing the area of circle
	public double getArea() {
		return radius * radius * Math.PI;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Circle : radius=" + radius + ", color=" + color ;
	}
 
	
		
	}
	
	

