package binarySearch;

// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class InfiniteArray {

	public static void main(String[] args) {
		int arr[] = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170, 198, 210 };
		int target = 10;
		System.out.println(ans(arr, target));
	}

	static int ans(int[] arr, int target) {
		// first start with a box of size 2
		int start = 0;
		int end = 1;

		// condition for target to lie in the range
		while (target > arr[end]) {
			int NewStart = end + 1;
			end = end + (end - start + 1) * 2;
			start = NewStart;
		}
		return binarysearch(arr, target, start, end);
	}

	static int binarysearch(int[] arr, int target, int start, int end) {
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
		return -1;
	}
}