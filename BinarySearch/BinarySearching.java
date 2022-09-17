package binarySearch;

public class BinarySearching {

	public static void main(String[] args) {
		int arr[] = { -18, -10, 0, 3, 5, 10, 19, 20, 140 };
		int target = 10;
		int ans = Search(arr, target);
		System.out.println(ans);
	}

//assuming array is sorted in ascending order
	static int Search(int[] arr, int target) {

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
		return -1;

	}
}
