package linearSearch;

//LeetcodeQuestion https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigit {
	public static void main(String[] args) {
		int[] nums = { 12, 345, 2, 6, 7896, -22 };
		System.out.println(findNumbers(nums));
	}

	static int findNumbers(int[] nums) {
		int count = 0;
		for (int num : nums) {
			if (even(num)) {
				count++;
			}
		}
		return count;
	}

	// check whether a number contains even digit of numbers or not
	static boolean even(int num) {
		int numberofdigit = digits(num);
//		if (numberofdigit % 2 == 0) {return true;}	return false;
		return numberofdigit % 2 == 0;
	}

	// counting number of digit in a number
	static int digits(int num) {
		int count = 0;
		if (num < 0) {
			num = num * -1;
		}
		if (num == 0) {
			return 1;
		}
		while (num > 0) {
			count++;
			num = num / 10;
		}
		return count;
	}
}
