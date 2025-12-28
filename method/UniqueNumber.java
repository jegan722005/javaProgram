package method;

import java.util.Scanner;

public class UniqueNumber {
	public static void main(String[] args) {

		UniqueNumber unique = new UniqueNumber();

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number :");
		int num = scan.nextInt();

		if (unique.uniqueNum(num))
			System.out.println(num + " is Unique Number");
		else
			System.out.println(num + " is Not Unique Number");

	}

	public boolean uniqueNum(int num) {

		int num1 = num, num2;

		while (num1 > 0) {
			int d1 = num1 % 10;
			int count = 0;
			num2=num;

			while (num2 > 0) {
				int d2 = num2 % 10;

				if (d1 == d2)
					count++;
				
				if(count>1)
					return false;
				num2 /= 10;
			}
			num1 /= 10;
		}
		return true;
	}
}
