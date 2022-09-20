package linearSearch;

public class FindMin {

	public static void main(String[] args) {
		int[] arr = { 23, 45, 67, 8, 9, 0, -2, 3 };
		System.out.println(min(arr));

	}

	// assuming arr.length != 0;
	static int min(int[] arr) {
		int ans = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < ans) {
				ans = arr[i];
			}
		}
		return ans;
	}

}
