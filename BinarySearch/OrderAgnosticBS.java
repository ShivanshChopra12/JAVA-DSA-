package binarySearch;

public class OrderAgnosticBS {
	public static void main(String[] args) {
		// int arr[] = { -18, -10, 0, 3, 5, 10, 19, 20, 140 }; //ascending array
		int arr[] = { 140, 90, 45, 30, 16, 7, 1, 0, -28, -42 }; //desc. array
		int target = 16;
		int ans = BS(arr, target);
		System.out.println(ans);
	}

	static int BS(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		boolean isASC = arr[start] < arr[end];

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] == target) {
				return mid;
			}

			if (isASC) {
				if (target < arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (target > arr[mid]) {

					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}

		}
		return -1;
	}
}
