package binarySearch;

public class DuplicateElementsRBS {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 6, 7, 7, 7, 0, 1, 2, 2 };
		int target = 2;
		int ans = search(arr, target);
		System.out.println("Pivot position is : " + FindPivotWithDuplicates(arr));
		System.out.println("Target position is " + ans);

	}

	public static int search(int[] nums, int target) {
		int pivot = FindPivotWithDuplicates(nums);

		if (pivot == -1) {
			// if pivot is -1 , that means array is not rotated , just perform normal binary
			// search
			return BinarySearch(nums, target, 0, nums.length - 1);
		}

		// if we found a pivot , then it means we got 2 ascending arrays
		if (nums[pivot] == target) {
			return pivot;
		}
		if (target >= nums[0]) {
			// bcz all no. after pivot are smaller than start
			return BinarySearch(nums, target, 0, pivot - 1);
		}

		// bcz all element before pivot are greater than target
		return BinarySearch(nums, target, pivot + 1, nums.length - 1);
	}

	static int FindPivotWithDuplicates(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			if (mid > start && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}

			// if element at start, mid , end are same, just remove the duplicate elements
			if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
				// skipping the duplicates

				// check if start is pivot
				if (arr[start] > arr[start + 1]) {
					return start;
				}
				start++;

				// check if end is pivot
				if (arr[end] < arr[end - 1]) {
					return end - 1;
				}
				end--;
			}
			// left side is sorted , so pivot should be in right
			else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}

	static int BinarySearch(int[] arr, int target, int start, int end) {

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
