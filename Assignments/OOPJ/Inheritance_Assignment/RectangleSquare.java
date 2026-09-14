class Rectangle {

	private double length;
	private double breadth;

	Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public void printArea() {
		double area = length * breadth;
		System.out.println("Area: " + area);
	}

	public void printPerimeter() {
		double perimeter = 2 * (length + breadth);
		System.out.println("Perimeter: " + perimeter);
	}
}


class Square extends Rectangle {

	Square(double side) {
		super(side, side);
	}
}


public class RectangleSquare {

	public static void main(String[] args) {

		int length = ConsoleInput.getInt();
		int breadth = ConsoleInput.getInt();
		Rectangle rectangleObj = new Rectangle(length,breadth);

		rectangleObj.printArea();
		rectangleObj.printPerimeter();

		int side = ConsoleInput.getInt();
		Square squareObj = new Square(side);

		squareObj.printArea();
		squareObj.printPerimeter();
	}
}