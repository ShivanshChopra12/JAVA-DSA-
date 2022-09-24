package binarySearch;

// https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/

public class RotatedBinarySearch {

	public static void main(String[] args) {
		int[] arr = {4,5,6,7,0,1,2};
		int target = 2;
		int ans = search(arr,target);
		System.out.println("Pivot position is : " + FindPivot(arr));
		System.out.println("Target position is "+ ans);
		
	}

	public static int search(int[] nums, int target) {
		int pivot = FindPivot(nums);

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
