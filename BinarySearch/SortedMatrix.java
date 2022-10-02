package binarySearch;

import java.util.Arrays;

public class SortedMatrix {

	public static void main(String[] args) {
	        int[][] arr = {
	                {1, 2, 3},
	                {4, 5, 6},
	                {7, 8, 9}
	        };
	        System.out.println(Arrays.toString(search(arr, 9)));
	    }
	static int[] search(int[][] matrix, int target) {
		int rows = matrix.length;
		int cols = matrix[0].length; //also check if matrix is empty
		if (cols == 0){
            return new int[] {-1,-1};
        }
		if (cols == 0){
            return new int[] {-1,-1};
        }
		if (rows == 1) {
            return binarySearch(matrix,0, 0, cols-1, target);
        }
		
		int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;
	}
	
	// search in the row provided between the cols provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }
}
