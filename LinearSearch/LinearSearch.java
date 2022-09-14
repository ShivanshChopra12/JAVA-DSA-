package practice;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		System.out.println("Enter Value");
		Scanner sc = new Scanner(System.in);
		int[] nums = { 23, 45, 67, 8, 9, 0, -2, 3 };
		int target = sc.nextInt();
		int ans = linearsearch(nums, target);
		System.out.println("Position is :" + ans);
		sc.close();
	}

	static int linearsearch(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}
		for (int index = 0; index < arr.length; index++) { // arr.length in this length is variable ;whereas in
															// str.length() this is a function but internally it is
															// calling .length only
			int element = arr[index];
			if (element == target) {
				return index;
			}
		}
		return Integer.MAX_VALUE;

	}
}