class Employee1 {

	private double salary;
	private int workHours;

	public void getInfo(double salary, int workHours) {
		this.salary = salary;
		this.workHours = workHours;
	}

	public void addSal() {
		if (salary < 500) {
			salary = salary + 10;
		}
	}

	public void addWork() {
		if (workHours > 6) {
			salary = salary + 5;
		}
	}

	public void displaySalary() {
		System.out.println("Final Salary: " + salary);
	}
}


public class EmployeeSalary {

	public static void main(String[] args) {

		Employee1 employeeObj = new Employee1();

		employeeObj.getInfo(450, 8);
		employeeObj.addSal();
		employeeObj.addWork();

		employeeObj.displaySalary();
	}
}