package method;

import java.util.Scanner;

public class TwinPrimeNumber {

	public static void main(String[] args) {

		TwinPrimeNumber twin = new TwinPrimeNumber();

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number a:");
		int a = scan.nextInt();
		System.out.print("Enter Number b:");
		int b = scan.nextInt();

		if (isPrime(a) && isPrime(b) && (Math.abs(a - b) == 2))
			System.out.println("Twin Prime Number");
		else
			System.out.println("Not Twin Prime Number");
	}
	public static boolean isPrime(int num) {
		
		if(num==0 || num==1)
			return false;
		for(int i=2;i<num;i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}
}
