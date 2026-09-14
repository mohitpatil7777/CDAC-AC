class Triangle {
	int height;
	int base;
	int hypotenuse;

	Triangle(int height, int base, int hypotenuse) {
		this.height = height;
		this.base = base;
		this.hypotenuse = hypotenuse;
	}

	public void display() {
		System.out.println("Perimeter is : " + (height + base + hypotenuse));
		System.out.println("Area is : " + (height * base * 0.5));
	}
}

public class TriangleInfo {

	public static void main(String[] args) {
		Triangle t = new Triangle(3, 4, 5);
		t.display();
	}
}