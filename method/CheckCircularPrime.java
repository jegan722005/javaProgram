package method;

import java.util.Scanner;

public class CheckCircularPrime {

	public static void main(String[] args) {

		CheckCircularPrime prime = new CheckCircularPrime();

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number :");
		int num = scan.nextInt();

		if (prime.isCirclePrime(num))
			System.out.println(num + " is Circular Prime Number");
		else
			System.out.println(num + " is Not Circular Prime Number");
	}

	public boolean isCirclePrime(int num) {
		int temp = num, count = 0;
		while (num > 0) {
			count++;
			num /= 10;//1.count digit
		}

		for (int i = 1; i <=count; i++) {
			
			int lastDigit = temp % 10;//2.lastDigit
			temp /= 10;
			temp = lastDigit * (int) (Math.pow(10, count - 1)) + temp;//new number kedaikum

			if (!isPrime(temp))//check prime or not
				return false;
		}
		return true;

	}

	public boolean isPrime(int num) {

		if (num == 0 || num == 1)
			return false;

		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
