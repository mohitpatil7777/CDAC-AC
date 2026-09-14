public class Pattern3 {
	public static void main(String[] args) {

		int num1 = 1;

		for (int iTemp = 1; iTemp <= 4; iTemp++) {

			for (int jTemp = 1; jTemp <= iTemp; jTemp++) {
				System.out.print(num1 + " ");
				num1++;
			}

			System.out.println();
		}
	}
}
