package randomQuestions;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicatesSArray {
	public static void main(String Args[]) {
		int nums[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		System.out.println(removeDuplicates(nums));
	}

	public static int removeDuplicates(int[] nums) {
		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[i] != nums[j]) {
				nums[++i] = nums[j];
			}
		}
		return i + 1;
	}
}