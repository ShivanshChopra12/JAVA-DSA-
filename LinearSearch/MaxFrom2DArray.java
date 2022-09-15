package linearSearch;

import java.util.Arrays;

//import java.util.Arrays;

public class MaxFrom2DArray {

	public static void main(String[] args) {
		int arr[][] = { { 3, 5, 7, 88 }, { 43, 77, 1, 0 }, { -23, 34, 124, 69 }, };
		System.out.println((max(arr))); // Arrays.toString not used bcz we are printing integer , not an array
	}

	static int max(int[][] arr) {
		int max = Integer.MIN_VALUE;
		for (int[] ints : arr) {
			for (int element : ints) {
				if (element > max) {
					max = element;
				}
			}
		}
		return max;
	}
}
