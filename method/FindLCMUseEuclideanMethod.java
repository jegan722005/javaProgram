package method;

import java.util.Scanner;

public class FindLCMUseEuclideanMethod {

	public static void main(String[] args) {

		FindLCMUseEuclideanMethod lcmEuclidean = new FindLCMUseEuclideanMethod();

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number a:");
		int a = scan.nextInt();
		System.out.print("Enter Number b:");
		int b = scan.nextInt();

		System.out.println("GCD (" + a + "," + b + ") is :" + lcmEuclidean.findLcm(a, b));
		;
	}

	public int findLcm(int a, int b) {

		int x=a,y=b;
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		int gcd=0;
		if(b==0)
			gcd=a;
		int lcm = (x* y)/gcd;
		return lcm;
	}
}
