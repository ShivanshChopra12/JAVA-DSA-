package randomQuestions;

//https://leetcode.com/problems/3sum-closest/submissions/
import java.util.Arrays;

public class ThreeSumCloset {

	public static void main(String[] args) {
		int nums[] = { -1, 2, 1, -4 };
		int target = 1;

		System.out.println(threeSumClosest(nums, target));
	}

	public static int threeSumClosest(int[] nums, int target) {
		int res = Integer.MAX_VALUE;

		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 2; i++) {
			int j = i + 1;
			int k = nums.length - 1;
			while (j < k) {
				int cur_sum = nums[i] + nums[j] + nums[k];
				if (cur_sum > target) {
					k--;
				} else {
					j++;
				}

				if (Math.abs(cur_sum - target) < Math.abs(res - target)) {
					res = cur_sum;
				}
			}
		}
		return res;
	}

}
