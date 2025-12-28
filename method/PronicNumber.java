package method;

import java.util.Scanner;

public class PronicNumber {

	public static void main(String[] args) {

		PronicNumber pronic = new PronicNumber();

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number :");
		int num = scan.nextInt();

		if (pronic.pronicNumber(num))
			System.out.println(num + " is Pronic Number");
		else
			System.out.println(num + " is Not Pronic Number");
	}

	public boolean pronicNumber(int num) {

		for (int i = 0; i <= num; i++) {
			if (i * (i + 1) == num)
				return true;
		}
		return false;
	}
}
