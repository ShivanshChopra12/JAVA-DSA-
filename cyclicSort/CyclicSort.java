package cyclicSort;

import java.util.Arrays;

//when no.s are given from range 1 to N = use cyclic sort
public class CyclicSort {
	public static void main(String[] args) {
		int arr[] = { 3, 5, 2,2, 1, 4 };
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	// 0th position pe 1, 1st position pe 2 ; means value at a given position must
	// be on value -1 position
	public static void sort(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			int correct = arr[i] - 1;
			if (arr[i] < arr.length && arr[i] != arr[correct]) { // arr[i] != i+1 we can use this too
				swap(arr, i, correct); // {2,5,3,1,4}, {5,2,3,1,4},{4,2,3,1,5},{1,2,3,4,5}
			} else {
				i++;
			}
		}
	}

	public static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
