class Shape {

	public void displayShape() {
		System.out.println("This is shape");
	}
}


class Rectangle1 extends Shape {

	public void displayRectangle() {
		System.out.println("This is rectangular shape");
	}
}


class Circle1 extends Shape {

	public void displayCircle() {
		System.out.println("This is circular shape");
	}
}


class Square1 extends Rectangle1 {
	

	public void displaySquare() {
		System.out.println("Square is a rectangle");
	}
}


public class ShapeDemo {

	public static void main(String[] args) {

		Square1 squareObj = new Square1();

		squareObj.displayShape();
		squareObj.displayRectangle();
	}
}