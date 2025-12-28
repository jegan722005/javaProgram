package method;

import java.util.Scanner;

public class BuzzNumber {

	//a number is said to Buzz number if it end with 7 or is divisible by 7 is buzzNumber
	public static void main(String[] args) {
		
		BuzzNumber buzz=new BuzzNumber();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number :");
		int num = scan.nextInt();
		
		if(num%10==7 || num%7==0)
			System.out.println(num+" is Buzz Number");
		else 
			System.out.println(num+" is Not Buzz Number");
	}
}
