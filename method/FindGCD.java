package method;

import java.util.Scanner;

public class FindGCD {

	public static void main(String[] args) {

		FindGCD gcd = new FindGCD();

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number a:");
		int a = scan.nextInt();
		System.out.print("Enter Number b:");
		int b = scan.nextInt();

		System.out.println("GCD ("+a+","+b+") is :"+gcd.findGcd(a, b));
	}

	public int findGcd(int a, int b) {

		int ans = 0;
		int min = Math.min(a, b);

		for (int i = 1; i <= min; i++) {

			if (a % i == 0 && b % i == 0)
				ans = i;
		}
		return ans;

	}
	/*
	 int min=Math.min(a,b);
	 int max=Math.max(a,b);
	 return max%min;
	 */

}
