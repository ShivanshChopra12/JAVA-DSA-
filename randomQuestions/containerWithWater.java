package randomQuestions;

//https://leetcode.com/problems/container-with-most-water/
public class containerWithWater {

	public static void main(String[] args) {
		int arr[] = { 1, 98, 6, 2, 5, 4, 10, 3, 7 };
		System.out.println(maxArea(arr));
	}

	public static int maxArea(int[] height) {
		int l = 0; // left pointer at 0
		int r = height.length - 1; // right pointer at array end
		int max = 0; // max area 0 initiate
		while (l < r) {
			int lh = height[l];
			int rh = height[r];
			int min_h = Math.min(lh, rh); // find min btwn lh and rh
			max = Math.max(max, min_h * (r - l));
			// area=min_height * (r-l) //min height bcz max water isi height tak bhrega
			// next step , whichever height is smaller just go to next value for checking
			// right will go behind and left will go right side
			if (lh < rh)
				l++;
			else
				r--;
		}
		return max;
	}
}
