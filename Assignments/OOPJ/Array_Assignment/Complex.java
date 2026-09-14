import java.util.Scanner;

class ComplexNumbers {
	private int number1;
	private int number2;

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public int computeComplexNumbe() {
		return number1 * number2;
	}
}

public class Complex {
	public static void main(String[] args) {
		ComplexNumbers[] arr = new ComplexNumbers[5];
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the 5 complex numbers");

		for (int iTemp = 0; iTemp < 5; iTemp++) {
			
			arr[iTemp] = new ComplexNumbers();
			System.out.println("Enter the complex number " + (iTemp + 1));
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			arr[iTemp].setNumber1(num1);
			arr[iTemp].setNumber2(num2);
		}

		for (int iTemp = 0; iTemp < 5; iTemp++) {
			System.out.println(arr[iTemp].computeComplexNumbe());
		}
        sc.close();
	}
}