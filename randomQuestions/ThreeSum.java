package randomQuestions;

//https://leetcode.co/problems/3sum/
import java.util.*;

public class ThreeSum {

	public static void main(String[] args) {
		int arr[] = { -1, 0, 1, 2, -1, -4 };
		System.out.println(threeSum(arr));
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		Set<List<Integer>> res = new HashSet<>(); // Sets list bcz no duplicates
		if (nums.length == 0)
			return new ArrayList<>(res);
		Arrays.sort(nums); // sorted the array by default ascending
		for (int i = 0; i < nums.length - 2; i++) {
			int j = i + 1; // i at 0 ; j at i=1 and k at last
			int k = nums.length - 1;
			while (j < k) {
				int sum = nums[j] + nums[k];
				if (sum == -nums[i]) { // sum of k and j = - i then we can say i+j+k=0
					res.add(Arrays.asList(nums[i], nums[j], nums[k]));
					j++;
					k--;
				} else if (sum > -nums[i]) // if sum is greater that means we have to reduce so k-- , bcz array is
											// ascending , so k-- will reduce the sum
					k--;
				else if (sum < -nums[i]) // to inc the sum , inc j
					j++;
			}
		}
		return new ArrayList<>(res);
	}

}
