import java.util.Arrays;
import java.util.Scanner;

public class ArrayAssignment {
	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);

	    int size = sc.nextInt();

	    int arr[] = new int[size];

	    for (int iTemp = 0; iTemp < size; iTemp++) {
	        arr[iTemp] = sc.nextInt();
	    }

	    // ----- QUESTION 2 -----
	    // Question2(arr, size);

	    // ----- QUESTION 3 -----
	    // Question3(arr, size);

	    // ----- QUESTION 4 -----
	    // Question4(arr, size);

	    // ----- QUESTION 5 -----
	    // Question5(arr, size);

	    // ----- QUESTION 6 -----
	    // Question6(arr, size);

	    // ----- QUESTION 7 -----
	    // Question7(arr, size);

	    // ----- QUESTION 8 & 9 -----
	    Question8(arr, size);

	    sc.close();
	}

	public static void Question2(int[] arr, int size) {
		for (int iTemp = 0; iTemp < size - 1; iTemp++) {
			for (int jTemp = iTemp + 1; jTemp < size; jTemp++) {
				if (arr[iTemp] >= arr[jTemp]) {
					int temp = arr[iTemp];
					arr[iTemp] = arr[jTemp];
					arr[jTemp] = temp;
				}
			}
		}
	}

	public static void Question3(int arr[], int size) {
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}

	public static void Question4(int arr[], int size) {
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum += arr[i];
		}
		System.out.println(sum / size);
	}

	public static void Question5(int arr[], int size) {
		int arr1[] = new int[size];

		for (int i = 0; i < size; i++) {
			arr1[i] = arr[i];
		}

		for (int i : arr) {
			System.out.println(i);
		}
		
	}

	public static void Question6(int arr[], int size) {
		int max = arr[0];
		int min = arr[0];
		for (int iTemp = 0; iTemp < size; iTemp++) {
			if (max < arr[iTemp]) {
				max = arr[iTemp];
			}
			if (min > arr[iTemp]) {
				min = arr[iTemp];
			}
		}
		System.out.println("Max : " + max);
		System.out.println("Min : " + min);
	}

	public static void Question7(int[] arr, int size) {
		for (int iTemp = 0; iTemp < size - 1; iTemp++) {
			for (int jTemp = iTemp + 1; jTemp < size; jTemp++) {
				if (arr[iTemp] <= arr[jTemp]) {
					int temp = arr[iTemp];
					arr[iTemp] = arr[jTemp];
					arr[jTemp] = temp;
				}
			}
		}
	}

	public static void Question8(int arr[], int size) {
		System.out.println("In Que 8");
		Question2(arr, size);
		for (int iTemp = 1; iTemp < size; iTemp++) {
			if (arr[iTemp - 1] != arr[iTemp]) {
				System.out.print(arr[iTemp-1]);
			}
		}

		if (arr[size - 2] != arr[size - 1]) {
			System.out.print(arr[size - 1]);
		}
	}

}