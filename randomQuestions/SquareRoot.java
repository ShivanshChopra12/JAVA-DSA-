package randomQuestions;
//https://leetcode.com/problems/sqrtx/

public class SquareRoot {

	public static void main(String[] args) {
		int a = 8;
		System.out.println(mySqrt(a));
	}

	public static int mySqrt(int x) {
		long s = 0;
		long e = x;
		while (s + 1 < e) {
			long mid = s + (e - s) / 2;
			if (mid * mid == x) {
				return (int) mid;
			} else if (mid * mid < x) {
				s = mid;
			} else {
				e = mid;
			}
		}
		if (e * e == x) {
			return (int) e;
		} else
			return (int) s;
	}
}
