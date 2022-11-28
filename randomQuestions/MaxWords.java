package randomQuestions;

public class MaxWords {

	public static void main(String[] args) {

	}

	public int mostWordsFound(String[] sentences) {
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
