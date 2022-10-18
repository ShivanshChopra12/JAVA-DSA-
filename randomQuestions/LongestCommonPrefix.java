package randomQuestions;

//14. Longest Common Prefix
//https://leetcode.com/problems/longest-common-prefix/
public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs = { "flower", "flow", "flight" };
		System.out.println(longestCommonPrefix(strs));
	}

	static public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) {
			return "";
		}
		String prefix = strs[0]; // prefix = "flower"
		for (int i = 1; i < strs.length; i++) {
			while (strs[i].indexOf(prefix) != 0) { // i =1 , strs me "flow" //flow.indexof flower != 0, condition true ,
													// enter the loop
				prefix = prefix.substring(0, prefix.length() - 1);
				// 1st pass, flower - 1 = flowe //2nd pass flowe -1 = flow
				// now i = 2 //1st pass = flow -1 = flo //2nd pass flo -1 = fl
				// fl is common prefix in all , so we got the ans
				if (prefix.isEmpty()) {
					return "";
				}
			}
		}
		return prefix;
	}
}
