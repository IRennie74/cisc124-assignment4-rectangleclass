package rectangleAssignment;

public class TestProgram {
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(4, 40);
		Rectangle rect2 = new Rectangle (3.5, 35.7);
		
		System.out.println("Rectangle 1:");
		System.out.println("Width: " + rect1.getWidth());
		System.out.println("Height: " + rect1.getHeight());
		System.out.println("Area: " + rect1.getArea());
		System.out.println("Perimeter: " + rect1.getPerimeter());
		
		System.out.println("Rectangle 2:");
		System.out.println("Width: " + rect2.getWidth());
		System.out.println("Height: " + rect2.getHeight());
		System.out.println("Area: " + rect2.getArea());
		System.out.println("Perimeter: " + rect2.getPerimeter());
	}
}

/* output
Rectangle 1:
Width: 4.0
Height: 40.0
Area: 160.0
Perimeter: 88.0
Rectangle 2:
Width: 3.5
Height: 35.7
Area: 124.95000000000002
Perimeter: 78.4
*/
