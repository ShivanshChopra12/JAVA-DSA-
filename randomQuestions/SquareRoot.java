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
	/*
	 * public int mySqrt(int x) { 
	 * if (x==0) return 0; 
	 * int s= 1; int e= x; int res=0;
	 * while(s <= e){
	 *  int mid = s+(e-s)/2;
	 *   if(mid <= x/mid){
	 *    res=mid; s=mid+1;
	 *     }else 
	 *     {
	 *      e=mid-1; } 
	 *      } return res;
	 *       }
	 */
}
