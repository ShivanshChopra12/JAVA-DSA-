package randomQuestions;

public class SingleNumber {

	public static void main(String[] args) {
		int[] nums = { 2, 2, 1, 1, 3, 3, 3, 5, 3 };
		System.out.println(singleNumber(nums));
	}

	public static int singleNumber(int[] nums) {
		int xor = 0;
		for (int num : nums) {
			xor = xor ^ num;
		}
		return xor;
	}
}
