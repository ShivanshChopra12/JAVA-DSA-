package simple.java;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray2d {
	public static void main(String[] args) {

		int[][] arr = new int[3][3]; // [row][column]
		Scanner in = new Scanner(System.in);

		// int[][] arr2d = { { 1, 2, 3 }, { 5, 6 }, { 9, 7, 0, 4 } };
		// System.out.println(arr.length);
		// input
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = in.nextInt();
			}
		}
		in.close();
		for (int row = 0; row < arr.length; row++) {
			// output
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
		//Using enhanced for loop
		for (int[] X : arr)
			System.out.println(Arrays.toString(X));
	}
}
