package method;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {

		CheckPalindrome palin = new CheckPalindrome();

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number:");
		int num = scan.nextInt();

		if (palin.isPalindrome(num))
			System.out.println(num + " is Palindrome");
		else
			System.out.println(num + " is Not Palindrome");

	}

	public boolean isPalindrome(int num) {

		int rev = 0, temp = num;
		while (num > 0) {
			rev = (rev * 10) + (num % 10);
			num /= 10;
		}
		return rev == temp;
	}
}
