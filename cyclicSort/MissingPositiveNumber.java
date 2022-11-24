package cyclicSort;

public class MissingPositiveNumber {

	public static void main(String[] args) {

	
	}

	public static int missingnumber(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			int correct = arr[i] - 1;
			if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
				swap(arr, i, correct);
			} else {
				i++;
			}
		}

		// searching for first missing element
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != index + 1) {
				return index + 1;
			}
		}
		return arr.length + 1; // {1,2,3,4} so return 5 bcz 5 is the smallest positive missing no.
	}

	public static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}