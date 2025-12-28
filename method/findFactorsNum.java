package method;

import java.util.Scanner;

public class findFactorsNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number:");
		int n = scan.nextInt();

		findFactor(n);

	}

	public static void findFactor(int n) {

		for (int i = 1; i <= n; i++) {

			if (n % i == 0)
				System.out.println("factor of " + n + " is :" + i);
		}
		return;
	}
}
