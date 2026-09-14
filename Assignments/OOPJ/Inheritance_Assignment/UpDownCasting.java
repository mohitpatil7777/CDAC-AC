class Parent {

	void displayParent() {
		System.out.println("This is parent class");
	}
}

class Child extends Parent {

	void displayChild() {
		System.out.println("This is child class");
	}
}

public class UpDownCasting {

	public static void main(String[] args) {

		Parent parentObj = new Parent();
		Child childObj = new Child();

		// 1 - Method of parent class by object of parent class
		parentObj.displayParent();

		// 2 - Method of child class by object of child class
		childObj.displayChild();

		// 3 - Method of parent class by object of child class
		childObj.displayParent();
	}
}