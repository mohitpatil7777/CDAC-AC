public class Pattern2 {
	public static void main(String[] args) {

		for (int iTemp = 5; iTemp >= 1; iTemp--) {

			for (int jTemp = 1; jTemp <= iTemp; jTemp++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}