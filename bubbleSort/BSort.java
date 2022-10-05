package bubbleSort;

import java.util.Arrays;

public class BSort {

	public static void main(String[] args) {
		int arr[] = {7,8,3,4,1};
		bubble(arr);
		System.out.println(Arrays.toString(arr));

	}

	public static void bubble(int[] arr) {
		boolean swapped;// even if we get sorted array it will check for all cases till loop ends so we
						// are terminating it with a break condition

		// run n-1 times
		for (int i = 0; i < arr.length; i++) {
			swapped = false;
			// after each pass , max value will get at last
			for (int j = 1; j <= arr.length - i - 1; j++) {
				// swap if the item is smaller than the previous item
				if (arr[j] < arr[j - 1]) {
					// swap
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					swapped = true;
				}
			}
			// if it did not swap for a particular value of i, means array is sorted so stop
			// the loop
			if (swapped == false) {
				break;
			}
		}
	}
}