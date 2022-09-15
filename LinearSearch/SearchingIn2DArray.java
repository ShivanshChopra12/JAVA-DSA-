package linearSearch;

import java.util.Arrays;

public class SearchingIn2DArray {

	public static void main(String[] args) {
		int arr[][] = { { 3, 5, 7, 88 }, { 43, 77, 1, 0 }, { -23, 34, 124, 69 }, };
		int target = 34;
		System.out.println(Arrays.toString(search(arr, target)));
	}

	static int[] search(int[][] arr, int target) {

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] == target) {
					return new int[] { row, col };
				}
			}
		}
		return new int[] {-1,-1};
	}

}
