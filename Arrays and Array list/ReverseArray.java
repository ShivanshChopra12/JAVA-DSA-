package simple.java;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int b[] = { 0, 1, 2, 3, 4, 5 };
	
		System.out.println(Arrays.toString(reverse(b)));

	}

	static int[] reverse(int[] q) {
		int start = q[0];
		int end = q.length - 1;

		while (start < end) {
			swap(q, start, end);
			start++;
			end--;
		}
		return q;
	}

	static void swap(int[] q, int start, int end) {
		int temp = q[start];
		q[start] = q[end];
		q[end] = temp;

	}

}
