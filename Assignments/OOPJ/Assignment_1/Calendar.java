import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date obj = new Date();

		int choice;

		do {

			System.out.println("\n===== Date Menu =====");
			System.out.println("1. Set Date");
			System.out.println("2. Add Days");
			System.out.println("3. Add Months");
			System.out.println("4. Add Years");
			System.out.println("5. Display");
			System.out.println("6. Compare Dates (not implement)");
			System.out.println("7. Exit");

			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {

			case 1:

				System.out.print("Enter the day: ");
				int day = sc.nextInt();

				System.out.print("Enter the month: ");
				int month = sc.nextInt();

				System.out.print("Enter the year: ");
				int year = sc.nextInt();

				obj.setDate(day, month, year);

				System.out.println("Date set successfully.");

				break;

			case 2:

				System.out.print("Enter number of days to add: ");
				int days = sc.nextInt();

				obj.addDays(days);

				break;

			case 3:

				System.out.print("Enter number of months to add: ");
				int months = sc.nextInt();

				obj.addMonths(months);

				break;

			case 4:

				System.out.print("Enter number of years to add: ");
				int years = sc.nextInt();

				obj.addYears(years);

				break;

			case 5:

				System.out.println("Date: " + obj.getDay() + "/" + obj.getMonth() + "/" + obj.getYear());

				break;

			case 6:

				System.out.println("Compare Dates functionality not implemented.");

				break;

			case 7:

				System.out.println("Exiting...");

				break;

			default:

				System.out.println("Invalid choice!");

			}

		} while (choice != 7);
        sc.close();

	}

}

class Date {
	private int day;
	private int month;
	private int year;

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public void setDate(int day, int month, int year) {
		this.year = year;

		if (month < 1) {
			month = 1;
		}

		if (day < 1) {
			day = 1;
		}

		while (month > 12) {
			month = month - 12;
			year++;
		}

		while (true) {
			int daysInMonth = daysInMonth(month, year);

			if (day >= 1 && day <= daysInMonth) {
				break;
			}

			if (day > daysInMonth) {
				day -= daysInMonth;
				month++;

				if (month > 12) {
					month = 1;
					year++;
				}
			}

		}
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public void addDays(int addDays) {

		while (addDays > 0) {
			int daysInMonth = daysInMonth(month, year);

			if ((day + addDays) <= daysInMonth) {
				day = day + addDays;
				addDays = 0;
				break;
			}

			else {
				addDays = addDays - (daysInMonth - day);
				day = 1;
				month++;

				if (month > 12) {
					year++;
					month = 1;
				}
			}
		}
	}
	
	public void addMonths(int addMonths) {
		
		while(addMonths >= 1) {	
		int totalDays = day + daysInMonth(month , year);
		addDays(totalDays);
		addMonths--;
		}
		
	}
	
	public void addYears(int addYears) {
		addMonths(addYears * 12);
	}

	public int daysInMonth(int month, int year) {
		if (month == 2) {
			if (isLeapYear(year)) {
				return 29;
			} else {
				return 28;
			}
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;
		} else {
			return 31;
		}
	}

	public boolean isLeapYear(int year) {
		return ((year % 4 == 0 && year != 100) || year % 400 == 0);
	}
}