package method;

import java.util.Scanner;

public class DisariumNumber {

	public static void main(String[] args) {

		DisariumNumber disarium = new DisariumNumber();

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number :");//ex - 135;
		int num = scan.nextInt();

		if (disarium.disariumNumber(num))
			System.out.println(num + " is Disarium Number");
		else
			System.out.println(num + " is Not Disarium Number");

	}

	public boolean disariumNumber(int num) {

		int sum = 0, temp = num;

		int digit = String.valueOf(num).length();

		while (temp > 0) {
			sum += (int) (Math.pow(temp % 10, digit));

			temp /= 10;
			digit--;
		}

		return num == sum;
	}
}
