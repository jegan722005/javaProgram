package method;

import java.util.Scanner;

public class MultiplyOfDigit {

	public static void main(String[] args) {
		
		MultiplyOfDigit digit=new MultiplyOfDigit();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number :");
		int num = scan.nextInt();
		
		int multi=1;
		
		while(num>0) {
			int d=num%10;
			multi*=d;
			num/=10;
		}
		System.out.println("Multiply of Digit :"+multi);
	}
}
