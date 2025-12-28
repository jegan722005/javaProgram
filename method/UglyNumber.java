package method;

import java.util.Scanner;

public class UglyNumber {

	public static void main(String[] args) {

		UglyNumber ugly = new UglyNumber();

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number :");
		int num = scan.nextInt();

		if (ugly.isugly(num))
			System.out.println(num + " is Ugly Number");
		else
			System.out.println(num + " is Not Ugly Number");
	}

	public boolean isugly(int num) {

		if (num <= 0)
			return false;

		while (num % 2 == 0)
			num /= 2;
		while (num % 3 == 0)
			num /= 3;
		while (num % 5 == 0)
			num /= 5;

		return num == 1;
	}
}
