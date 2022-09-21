package binarySearch;

//https://leetcode.com/problems/find-in-mountain-array/

public class FindInMountainArray {

	public static void main(String[] args) {
		int arr[] = { 20, 30, 40, 60, 50, 42, 2 };
		int target = 30;
		int ans = Search(arr, target);
		System.out.println(ans);

	}

	static int Search(int[] arr, int target) {
		int peak = PeakIndexMountain(arr);
		int FirstTry = OrderAgnosticBS(arr, target, 0, peak);
		if (FirstTry != -1) {
			return FirstTry;
		}
		return OrderAgnosticBS(arr, target, peak + 1, arr.length - 1);
	}

	public static int PeakIndexMountain(int arr[]) {
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] > arr[mid + 1]) {
				// in decreasing part , this maybe the ans but we have to check at left also ,
				// so end =mid
				end = mid;
			} else { // you are in asc. part
				start = mid + 1;
			} // bcoz we that arr[mid]>arr[mid +1]
		}
		return start; // both end and start points at one location that is the ans
	}

	static int OrderAgnosticBS(int[] arr, int target, int start, int end) {
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
