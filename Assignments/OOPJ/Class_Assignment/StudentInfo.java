import java.util.Scanner;

 class Student {
	private String name;
	private int rollNo;
	private String phoneNo;
	private String address;

	public String getName() {
		return name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	public void display() {
		System.out.println("Student Info: \n" + name + "\t" + rollNo + " \t" + phoneNo + "\t " + address);
	}
}

class StudentInfo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name and rollNo of student 1");
		String name = sc.nextLine();
		int rollNo = sc.nextInt();
		sc.nextLine();
		Student studObj1 = new Student(name, rollNo);

		System.out.println("Enter the name and rollNo of student 2");
		name = sc.nextLine();
		rollNo = sc.nextInt();
		sc.nextLine();
		Student studObj2 = new Student(name, rollNo);

		System.out.println("Set the address and phone of student 1");
		String address = sc.nextLine();
		String phoneNo = sc.nextLine();
		studObj1.setAddress(address);
		studObj1.setPhoneNo(phoneNo);
		

		System.out.println("Set the address and phone of student 1");
		address = sc.nextLine();
		phoneNo = sc.nextLine();
		studObj2.setAddress(address);
		studObj2.setPhoneNo(phoneNo);
		
		studObj1.display();
		studObj2.display();
		
	}
}