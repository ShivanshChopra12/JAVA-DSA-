package randomQuestions;

//https://leetcode.com/problems/power-of-two/submissions/
public class PowerOfTwo {
	public static void main(String[] args) {
		int a = 19;
		System.out.println(isPowerOfTwo(a));
	
	}

	public static boolean isPowerOfTwo(int n) {
		if (n < 1) {
			return false;
		}
		if (n == 1) {
			return true;
			
		}
		if (n % 2 == 1) {
			return false;
		}
		return (isPowerOfTwo(n / 2));
	}
}
