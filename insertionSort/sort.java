package insertionSort;

import java.util.Arrays;

public class sort {
	public static void main(String[] args) {
		int arr[] = { 4, 5, 1, 2, 0 };
		InsertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

//let i=1(5), j =i+1=2(1) ,if j-1>j ,swap j and j-1, j-1=1(5), 5>1 so swap , now arr= 4,1,5,2,0, j-- 
	// now j=1(1),j-1=0(4) if j-1>j(4>1) then swap ,so now arr = 1,4,5,2,0
	// ,similarly continue this

	public static void InsertionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (arr[j - 1] > arr[j]) {
					swap(arr, j);
				} else {
					break;
				}
			}
		}
	}

	public static void swap(int[] arr, int j) {
		int temp = arr[j - 1];
		arr[j - 1] = arr[j];
		arr[j] = temp;
	}

}
