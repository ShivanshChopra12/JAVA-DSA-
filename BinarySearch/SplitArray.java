package binarySearch;

public class SplitArray {

	public static void main(String args[]) {

	}

	public int spilitarray(int nums[], int m) {
		int start = 0;
		int end = 0;

		for (int i = 0; i < nums.length; i++) {
			start = Math.max(start, nums[i]); // largest element in array
			end = end + nums[i]; // sum of whole array
			// range = {largest element , sum of array}
		}

		// binary search
		while (start < end) {

			int mid = start + (end - start) / 2;

			// calculate how many pieces we can divide this with this max sum
			int sum = 0;
			int pieces = 1;
			for (int num : nums) {
				if (sum + num > mid) {
					// sum + num should not exceed mid value
					// isko array me add nhi kr skte h
					// we have to make new subarray and add no. in new subarray ,then sum = num

					sum = num; // new array me sum chl pda
					pieces++; // array 2
				} else {
					sum += num;
				}
			}

			if (pieces > m) {
				start = mid + 1;
			} else {
				end = mid;
			}
		}
		return end; // end == start
	}
}
