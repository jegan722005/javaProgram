package method;

import java.util.Scanner;

public class listLeapYear {

	public static void main(String[] args) {
		
		listLeapYear year=new listLeapYear();
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter  leapyear start:");
		int start=scan.nextInt();
		System.out.print("Enter leapyear End:");
		int end=scan.nextInt();
		
		System.out.print("LeapYear-->");
		for(int i=start;i<=end;i++) {
			
			if(year.checkLeapYear(i))
				System.out.println(i+" ");
		}
		
		
	}
	public boolean checkLeapYear(int num) {
		
		if(num%400==0)
			return true;
		else if(num%4==0 && num%100!=0)
			return true;
		else
			return false;
	}
}
