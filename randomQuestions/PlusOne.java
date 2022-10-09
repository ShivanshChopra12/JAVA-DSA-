package randomQuestions;

//https://leetcode.com/problems/plus-one/submissions/

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		int[] arr = { 9, 9, 9, 9 };
		System.out.println(Arrays.toString(plusOne(arr)));
	}

	public static int[] plusOne(int[] digits) {
		int n = digits.length;
//starting from last digit, if it is 0-8 then +1;
//if last digit is 9 then last digit = 0 , it is working in loop and then same goes for second last digit
		for (int i = n - 1; i >= 0; i--) {
			if (digits[i] != 9) {
				digits[i]++;
				break;
			} else {
				digits[i] = 0;
			}
		}
//if first digit is 0 after the above loop worked , 
//then make new array of size of prev. arr+1 and put first element = 1
		if (digits[0] == 0) {
			int result[] = new int[n + 1];
			result[0] = 1;
			return result;
		}
		return digits;
	}
}
