package method;

import java.util.Scanner;

public class CheckSunnyNumber {

	public static void main(String[] args) {
		CheckSunnyNumber sunny = new CheckSunnyNumber();

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number :");
		int num = scan.nextInt();

		if (sunny.isSunny(num))
			System.out.println(num + " is Sunny Number");
		else
			System.out.println(num + " is Not Sunny Number");
	}

	public boolean isSunny(int num) {

		int x = num + 1;

		int sqrt = (int) Math.sqrt(x);

		return sqrt * sqrt == x;  
//		for (int i = 1; i * i <= num + 1; i++) {
//
//			if (i * i == num + 1)
//				return true;
//		}
//		return false;
	}
}
