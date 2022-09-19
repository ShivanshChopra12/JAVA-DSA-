package binarySearch;

import java.util.Arrays;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class FirstAndLastPosition {
	public static void main(String[] args) { 
		int nums[] = { 1, 2, 3, 4, 5, 6, 7, 7, 8, 8, 9 };
		int target = 7;
		System.out.println(Arrays.toString(searchRange(nums, target)));
	}

	public static int[] searchRange(int[] nums, int target) {
		int ans[] = { -1, -1 };
		int Start = search(nums, target, true);
		int end = search(nums, target, false);

		ans[0] = Start;
		ans[1] = end;

		return ans;
	}

	static int search(int[] nums, int target, boolean FindStartIndex) {
		int ans = -1;
		int start = 0;
		int end = nums.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target < nums[mid]) {
				end = mid - 1;
			} else if (target > nums[mid]) {
				start = mid + 1;
			} else {
				ans = mid;
				if (FindStartIndex == true) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return ans;
	}
}
