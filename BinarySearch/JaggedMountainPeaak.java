package binarySearch;
//https://leetcode.com/problems/find-peak-element/

public class JaggedMountainPeaak {
//jagged array mountain peak
	/*
	 * Input: nums = [2, 3, 4, 5, 6, 3, 2, 1, 7, 8, 9, 2, 0] Your function can
	 * return either index number 4 where the peak element is 6, or index number 10
	 * where the peak element is 9.
	 */
	
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 5, 6, 3, 2, 1, 7, 8, 9, 2, 0 };
		int ans = findPeakElement(arr);
		System.out.println("position of element : " + ans);
		System.out.println("value at this position is: " + arr[ans]);
	}

	public static int findPeakElement(int[] nums) {
		int start = 0;
		int end = nums.length - 1;
		while (start < end) {
			int mid = start + (end - start) / 2;

			if (nums[mid] > nums[mid + 1]) {
				// in decreasing part , this maybe the ans but we have to check at left also ,
				// so end =mid
				end = mid;
			} else { // you are in asc. parted
				start = mid + 1;
			} // bcoz we that arr[mid]>arr[mid +1]
		}
		return start; // bot end and start points at one location that is the ans
	}
}
