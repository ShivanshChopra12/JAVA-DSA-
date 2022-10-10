package randomQuestions;

//https://leetcode.com/problems/move-zeroes/
import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 0, 3, 4, 5 };
		moveZeroes(arr);
	}

	public static void moveZeroes(int[] nums) {
		int n = nums.length;
		// if array has one element then return same
		if (n == 0 || n == 1) {
			return;
		}

		// two iterators left and right
		// if right found 0 then skip and if find any other no. then replace with left
		// then both ++
		int left = 0;
		int right = 0;

		while (right < n) {
			if (nums[right] == 0) {
				right++;
			} else {
				int temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;
				left++;
				right++;
			}
		}
		System.out.println(Arrays.toString(nums));
	}
}
