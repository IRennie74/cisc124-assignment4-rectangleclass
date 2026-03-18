package rectangleAssignment;

public class Rectangle {
	private double width;
	private double height;
	
	// constructor with defined default values
	public Rectangle() {
		this.width = 1;
		this.height = 2;
	}
	
	// parameter constructor
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	// returns area of rectangle
	public double getArea() {
		return width * height; // rectangle calculation
	}
	
	// returns perimeter of rectangle
	public double getPerimeter() {
		return 2 * (width + height); // perimeter calculation
	}
	
	// returns the width of rectangle
	public double getWidth() {
		return width;
	}
	
	// returns the height of rectangle
	public double getHeight() {
		return height;
	}
}