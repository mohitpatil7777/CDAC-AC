import java.util.Scanner;

class Complex {
	private int real;
	private int imag;

	public int getReal() {
		return real;
	}

	public int getImag() {
		return imag;
	}

	Complex(int real, int imag) {
		this.real = real;
		this.imag = imag;
	}

	void add(Complex c) {
		System.out.println("Addition is : " + ((this.real + c.getReal()) + (this.imag + c.getImag())));
	}

	void sub(Complex c) {
		System.out.println("Substraction is : " +( (this.real - c.getReal()) + (this.imag - c.getImag())));
	}

	void multi(Complex c) {
		System.out.println("Multi is : " + ((this.real * c.getReal()) + (this.imag * c.getImag())));
	}

	public void display(Complex c) {
		add(c);
		sub(c);
		multi(c);
	}
}

public class ComplexInfo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the real number and imaginary number 1: ");
		int real = sc.nextInt();
		int imag = sc.nextInt();
		Complex c = new Complex(real, imag);
		
		System.out.println("Enter the real number and imaginary number 2: ");
		real = sc.nextInt();
		imag = sc.nextInt();
		Complex c1 = new Complex(real, imag);
		c1.display(c);
        sc.close();
	}
}