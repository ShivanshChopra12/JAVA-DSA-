package randomQuestions;

import java.util.Arrays;

public class SortPeople {

	public static void main(String args[]) {
		String[] names = { "Mary", "John", "Emma" };
		int[] heights = { 120, 15, 121 };

		System.out.println(Arrays.toString(Sort(names, heights)));
	}

	public static String[] Sort(String[] names, int[] heights) {
		// using bubble sort
		for (int i = 0; i < heights.length - 1; i++) {
			for (int j = 0; j < heights.length - 1 - i; j++) {
				if (heights[j] < heights[j + 1]) {
					int temp = heights[j];
					heights[j] = heights[j + 1];
					heights[j + 1] = temp;

					// in names string
					String temps = names[j];
					names[j] = names[j + 1];
					names[j + 1] = temps;
				}
			}
		}
		return names;
	}

}
