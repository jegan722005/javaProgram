package method;

import java.util.Scanner;

public class AddFirstAndLastDigit {

	public static void main(String[] args) {
		
		AddFirstAndLastDigit first=new AddFirstAndLastDigit();
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Number:");
		int num=scan.nextInt();
		
		System.out.println("Add First And Last Digit:"+first.addFirstAndLastDigit(num));
	}
	public int addFirstAndLastDigit(int num) {
		
		int last =num%10;
		while(num>10) 
			num/=10;
		
		return num+last;
	}
}
