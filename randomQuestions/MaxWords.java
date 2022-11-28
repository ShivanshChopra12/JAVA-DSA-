package randomQuestions;

//https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/submissions/
public class MaxWords {

	public static void main(String[] args) {

		String[] s = { "alice and bob love leetcode", "i think so too", "this is great thanks very much" };
		System.out.println(mostWordsFound(s));
	}

	public static int mostWordsFound(String[] sentences) {
		int max = 0;
		for (String s : sentences) {
			int count = 1;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == ' ')
					count++;
			}
			max = Math.max(max, count);
		}
		return max;
	}
}
