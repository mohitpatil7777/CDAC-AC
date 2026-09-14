class Employee {

	private String name;
	private int yearOfJoining;
	private double salary;
	private String address;

	Employee(String name, int yearOfJoining, double salary, String address) {
		this.name = name;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
		this.address = address;
	}

	public void display() {
		System.out.println(name + "\t\t" + yearOfJoining + "\t\t" + address);
	}
}


public class EmployeeInfo {

	public static void main(String[] args) {

		Employee employeeObj1 = new Employee("Robert", 1994, 50000, "64C- WallsStreat");
		Employee employeeObj2 = new Employee("Sam", 2000, 60000, "68D- WallsStreat");
		Employee employeeObj3 = new Employee("John", 1999, 55000, "26B- WallsStreat");

		System.out.println("Name\t\tYear of joining\t\tAddress");

		employeeObj1.display();
		employeeObj2.display();
		employeeObj3.display();
	}
}