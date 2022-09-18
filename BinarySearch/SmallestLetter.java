package binarySearch;

public class SmallestLetter {
	// https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/
	public static void main(String[] args) {
		char[] letters = { 'c', 'f', 'i' };
		char target = 'g'; //if c then  f ; if f then i ; if g then i , if a or b then c 
		System.out.println(nextGreatestLetter(letters, target));
	}
	public static char nextGreatestLetter(char[] letters, char target) {
		int start = 0;
		int end = letters.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target < letters[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return letters[start % letters.length];
	}
}