package method;

import java.util.Scanner;

public class CheckAutoBiographicalNum {

	public static void main(String[] args) {

		CheckAutoBiographicalNum bio = new CheckAutoBiographicalNum();

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number:");
		int num = scan.nextInt();

		if (bio.isAutoBiographical(num))
			System.out.println(num + " is AutoBiographicalNumber");
		else
			System.out.println(num + " is Not AutoBiographicalNumber");

	}

	public boolean isAutoBiographical(int num) {

		int count = 0, sum = 0;

		while (num > 0) {
			sum += num % 10;
			count++;
			num /= 10;
		}
		return count == sum;
	}
}
