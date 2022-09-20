package binarySearch;

public class MountainArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 3, 2, 1 };
		int ans = PeakIndexMountain(arr);
		System.out.println("position of element : " + ans);
		System.out.println("value at this position is: " + arr[ans]);
	}

	public static int PeakIndexMountain(int arr[]) {
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] > arr[mid + 1]) {
				// in decreasing part , this maybe the ans but we have to check at left also ,
				// so end =mid
				end = mid;
			} else { // you are in asc. part
				start = mid + 1;
			} // bcoz we that arr[mid]>arr[mid +1]
		}
		return start; // both end and start points at one location that is the ans
	}

}
