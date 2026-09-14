public class Pattern4 {
	public static void main(String[] args) {

		for (int iTemp = 1; iTemp <= 6; iTemp++) {

			for (int jTemp = 1; jTemp <= iTemp; jTemp++) {
				System.out.print(jTemp + " ");
			}

			System.out.println();
		}
	}
}