package binarySearch;

import java.util.Arrays;

public class Ceiling {

	public static void main(String[] args) {
		int arr[] = { -18, -10, 0, 3, 5, 9, 12, 19, 20, 140 };
		int target = 7;
		int ans = ceiling(arr, target);
		System.out.println(Arrays.toString(arr));
		System.out.println("Target is : " + target);
		System.out.println("Position of ceiling element is : " + ans);
	}

//assuming array is sorted in ascending order
	static int ceiling(int[] arr, int target) {
		if (target > arr[arr.length - 1]) {
			System.out.println("No element is found");
			return -1;
		}
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			// mid = start+end/2 but this maybe possible that start + end exceeds the value
			// of integer
			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		return start;
	}
}