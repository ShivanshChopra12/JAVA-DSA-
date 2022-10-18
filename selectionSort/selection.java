package selectionSort;

import java.util.Arrays;
public class selection {

	public static void main(String[] args) {
		int[] arr = { 3, 1, 5, 2, 4 };
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	// find the maximum array in the remaining array and swap it with correct index
	static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int last = arr.length - i - 1;
			int maxIndex = getMaxIndex(arr, 0, last);
			swap(arr, maxIndex, last);
		}
	}

	// this will return the maximum value in array
	static int getMaxIndex(int[] arr, int start, int last) {
		int max = start;
		for (int i = start; i < last; i++) {
			if (arr[max] < arr[i]) {
				max = i;
			}
		}
		return max;
	}

	// swap the largest with its proper index
	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
