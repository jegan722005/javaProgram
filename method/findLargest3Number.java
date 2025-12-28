package method;

import java.util.Scanner;

public class findLargest3Number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a value:");
		int a = scan.nextInt();
		System.out.print("Enter b value:");
		int b = scan.nextInt();
		System.out.print("Enter c value:");
		int c = scan.nextInt();

		int largest = largestNum(a, b, c);
		System.out.println("largest Number:" + largest);
	}

	public static int largestNum(int a, int b, int c) {

		if (a > b && a > c)
			return a;
		else if (b > c)
			return b;
		else
			return c;
	}
}
