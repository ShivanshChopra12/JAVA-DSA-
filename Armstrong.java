package simple.java;
import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);			
		System.out.println("ENTER THE NUMBER");
		int n = in.nextInt();
		boolean ans = isArmstrong(n);
		System.out.println(ans);
		in.close();
	
		System.out.print("All Armstrong no. btw 100 & 100 are :");
		for (int i=100;i<1000;i++) {
			if(isArmstrong(i)) {
				System.out.print(i + " ");
			}}
	}
	static boolean isArmstrong(int n) {
		int original = n; 
		int sum = 0;
		
		while(n>0) {
			int rem = n%10; 
			n= n/10;
			sum = sum+ rem*rem*rem;
		}
		return sum==original;
	}
	
			}
