package string;

import java.util.ArrayList;

public class Operators {

	public static void main(String[] args) {
		System.out.println('a' + 'b');
		System.out.println("a" + "b");
		System.out.println('a' + 3);
		System.out.println((char) ('a' + 3));
		System.out.println("a" + 3); // integer will be converted to Integer(Wrapper class)
										// which calls toString()

		System.out.println("Shivansh" + new ArrayList<>());
		System.out.println("Shivansh" + new Integer(56));

		// System.out.println(new ArrayList<>() + new Integer(56)); //Can't run bcz
			// operator + is only defined for primitives and String
			//There should be one String object eg;
		System.out.println(new ArrayList<>() +""+ new Integer(56));

		
	}
}
