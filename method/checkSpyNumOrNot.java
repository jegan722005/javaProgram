package method;

import java.util.Scanner;

public class checkSpyNumOrNot {

	public static void main(String[] args) {
		checkSpyNumOrNot spy = new checkSpyNumOrNot();

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number:");
		int num = scan.nextInt();

		if (spy.checkSpyNum(num))
			System.out.println(num + " is Spy Number");
		else
			System.out.println(num + " is Not Spy Number");

	}

	public boolean checkSpyNum(int num) {

		int add_num = 0, multiple_num = 1;
		while (num > 0) {
			int digit = num % 10;

			add_num += digit;
			multiple_num *= digit;
			num/=10;
		}
		return add_num == multiple_num;
	}
}
