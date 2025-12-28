package method;

import java.util.Scanner;

public class DuckNumber {

	public static void main(String[] args) {

		DuckNumber duck = new DuckNumber();

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number :");
		int num = scan.nextInt();

		if (duck.isDuckNumber(num))
			System.out.println(num + " is Duck Number");
		else
			System.out.println(num + " is Not Duck Number");
	}

	public boolean isDuckNumber(int num) {

		int temp = num;
		int firstDigit = num;
		while (firstDigit >= 10) {
			firstDigit /= 10;
		}
		if (firstDigit == 0)
			return false;

		else {
			while (temp > 0) {
				int digit = temp % 10;
				if (digit == 0) {
					return true;
				}
				temp /= 10;
			}
		}

		return false;
	}
}
