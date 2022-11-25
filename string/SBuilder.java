package string;

import java.util.Arrays;

public class SBuilder {

	public static void main(String[] args) {
		StringBuilder a = new StringBuilder();

		// String series = "";
		for (int i = 0; i < 26; i++) {
			char ch = (char) ('a' + i);
			// series = series + ch; // this is making new objects for each a, ab, abc
			a.append(ch); // here we are using stringbuilder , only one object will be created and
							// modified again and again
		}
		System.out.println(a);
		
		a.reverse();
		System.out.println(a);
		String name= "Shivansh Chopra";
		System.out.println(Arrays.toString(name.toCharArray()));
		System.out.println(Arrays.toString(name.split(" ")));
	}

}
