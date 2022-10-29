package cyclicSort;

//https://leetcode.com/problems/missing-number/
public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		System.out.println(missingnumber(arr));
	}

	public static int missingnumber(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			int correct = arr[i];
			if (arr[i] < arr.length && arr[i] != arr[correct]) {
				swap(arr, i, correct);
			} else {
				i++;
			}
		}

		// searching for first missing element
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != index) {
				return index;
			}
		}
		return arr.length;

	}

	public static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
