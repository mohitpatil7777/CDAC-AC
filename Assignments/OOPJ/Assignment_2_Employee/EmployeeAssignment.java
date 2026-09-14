class Employee {

	private int id;
	private String name;
	private double salary;

	Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void display() {
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
	}
}

class Manager extends Employee {

	private double bonus;

	Manager(int id, String name, double salary, double bonus) {
		super(id, name, salary);
		this.bonus = bonus;
	}

	public void display() {
		super.display();
		System.out.println("Bonus: " + bonus);
	}
}

class Engineer extends Employee {

	private String technology;

	Engineer(int id, String name, double salary, String technology) {
		super(id, name, salary);
		this.technology = technology;
	}

	public void display() {
		super.display();
		System.out.println("Technology: " + technology);
	}
}

class SalesPerson extends Employee {

	private double sales;

	SalesPerson(int id, String name, double salary, double sales) {
		super(id, name, salary);
		this.sales = sales;
	}

	public void display() {
		super.display();
		System.out.println("Sales: " + sales);
	}
}

public class EmployeeAssignment {

	public static void main(String[] args) {

		Employee employeeObj[] = new Employee[10];

		int count = 0;
		int currentIndex = -1;

		int choice;

		do {

			System.out.println("\n1. Add an Employee");
			System.out.println("2. Display");
			System.out.println("3. Exit");

			choice = ConsoleInput.getInt();

			switch (choice) {

			case 1:

				int employeeChoice;

				System.out.println("\n1. Manager");
				System.out.println("2. Engineer");
				System.out.println("3. Sales Person");
				System.out.println("4. Exit to Main Menu");

				employeeChoice = ConsoleInput.getInt();

				if (employeeChoice == 1) {

					int id = ConsoleInput.getInt();
					String name = ConsoleInput.getString();
					double salary = ConsoleInput.getDouble();
					double bonus = ConsoleInput.getDouble();

					employeeObj[count] = new Manager(id, name, salary, bonus);

					count++;
				}

				else if (employeeChoice == 2) {

					int id = ConsoleInput.getInt();
					String name = ConsoleInput.getString();
					double salary = ConsoleInput.getDouble();
					String technology = ConsoleInput.getString();

					employeeObj[count] = new Engineer(id, name, salary, technology);

					count++;
				}

				else if (employeeChoice == 3) {

					int id = ConsoleInput.getInt();
					String name = ConsoleInput.getString();
					double salary = ConsoleInput.getDouble();
					double sales = ConsoleInput.getDouble();

					employeeObj[count] = new SalesPerson(id, name, salary, sales);

					count++;
				}

				break;

			case 2:

				int displayChoice;

				System.out.println("\n1. All Employees");
				System.out.println("2. First Employee");
				System.out.println("3. Next Employee");
				System.out.println("4. Previous Employee");
				System.out.println("5. Last Employee");
				System.out.println("6. Exit to Main Menu");

				displayChoice = ConsoleInput.getInt();

				if (displayChoice == 1) {

					for (int iTemp = 0; iTemp < count; iTemp++) {
						employeeObj[iTemp].display();
						System.out.println();
					}

					currentIndex = 0;
				}

				else if (displayChoice == 2) {

					if (count > 0) {
						currentIndex = 0;
						employeeObj[currentIndex].display();
					}
				}

				else if (displayChoice == 3) {

					if (currentIndex < count - 1) {
						currentIndex++;
						employeeObj[currentIndex].display();
					}
				}

				else if (displayChoice == 4) {

					if (currentIndex > 0) {
						currentIndex--;
						employeeObj[currentIndex].display();
					}
				}

				else if (displayChoice == 5) {

					if (count > 0) {
						currentIndex = count - 1;
						employeeObj[currentIndex].display();
					}
				}

				break;

			case 3:
				System.out.println("Program exited");
				break;

			default:
				System.out.println("Invalid choice");
			}

		} while (choice != 3);
	}
}