public class Pattern1 {
	public static void main(String[] args) {

		for (int iTemp = 1; iTemp <= 5; iTemp++) {

			for (int jTemp = 1; jTemp <= iTemp; jTemp++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}