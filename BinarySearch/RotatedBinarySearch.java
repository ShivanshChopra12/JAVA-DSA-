package binarySearch;

// https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/

public class RotatedBinarySearch {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,6,0,2,3};
        System.out.println(FindPivot(arr));
	}

static int FindPivot(int[] arr) {
	int start =0;
	int end =arr.length-1;
	while (start <= end){
		int mid = start + (end-start)/2;
		//4 cases here
		if (mid < end && arr[mid]> arr[mid+1]) {
			return mid;
		}
		if (mid > start && arr[mid]< arr[mid-1]) {
			return mid-1;
		}
		if (arr[mid]<=arr[start]) {
			end = mid-1;
		}
		else {start =mid +1;}
	}
	return -1;
}

}
