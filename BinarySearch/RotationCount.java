package binarySearch;

public class RotationCount {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
		System.out.println("Pivot position is : " + FindPivot(arr));

		// no. of rotation = pivot +1
		System.out.println("Count is : " + Count(arr));
	}

	static int Count(int[] arr) {
		int pivot = FindPivot(arr);
		return pivot + 1;
	}
	
	static int FindPivot(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			// 4 cases here
			if (mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			if (mid > start && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}
			if (arr[mid] <= arr[start]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}
}
