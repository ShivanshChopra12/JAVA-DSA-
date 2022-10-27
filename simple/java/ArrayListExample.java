package simple.java;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(5);
		Scanner sc = new Scanner(System.in);
		// list.add(1);
		// list.add(2);
		// list.add(13);
		// list.add(17);
		// System.out.println(list);
//input
		for (int i = 0; i < 5; i++) {
			list.add(sc.nextInt());
		}
		// output
		for (int i = 0; i < 5; i++) {
			System.out.println(list.get(i));
		}
		sc.close();
	}
}
