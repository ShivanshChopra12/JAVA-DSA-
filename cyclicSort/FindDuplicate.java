package cyclicSort;

//https://leetcode.com/problems/find-the-duplicate-number/
public class FindDuplicate {

	public static void main(String[] args) {
		int nums[] = { 1, 3, 4, 2, 2 };

		System.out.println(findDuplicate(nums));
	}

	public static int findDuplicate(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			if (arr[i] != i + 1) {
				int correct = arr[i] - 1;
				if (arr[i] < arr.length && arr[i] != arr[correct]) {
					swap(arr, i, correct); // last case= 1,2,3,4,2 , i=4,correct =1 ,
											// arr[i]=2,arr[correct]=2 , so no swapping ans= 2
				} else {
					return arr[i];
				}
			} else
				i++;
		}
		return -1;
	}

	public static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}