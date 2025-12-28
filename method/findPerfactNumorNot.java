package method;

import java.util.Scanner;

public class findPerfactNumorNot {

	public static void main(String[] args) {

		findPerfactNumorNot perfact = new findPerfactNumorNot();

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number:");
		int n = scan.nextInt();

		int res = perfact.findFactorSum(n);

		if (res == n)
			System.out.println(n+" is Perfact Number");
		else
			System.out.println(n+" is Not Perfact Number");
	}

	public int findFactorSum(int n) {
		int sum = 0;

		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0)
				sum += i;
		}

		return sum;
	}
}
