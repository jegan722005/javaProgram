package method;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {

		HarshadNumber harshad = new HarshadNumber();

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number :");
		int num = scan.nextInt();

		if (harshad.harshadNumber(num))
			System.out.println(num + " is Harshad Number");
		else
			System.out.println(num + " is Not Harshad Number");
	}
	public boolean harshadNumber(int num) {
		
		int temp=num;
		int sum=0;
		while(temp>0) {
			sum+=temp%10;
			temp/=10;
		}
		return num%sum==0;
	}
}
