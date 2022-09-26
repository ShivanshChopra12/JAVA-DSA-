package randomQuestions;
//https://leetcode.com/problems/two-sum/submissions/

public class TwoSumArray {

	public static void main(String[] args) {

	}

	public int[] twoSum(int[] nums, int target) {

		for (int i = 0; i <= nums.length - 1; i++) {
			for (int j = i + 1; j <= nums.length - 1; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		throw new IllegalArgumentException("no match found");
	}
	// 2nd approach
	/*
	 * public int[] twoSum(int[] nums, int target) {
	 * 
	 * for (int i=0;i<=nums.length-1;i++) { for(int j=i+1;j<=nums.length-1;j++) {
	 * int complement= target - nums[i];
	 * 
	 * if(nums[j]==complement){ return new int[] {i,j}; } } } throw new
	 * IllegalArgumentException("no match found"); } }
	 */
}
