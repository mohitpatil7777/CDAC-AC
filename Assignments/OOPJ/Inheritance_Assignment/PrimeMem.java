class Member {

	private String name;
	private int age;
	private long phoneNumber;
	private String address;
	private double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void printSalary() {
		System.out.println("Salary: " + salary);
	}
}


class PrimeMember extends Member {

	private int joiningYear;
	private double joiningFees;
	private boolean isActive;

	public int getJoiningYear() {
		return joiningYear;
	}

	public void setJoiningYear(int joiningYear) {
		this.joiningYear = joiningYear;
	}

	public double getJoiningFees() {
		return joiningFees;
	}

	public void setJoiningFees(double joiningFees) {
		this.joiningFees = joiningFees;
	}

	public boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public void display() {

		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("Phone Number: " + getPhoneNumber());
		System.out.println("Address: " + getAddress());
		System.out.println("Salary: " + getSalary());
		System.out.println("Joining Year: " + joiningYear);
		System.out.println("Joining Fees: " + joiningFees);
		System.out.println("Is Active: " + isActive);
	}
}


public class PrimeMem {

	public static void main(String[] args) {

		PrimeMember primeMemberObj = new PrimeMember();

		String name = ConsoleInput.getString();
		int age = ConsoleInput.getInt();
		long phoneNumber = ConsoleInput.getLong();
		String address = ConsoleInput.getString();
		double salary = ConsoleInput.getDouble();

		int joiningYear = ConsoleInput.getInt();
		double joiningFees = ConsoleInput.getDouble();
		boolean isActive = true;

		primeMemberObj.setName(name);
		primeMemberObj.setAge(age);
		primeMemberObj.setPhoneNumber(phoneNumber);
		primeMemberObj.setAddress(address);
		primeMemberObj.setSalary(salary);

		primeMemberObj.setJoiningYear(joiningYear);
		primeMemberObj.setJoiningFees(joiningFees);
		primeMemberObj.setIsActive(isActive);

		primeMemberObj.display();

		primeMemberObj.printSalary();
	}
}