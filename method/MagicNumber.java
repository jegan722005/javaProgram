package method;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {

		MagicNumber magic = new MagicNumber();

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number :");
		int num = scan.nextInt();
		

		if (magic.magicNumber(num))
			System.out.println(num + " is Magic Number");
		else
			System.out.println(num + " is Not Magic Number");

	}

	public boolean magicNumber(int num) {
		while (num > 9) {
			int sum = 0;
			while (num > 0) {
				sum += num % 10;
				num /= 10;
			}
			num = sum;
		}
		return num == 1;
	}
}
