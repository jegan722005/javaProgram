package method;

import java.util.Scanner;

public class checkArmstrongNumOrNot {

	public static void main(String[] args) {

		checkArmstrongNumOrNot armstrong = new checkArmstrongNumOrNot();

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number:");
		int num = scan.nextInt();

		if (armstrong.armstrongNum(num))
			System.out.println(num + " is ArmStrong Number");
		else
			System.out.println(num + " is Not ArmStrong Number");
	}

	public boolean armstrongNum(int num) {

		int n = countDigit(num);

		int sum = 0, temp = num;
		for (int i = num; i > 0; i /= 10) {

			int x = i % 10;
			sum += xpowerN(x, n);
		}
		return sum == temp;

	}

	public int countDigit(int num) {
		int count = 0;
		while (num > 0) {
			count++;
			num /= 10;
		}
		return count;
	}

	public int xpowerN(int x, int n) {

		double power = Math.pow(x, n);
		return (int) power;
	}
}
