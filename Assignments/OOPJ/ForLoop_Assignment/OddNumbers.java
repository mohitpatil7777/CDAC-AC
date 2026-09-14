public class OddNumbers {
	public static void main(String[] args) {

		for (int iTemp = 1; iTemp <= 1000; iTemp++) {
			if (iTemp % 2 != 0) {
				System.out.println(iTemp);
			}
		}
	}
}