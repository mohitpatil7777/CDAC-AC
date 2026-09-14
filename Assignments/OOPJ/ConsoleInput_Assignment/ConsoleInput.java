
public class ConsoleInput {
	public static float getFloat() {
		String objString = getString();
		float data = Float.parseFloat(objString);
		return data;
	}

	public static int getInt() {
		return Integer.parseInt(getString());
	}

	public static long getLong() {
		return Long.parseLong(getString());
	}

	public static double getDouble() {
		return Double.parseDouble(getString());
	}

	public static String getString() {
		try {
			byte arrInput[] = new byte[100];
			int length = System.in.read(arrInput);
			byte arrInput1[] = new byte[length - 2];
			System.arraycopy(arrInput, 0, arrInput1, 0, length - 2);
			String str = new String(arrInput1);
			return str;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}