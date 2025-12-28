package method;

import java.util.Scanner;

public class TechNumber {

	public static void main(String[] args) {

		TechNumber tech = new TechNumber();

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number :");//2025
		int num = scan.nextInt();

		if (tech.techNumber(num))
			System.out.println(num + " is Tech Number");
		else
			System.out.println(num + " is Not Tech Number");

	}

	public boolean techNumber(int num) {

		int temp=num,square=0;
		int digit=String.valueOf(num).length();
		
		if(digit%2==0) {
			
			int leftnumber=num%(int)Math.pow(10, digit/2);
			
			int rightnumber=num/(int)Math.pow(10, digit/2);
			
			square=(leftnumber+rightnumber)*(leftnumber+rightnumber);
		}
		else
			return false;
		
		return temp==square;
	}
}
