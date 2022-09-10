package simple.java;
import java.util.*;
public class Prime {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		boolean ans = isPrime(n);
		System.out.println(ans);
in.close();
	}
	static boolean isPrime(int n) {
		if(n<=1) {
			return false;
			
		}
		int c = 2;
		while(c*c <=n) {
				if (n % c ==00) {return false;}
				c++;
		}
		//if (c*c>n) {return true;} return false;  This line can be written as below
		return(c*c >n);
	}
}
